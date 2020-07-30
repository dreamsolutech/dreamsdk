package com.dreamsolutech.dreamsdk.retrofit;

import android.app.Activity;

import com.google.gson.JsonObject;


public class Main_Presenter implements Main_Contract.Presenter, Main_Contract.model.onModelListener {

    Main_Contract.View view;
    Main_Model model;
    Activity activity;
    public Main_Presenter(Main_Contract.View view, Activity activity) {
        this.view = view;
        this.model = new Main_Model();
        this.activity = activity;
        this.model.setContext(activity);
    }
    @Override
    public void onFinished(JsonObject result, String from) {
        view.result(result, from);
    }
    @Override
    public void check_server(JsonObject jsonObject) {
        model.check_server(this, jsonObject);
    }
}
