package com.dreamsolutech.dreamsdk.retrofit;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.widget.Toast;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class NetRetrofit {
    private static Gson gson = new GsonBuilder().setLenient().create();
    public final String BASE_URL = "https://api.gaebongbox.com:8488/";
    public final String BASE_URL_check = "https://dreamsolutech.co.kr/";


    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    //    Interceptor interceptor = new Interceptor() {
//        @Override
//        public Response intercept(Chain chain) throws IOException {
//            String token = (String) Util.getCacheDataForKey(Const.ACCESS_TOKEN);
////            Logger.loge("token  :  "   +  token);
//            if (token == null)token="";
//            Request newRequest;
//            newRequest = chain.request().newBuilder().addHeader("Authorization", token).build();
//            return chain.proceed(newRequest);
//        }
//    };
    private static NetRetrofit ourInstance = new NetRetrofit();

    public static NetRetrofit getInstance() {
        return ourInstance;
    }

    private NetRetrofit() {
    }

    OkHttpClient defaultHttpClient = new OkHttpClient.Builder()
            //.connectionPool(cPool)
            .connectTimeout(5, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .addInterceptor(interceptor)
            .build();

    OkHttpClient multipartClient = new OkHttpClient.Builder()
            //.connectionPool(cPool)
            .connectTimeout(600, TimeUnit.SECONDS)
            .readTimeout(600, TimeUnit.SECONDS)
            .addInterceptor(interceptor)
            .build();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson)) // 파싱등록
            .client(defaultHttpClient)
            .build();
    Retrofit retrofit_check = new Retrofit.Builder()
            .baseUrl(BASE_URL_check)
            .addConverterFactory(ScalarsConverterFactory.create()) // 파싱등록
            .client(defaultHttpClient)
            .build();
    //    Retrofit retrofit_mms = new Retrofit.Builder()
//            .baseUrl(Const.BASE_URL_MMS)
//            .addConverterFactory(GsonConverterFactory.create(gson)) // 파싱등록
//            .client(multipartClient)
//            .build();
//    Retrofit multiRetrofit = new Retrofit.Builder()
//            .baseUrl(Const.BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create(gson)) // 파싱등록
//            .client(multipartClient)
//            .build();
//    Retrofit multiRetrofit_mms = new Retrofit.Builder()
//            .baseUrl(Const.BASE_URL_MMS)
//            .addConverterFactory(GsonConverterFactory.create(gson)) // 파싱등록
//            .client(multipartClient)
//            .build();
    RetrofitService service = retrofit.create(RetrofitService.class);
    RetrofitService service_check = retrofit_check.create(RetrofitService.class);
//    RetrofitService service_mms = retrofit_mms.create(RetrofitService.class);
//    RetrofitService multiService = multiRetrofit.create(RetrofitService.class);
//    RetrofitService multiService_mms = multiRetrofit_mms.create(RetrofitService.class);

    public RetrofitService getService(Activity context) {

        if (!isTimeAutomatic(context)) {
            Toast.makeText(context, "시간설정을 네트워크에서 제공하는 시간으로 설정해 주세요", Toast.LENGTH_SHORT).show();
            context.finish();
            android.os.Process.killProcess(android.os.Process.myPid());
            System.runFinalization();
            System.exit(0);
        }
//        if (CApp.test){
//            return service_dev;
//        }else{
        return service;
//        }

    }

    public RetrofitService getService_check(Activity context) {

        if (!isTimeAutomatic(context)) {
            Toast.makeText(context, "시간설정을 네트워크에서 제공하는 시간으로 설정해 주세요", Toast.LENGTH_SHORT).show();
            context.finish();
            android.os.Process.killProcess(android.os.Process.myPid());
            System.runFinalization();
            System.exit(0);
        }
//        if (CApp.test){
//            return service_dev;
//        }else{
        return service_check;
//        }

    }

    public static boolean isTimeAutomatic(Context c) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            return Settings.Global.getInt(c.getContentResolver(), Settings.Global.AUTO_TIME, 0) == 1;
        } else {
            return Settings.System.getInt(c.getContentResolver(), Settings.System.AUTO_TIME, 0) == 1;
        }
    }

//    public RetrofitService getService_mms() {
//        return service_mms;
//    }

//    public RetrofitService getMultiService() {
//        return multiService;
//    }
//    public RetrofitService getMultiService_mms() {
//        return multiService_mms;
//    }
}
