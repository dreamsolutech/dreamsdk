package com.dreamsolutech.dreamsdk.retrofit;

import com.google.gson.JsonObject;

public interface Main_Contract {

    interface model {
        interface onModelListener {
            void onFinished(JsonObject Sring, String from);
        }

        void check_server(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
    }

    interface View {
        void result(JsonObject result, String from);
    }

    interface Presenter {
        void check_server(JsonObject jsonObject);
    }

}
