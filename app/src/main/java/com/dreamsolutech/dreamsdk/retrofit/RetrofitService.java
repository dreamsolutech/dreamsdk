package com.dreamsolutech.dreamsdk.retrofit;

import com.google.gson.JsonObject;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RetrofitService {


//    @POST("total_post/write_proc.php")
//    @FormUrlEncoded
//    Call<JsonObject> write_proc(
//            @Field("usr_key") String usr_key
//            ,@Field("app_ver") String app_ver
//            , @Field("app_cd") String app_cd
//            , @Field("dvc_id") String dvc_id
//            , @Field("contents") String contents
//            , @Field("app_use") String app_use
//    );


    @POST("box.txt")
//    @POST("init/intro_cp.box")
//    @FormUrlEncoded
    Call<String> check_server(
    );
    @POST("init/intro.box")
//    @POST("init/intro_cp.box")
    @FormUrlEncoded
    Call<JsonObject> intro(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("main/main_info.box")
    @FormUrlEncoded
    Call<JsonObject> main_info(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/sns_share_view.box")
    @FormUrlEncoded
    Call<JsonObject> sns_share_view(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/sns_share_buy.box")
    @FormUrlEncoded
    Call<JsonObject> sns_share_buy(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("ad/ad_view.box")
    @FormUrlEncoded
    Call<JsonObject> ad_view(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );

    @POST("init/terms.box")
    @FormUrlEncoded
    Call<JsonObject> terms(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("cs/faq.box")
    @FormUrlEncoded
    Call<JsonObject> faq(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("profile/cash_history.box")
    @FormUrlEncoded
    Call<JsonObject> cash_history(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );

    @POST("init/hp_auth_req.box")
    @FormUrlEncoded
    Call<JsonObject> hp_auth_req(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );

    @POST("init/hp_auth_chk.box")
    @FormUrlEncoded
    Call<JsonObject> hp_auth_chk(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("profile/profile.box")
    @FormUrlEncoded
    Call<JsonObject> profile(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("profile/recommend.box")
    @FormUrlEncoded
    Call<JsonObject> recommend(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("profile/recommend_evt.box")
    @FormUrlEncoded
    Call<JsonObject> recommend_evt(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("profile/event_push_chk.box")
    @FormUrlEncoded
    Call<JsonObject> event_push_chk(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("cs/set_info.box")
    @FormUrlEncoded
    Call<JsonObject> set_info(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("profile/member_del.box")
    @FormUrlEncoded
    Call<JsonObject> member_del(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("main/main.box")
    @FormUrlEncoded
    Call<JsonObject> main(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("profile/email_auth_req.box")
    @FormUrlEncoded
    Call<JsonObject> email_auth_req(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("profile/profile_etc_edit.box")
    @FormUrlEncoded
    Call<JsonObject> profile_etc_edit(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("shop/deliver_send.box")
    @FormUrlEncoded
    Call<JsonObject> deliver_send(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/get_free_list.box")
    @FormUrlEncoded
    Call<JsonObject> get_free_list(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/list.box")
    @FormUrlEncoded
    Call<JsonObject> arcade_list(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/ad_confirm.box")
    @FormUrlEncoded
    Call<JsonObject> ad_confirm(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/list1.box")
    @FormUrlEncoded
    Call<JsonObject> list1(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/srch_list.box")
    @FormUrlEncoded
    Call<JsonObject> srch_list(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/list2.box")
    @FormUrlEncoded
    Call<JsonObject> list2(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/mark_proc.box")
    @FormUrlEncoded
    Call<JsonObject> mark_proc(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/keyword_proc.box")
    @FormUrlEncoded
    Call<JsonObject> keyword_proc(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/keyword_usr_list.box")
    @FormUrlEncoded
    Call<JsonObject> keyword_usr_list(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/mark_list.box")
    @FormUrlEncoded
    Call<JsonObject> mark_list(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/keyword_list.box")
    @FormUrlEncoded
    Call<JsonObject> keyword_list(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("hotdeal/list_view.box")
    @FormUrlEncoded
    Call<JsonObject> list_view(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("bootpay/sponsorship.box")
    @FormUrlEncoded
    Call<JsonObject> sponsorship(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("profile/email_auth_chk.box")
    @FormUrlEncoded
    Call<JsonObject> email_auth_chk(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("board/board_list.box")
    @FormUrlEncoded
    Call<JsonObject> board_list(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("cs/cs_board_list.box")
    @FormUrlEncoded
    Call<JsonObject> cs_board_list(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("shop/shopping_list.box")
    @FormUrlEncoded
    Call<JsonObject> shopping_list(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("shop/shopping_view.box")
    @FormUrlEncoded
    Call<JsonObject> shopping_view(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("shop/shopping_buy.box")
    @FormUrlEncoded
    Call<JsonObject> shopping_buy(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("open/box_open.box")
    @FormUrlEncoded
    Call<JsonObject> box_open(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("open/main_open.box")
    @FormUrlEncoded
    Call<JsonObject> main_open(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("sub_enter/sub_enter.box")
    @FormUrlEncoded
    Call<JsonObject> sub_enter(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("sub_enter/main_enter.box")
    @FormUrlEncoded
    Call<JsonObject> main_enter(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/quiz_a.box")
    @FormUrlEncoded
    Call<JsonObject> quiz_a(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/quiz_q.box")
    @FormUrlEncoded
    Call<JsonObject> quiz_q(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/quiz_c.box")
    @FormUrlEncoded
    Call<JsonObject> quiz_c(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("pilot/pilot.box")
    @FormUrlEncoded
    Call<JsonObject> pilot(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("pilot/pilot_enter.box")
    @FormUrlEncoded
    Call<JsonObject> pilot_enter(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/maxnum_enter.box")
    @FormUrlEncoded
    Call<JsonObject> maxnum_enter(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/cococo_enter.box")
    @FormUrlEncoded
    Call<JsonObject> cococo_enter(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/cococo_start.box")
    @FormUrlEncoded
    Call<JsonObject> cococo_start(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/cococo_rst.box")
    @FormUrlEncoded
    Call<JsonObject> cococo_rst(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/maxnum_rst.box")
    @FormUrlEncoded
    Call<JsonObject> maxnum_rst(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("arcade/maxnum_start.box")
    @FormUrlEncoded
    Call<JsonObject> maxnum_start(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("ad/ad_offerwall_view.box")
    @FormUrlEncoded
    Call<JsonObject> ad_offerwall_viewbox(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("ad/ad_offerwall.box")
    @FormUrlEncoded
    Call<JsonObject> ad_offerwall(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("ad/ad_reward_admob.box")
    @FormUrlEncoded
    Call<JsonObject> ad_reward_admob(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("ad/ad_sub_event_reward_admob.box")
    @FormUrlEncoded
    Call<JsonObject> ad_sub_event_reward_admob(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("profile/my_inventory.box")
    @FormUrlEncoded
    Call<JsonObject> my_inventory(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("shop/shopping_send.box")
    @FormUrlEncoded
    Call<JsonObject> shopping_send(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("board/board_view.box")
    @FormUrlEncoded
    Call<JsonObject> board_view(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("board/comment_write.box")
    @FormUrlEncoded
    Call<JsonObject> comment_write(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("board/comment_delete.box")
    @FormUrlEncoded
    Call<JsonObject> comment_delete(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );
    @POST("board/board_delete.box")
    @FormUrlEncoded
    Call<JsonObject> board_delete(
            @Field("usr_key") String usr_key
            , @Field("app_ver") String app_ver
            , @Field("app_cd") String app_cd
            , @Field("dvc_id") String dvc_id
            , @Field("box_req") String box_req
    );

    @Multipart
    @POST("/board/board_write.box")
    Call<JsonObject> board_write(
            @Part MultipartBody.Part usr_key
            , @Part MultipartBody.Part app_ver
            , @Part MultipartBody.Part app_cd
            , @Part MultipartBody.Part dvc_id
            , @Part MultipartBody.Part box_req
            , @Part MultipartBody.Part img_file
    );
    @Multipart
    @POST("cs/cs_board_write.box")
    Call<JsonObject> cs_board_write(
            @Part MultipartBody.Part usr_key
            , @Part MultipartBody.Part app_ver
            , @Part MultipartBody.Part app_cd
            , @Part MultipartBody.Part dvc_id
            , @Part MultipartBody.Part box_req
            , @Part MultipartBody.Part img_file
    );
    @Multipart
    @POST("/board/board_edit.box")
    Call<JsonObject> board_edit(
            @Part MultipartBody.Part usr_key
            , @Part MultipartBody.Part app_ver
            , @Part MultipartBody.Part app_cd
            , @Part MultipartBody.Part dvc_id
            , @Part MultipartBody.Part box_req
            , @Part MultipartBody.Part img_file
    );
    @Multipart
//    @POST("join/join_req.box")
    @POST("join/join_req.box")
    Call<JsonObject> join_req(
            @Part MultipartBody.Part usr_key
            , @Part MultipartBody.Part app_ver
            , @Part MultipartBody.Part app_cd
            , @Part MultipartBody.Part dvc_id
            , @Part MultipartBody.Part box_req
            , @Part MultipartBody.Part img_file
    );
    @Multipart
    @POST("profile/profile_edit.box")
    Call<JsonObject> profile_edit(
            @Part MultipartBody.Part usr_key
            , @Part MultipartBody.Part app_ver
            , @Part MultipartBody.Part app_cd
            , @Part MultipartBody.Part dvc_id
            , @Part MultipartBody.Part box_req
            , @Part MultipartBody.Part img_file
    );


    //    @POST("/total_post/write_proc.php")
//    @Multipart
//    @POST("/total_post/post_reg.in")
//    Call<JsonObject> write_proc(
//            @Part MultipartBody.Part usr_key
//            , @Part MultipartBody.Part app_cd
//            , @Part MultipartBody.Part dvc_id
//            , @Part ArrayList<MultipartBody.Part> image_files
//            , @Part MultipartBody.Part mov_files
//            , @Part MultipartBody.Part title
//            , @Part MultipartBody.Part contents
//            , @Part MultipartBody.Part sns_list
//            , @Part MultipartBody.Part auth
//            , @Part MultipartBody.Part bandToken
//            , @Part MultipartBody.Part ctoken
//            , @Part MultipartBody.Part btoken
//    );

}
