package com.dreamsolutech.dreamsdk.retrofit;

import android.app.Activity;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main_Model implements Main_Contract.model {

    private Activity context;

    public void setContext(Activity activity) {
        this.context = activity;
    }

    @Override
    public void check_server(final onModelListener onModelListener, JsonObject jsonObject) {
        Call<String> call_response = NetRetrofit.getInstance().getService_check(context).check_server(
        );
        call_response.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        JsonObject object = new JsonObject();
                        object.addProperty("response", response.body());
                        onModelListener.onFinished(object, "check_server");
                    }
                } else {
                    JsonObject object = new JsonObject();
                    object.addProperty("response", "N");
                    onModelListener.onFinished(object, "check_server");
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                JsonObject object = new JsonObject();
                object.addProperty("response", "N");
                onModelListener.onFinished(object, "check_server");
            }
        });
    }
}
