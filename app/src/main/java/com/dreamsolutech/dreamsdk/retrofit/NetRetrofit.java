package com.dreamsolutech.dreamsdk.retrofit;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class NetRetrofit {
    public final String BASE_URL_check = "https://dreamsolutech.co.kr/";


    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    private static NetRetrofit ourInstance = new NetRetrofit();

    public static NetRetrofit getInstance() {
        return ourInstance;
    }

    private NetRetrofit() {
    }

    OkHttpClient defaultHttpClient = new OkHttpClient.Builder()
            .connectTimeout(5, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .addInterceptor(interceptor)
            .build();
    Retrofit retrofit_check = new Retrofit.Builder()
            .baseUrl(BASE_URL_check)
            .addConverterFactory(ScalarsConverterFactory.create()) // 파싱등록
            .client(defaultHttpClient)
            .build();
    RetrofitService service_check = retrofit_check.create(RetrofitService.class);

    public RetrofitService getService_check(Activity context) {

        if (!isTimeAutomatic(context)) {
            Toast.makeText(context, "시간설정을 네트워크에서 제공하는 시간으로 설정해 주세요", Toast.LENGTH_SHORT).show();
            context.finish();
            android.os.Process.killProcess(android.os.Process.myPid());
            System.runFinalization();
            System.exit(0);
        }
        return service_check;
    }
    public static boolean isTimeAutomatic(Context c) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            return Settings.Global.getInt(c.getContentResolver(), Settings.Global.AUTO_TIME, 0) == 1;
        } else {
            return Settings.System.getInt(c.getContentResolver(), Settings.System.AUTO_TIME, 0) == 1;
        }
    }
}
