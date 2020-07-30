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


//    @Override
//    public void write_proc(final onModelListener onModelListener, JsonObject jsonObject, ArrayList<MultipartBody.Part> image_List, MultipartBody.Part movfilePart) {
//
//        MultipartBody.Part usr_key = MultipartBody.Part.createFormData("usr_key", jsonObject.get("usr_key").getAsString()
//        MultipartBody.Part app_cd = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_cd").getAsString());
//        MultipartBody.Part dvc_id = MultipartBody.Part.createFormData("dvc_id", jsonObject.get("dvc_id").getAsString());
//        MultipartBody.Part title = MultipartBody.Part.createFormData("title", jsonObject.get("title").getAsString());
//        MultipartBody.Part contents = MultipartBody.Part.createFormData("contents", jsonObject.get("contents").getAsString());
//        MultipartBody.Part sns_list = MultipartBody.Part.createFormData("sns_list", jsonObject.get("sns_list").getAsJsonArray().toString());
////        MultipartBody.Part image_count = MultipartBody.Part.createFormData("image_count", jsonObject.get("image_count").toString());
////        MultipartBody.Part mov_file_length = MultipartBody.Part.createFormData("mov_file_length", jsonObject.get("mov_file_length").toString());
//        MultipartBody.Part auth = MultipartBody.Part.createFormData("auth", jsonObject.get("auth").getAsString());
//        MultipartBody.Part bandToken = MultipartBody.Part.createFormData("bandToken", jsonObject.get("bandToken").getAsString());
//        MultipartBody.Part ctoken = MultipartBody.Part.createFormData("ctoken", jsonObject.get("ctoken").getAsString());
//        MultipartBody.Part btoken = MultipartBody.Part.createFormData("btoken", jsonObject.get("btoken").getAsString());
////        MultipartBody.Part mov_chg = MultipartBody.Part.createFormData("mov_chg", jsonObject.get("mov_chg").toString());
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).write_proc(
//                usr_key
//                , app_cd
//                , dvc_id
//                , image_List
//                , movfilePart
//                , title
//                , contents
//                , sns_list
//                , auth
//                , bandToken
//                , ctoken
//                , btoken
//        );
//
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
//                    onModelListener.onFinished(response.body()+"", Const.WRITE_PROC);
//                }
//            }
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                Logger.loge("t.getMessage()  :   " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//MultipartBody.Part filePart = MultipartBody.Part.createFormData("fileSrc", file.getName(), RequestBody.create(MediaType.parse("image/*"), file));
//ArrayList<MultipartBody.Part> imageList = new ArrayList<>();

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

//    @Override
//    public void intro(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).intro(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.INTRO);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void main_info(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).main_info(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MAIN_INFO);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//    @Override
//    public void sns_share_view(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).sns_share_view(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.SNS_SHARE_VIEW);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//    @Override
//    public void sns_share_buy(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).sns_share_buy(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.SNS_SHARE_BUY);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void ad_view(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).ad_view(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
//                    Logger.loge("response.body()  :  " + response.body());
////                    onModelListener.onFinished(response.body(), Const.MAIN_INFO);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//
//    @Override
//    public void terms(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).terms(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.TERMS);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void cash_history(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).cash_history(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.CASH_HISTORY);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void faq(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).faq(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.FAQ);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void hp_auth_req(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).hp_auth_req(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.HP_AUTH_REQ);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void hp_auth_chk(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).hp_auth_chk(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.HP_AUTH_CHK);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void profile(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).profile(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.PROFILE);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void recommend(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).recommend(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.RECOMMEND);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void recommend_evt(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).recommend_evt(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.RECOMMEND_EVT);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void event_push_chk(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).event_push_chk(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        Gson gson = new Gson();
//        String box_req = Security.decrypt(jsonObject.get("box_req").getAsString(), Const.AES_KEY);
//        JsonObject object = gson.fromJson(box_req, JsonObject.class);
//        if (object.get("push_yn").getAsString().equals("Y")) {
//            FcmTopicMng.RegistTopic(FcmTopicMng.TOPIC_BOX_EVENT);
//        } else {
//            FcmTopicMng.UnRegistTopic(FcmTopicMng.TOPIC_BOX_EVENT);
//        }
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.EVENT_PUSH_CHK);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void set_info(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).set_info(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.SET_INFO);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void member_del(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).member_del(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MEMBER_DEL);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void main(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).main(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MAIN);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void email_auth_req(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).email_auth_req(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.EMAIL_AUTH_REQ);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void profile_etc_edit(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).profile_etc_edit(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.PROFILE_ETC_EDIT);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void deliver_send(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).deliver_send(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.DELIVER_SEND);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void get_free_list(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).get_free_list(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.GET_FREE_LIST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void arcade_list(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).arcade_list(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.ARCADE_LIST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void ad_confirm(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).ad_confirm(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.AD_CONFIRM);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void list1(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).list1(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.LIST1);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//    @Override
//    public void srch_list(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).srch_list(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.SRCH_LIST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void list2(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).list2(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.LIST2);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void mark_proc(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).mark_proc(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MARK_PROC);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void keyword_proc(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).keyword_proc(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.KEYWORD_PROC);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void keyword_usr_list(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).keyword_usr_list(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.KEYWORD_USR_LIST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void list_view(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).list_view(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.LIST_VIEW);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//    @Override
//    public void mark_list(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).mark_list(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MARK_LIST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//    @Override
//    public void keyword_list(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).keyword_list(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.KEYWORD_LIST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void sponsorship(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).sponsorship(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.SPONSORSHIP);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void email_auth_chk(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).email_auth_chk(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.EMAIL_AUTH_CHK);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void board_list(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).board_list(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.BOARD_LIST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void cs_board_list(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).cs_board_list(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.CS_BOARD_LIST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void shopping_list(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).shopping_list(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.SHOPPING_LIST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void shopping_view(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).shopping_view(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.SHOPPING_VIEW);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void shopping_buy(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).shopping_buy(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.SHOPPING_BUY);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void box_open(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).box_open(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.BOX_OPEN);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void main_open(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).main_open(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MAIN_OPEN);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void sub_enter(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).sub_enter(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.SUB_ENTER);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void main_enter(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).main_enter(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MAIN_ENTER);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//                context.finish();
//            }
//        });
//    }
//
//    @Override
//    public void quiz_a(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).quiz_a(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.QUIZ_A);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void quiz_q(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).quiz_q(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.QUIZ_Q);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void quiz_c(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).quiz_c(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.QUIZ_C);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void pilot(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).pilot(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.PILOT);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void pilot_enter(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).pilot_enter(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.PILOT_ENTER);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void maxnum_enter(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).maxnum_enter(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MAXNUM_ENTER);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void cococo_enter(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).cococo_enter(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.COCOCO_ENTER);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void cococo_rst(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).cococo_rst(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.COCOCO_RST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void cococo_start(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).cococo_start(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.COCOCO_START);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void maxnum_rst(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).maxnum_rst(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MAXNUM_RST);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void maxnum_start(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).maxnum_start(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MAXNUM_START);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void ad_offerwall(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).ad_offerwall(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.AD_OFFERWALL);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void ad_offerwall_viewbox(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).ad_offerwall_viewbox(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.AD_OFFERWALL_VIEWBOX);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void ad_reward_admob(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).ad_reward_admob(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.AD_REWARD_ADMOB);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void ad_sub_event_reward_admob(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).ad_sub_event_reward_admob(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.AD_REWARD_ADMOB);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void my_inventory(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).my_inventory(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.MY_INVENTORY);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void shopping_send(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).shopping_send(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.SHOPPING_SEND);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void board_view(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).board_view(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.BOARD_VIEW);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void comment_write(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).comment_write(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.COMMENT_WRITE);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void comment_delete(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).comment_delete(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.COMMENT_DELETE);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void board_delete(final onModelListener onModelListener, JsonObject jsonObject) {
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).board_delete(
//                jsonObject.get("usr_key").getAsString()
//                , jsonObject.get("app_ver").getAsString()
//                , jsonObject.get("app_cd").getAsString()
//                , jsonObject.get("dvc_id").getAsString()
//                , jsonObject.get("box_req").getAsString()
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.BOARD_DELETE);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//
//    @Override
//    public void board_write(final onModelListener onModelListener, JsonObject jsonObject) {
//        MultipartBody.Part part = null;
//        if (!jsonObject.get("img_file").getAsString().equals("")) {
//            File file = new File(jsonObject.get("img_file").getAsString());
//            Logger.loge("file.length()   :  " + file.length());
//            Logger.loge("file.getName()  : " + file.getName());
//            String extension = file.getName();
//            extension = extension.substring(extension.lastIndexOf(".") + 1, extension.length());
//            part = MultipartBody.Part.createFormData("img_file", file.getName(), RequestBody.create(MediaType.parse("image/" + extension), file));
//        }
//        MultipartBody.Part usr_key = MultipartBody.Part.createFormData("usr_key", jsonObject.get("usr_key").getAsString());
//        MultipartBody.Part app_cd = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_cd").getAsString());
//        MultipartBody.Part app_ver = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_ver").getAsString());
//        MultipartBody.Part dvc_id = MultipartBody.Part.createFormData("dvc_id", jsonObject.get("dvc_id").getAsString());
//        MultipartBody.Part box_req = MultipartBody.Part.createFormData("box_req", jsonObject.get("box_req").getAsString());
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).board_write(
//                usr_key
//                , app_ver
//                , app_cd
//                , dvc_id
//                , box_req
//                , part
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.BOARD_WRITE);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void cs_board_write(final onModelListener onModelListener, JsonObject jsonObject) {
//        MultipartBody.Part part = null;
//        if (!jsonObject.get("img_file").getAsString().equals("")) {
//            File file = new File(jsonObject.get("img_file").getAsString());
//            Logger.loge("file.length()   :  " + file.length());
//            Logger.loge("file.getName()  : " + file.getName());
//            String extension = file.getName();
//            extension = extension.substring(extension.lastIndexOf(".") + 1, extension.length());
//            part = MultipartBody.Part.createFormData("img_file", file.getName(), RequestBody.create(MediaType.parse("image/" + extension), file));
//        }
//        MultipartBody.Part usr_key = MultipartBody.Part.createFormData("usr_key", jsonObject.get("usr_key").getAsString());
//        MultipartBody.Part app_cd = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_cd").getAsString());
//        MultipartBody.Part app_ver = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_ver").getAsString());
//        MultipartBody.Part dvc_id = MultipartBody.Part.createFormData("dvc_id", jsonObject.get("dvc_id").getAsString());
//        MultipartBody.Part box_req = MultipartBody.Part.createFormData("box_req", jsonObject.get("box_req").getAsString());
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).cs_board_write(
//                usr_key
//                , app_ver
//                , app_cd
//                , dvc_id
//                , box_req
//                , part
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.CS_BOARD_WRITE);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void board_edit(final onModelListener onModelListener, JsonObject jsonObject) {
//        MultipartBody.Part part = null;
//        if (!jsonObject.get("img_file").getAsString().equals("")) {
//            File file = new File(jsonObject.get("img_file").getAsString());
//            Logger.loge("file.length()   :  " + file.length());
//            Logger.loge("file.getName()  : " + file.getName());
//            String extension = file.getName();
//            extension = extension.substring(extension.lastIndexOf(".") + 1, extension.length());
//            part = MultipartBody.Part.createFormData("img_file", file.getName(), RequestBody.create(MediaType.parse("image/" + extension), file));
//        }
//        MultipartBody.Part usr_key = MultipartBody.Part.createFormData("usr_key", jsonObject.get("usr_key").getAsString());
//        MultipartBody.Part app_cd = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_cd").getAsString());
//        MultipartBody.Part app_ver = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_ver").getAsString());
//        MultipartBody.Part dvc_id = MultipartBody.Part.createFormData("dvc_id", jsonObject.get("dvc_id").getAsString());
//        MultipartBody.Part box_req = MultipartBody.Part.createFormData("box_req", jsonObject.get("box_req").getAsString());
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).board_edit(
//                usr_key
//                , app_ver
//                , app_cd
//                , dvc_id
//                , box_req
//                , part
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.BOARD_EDIT);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//
//    @Override
//    public void join_req(final onModelListener onModelListener, JsonObject jsonObject) {
//        MultipartBody.Part part = null;
//        if (!jsonObject.get("img_file").getAsString().equals("")) {
//            File file = new File(jsonObject.get("img_file").getAsString());
//            Logger.loge("file.length()   :  " + file.length());
//            Logger.loge("file.getName()  : " + file.getName());
//            String extension = file.getName();
//            extension = extension.substring(extension.lastIndexOf(".") + 1, extension.length());
//            part = MultipartBody.Part.createFormData("img_file", file.getName(), RequestBody.create(MediaType.parse("image/" + extension), file));
//        }
//        MultipartBody.Part usr_key = MultipartBody.Part.createFormData("usr_key", jsonObject.get("usr_key").getAsString());
//        MultipartBody.Part app_cd = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_cd").getAsString());
//        MultipartBody.Part app_ver = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_ver").getAsString());
//        MultipartBody.Part dvc_id = MultipartBody.Part.createFormData("dvc_id", jsonObject.get("dvc_id").getAsString());
//        MultipartBody.Part box_req = MultipartBody.Part.createFormData("box_req", jsonObject.get("box_req").getAsString());
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).join_req(
//                usr_key
//                , app_ver
//                , app_cd
//                , dvc_id
//                , box_req
//                , part
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.JOIN_REQ);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }
//
//    @Override
//    public void profile_edit(final onModelListener onModelListener, JsonObject jsonObject) {
//
//        MultipartBody.Part part = null;
//        if (!jsonObject.get("img_file").getAsString().equals("")) {
//            File file = new File(jsonObject.get("img_file").getAsString());
//            Logger.loge("file.length()   :  " + file.length());
//            Logger.loge("file.getName()  : " + file.getName());
//            String extension = file.getName();
//            extension = extension.substring(extension.lastIndexOf(".") + 1, extension.length());
//            part = MultipartBody.Part.createFormData("img_file", file.getName(), RequestBody.create(MediaType.parse("image/" + extension), file));
//        }
//        MultipartBody.Part usr_key = MultipartBody.Part.createFormData("usr_key", jsonObject.get("usr_key").getAsString());
//        MultipartBody.Part app_cd = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_cd").getAsString());
//        MultipartBody.Part app_ver = MultipartBody.Part.createFormData("app_cd", jsonObject.get("app_ver").getAsString());
//        MultipartBody.Part dvc_id = MultipartBody.Part.createFormData("dvc_id", jsonObject.get("dvc_id").getAsString());
//        MultipartBody.Part box_req = MultipartBody.Part.createFormData("box_req", jsonObject.get("box_req").getAsString());
//        Call<JsonObject> call_response = NetRetrofit.getInstance().getService(context).profile_edit(
//                usr_key
//                , app_ver
//                , app_cd
//                , dvc_id
//                , box_req
//                , part
//        );
//        call_response.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                if (response.body() != null) {
////                    Logger.loge("response.body()  :  " + response.body());
//                    onModelListener.onFinished(response.body(), Const.PROFILE_EDIT);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                CApp.disProgress();
//                Logger.loge("t.getLocalizedMessage()   :  " + t.getLocalizedMessage());
//                Logger.loge("t.toString()   :  " + t.toString());
//                Logger.loge("t.getMessage()   :  " + t.getMessage());
//                Util.showToast(context, "인터넷 연결상태가 좋지않습니다.");
//            }
//        });
//    }


}
