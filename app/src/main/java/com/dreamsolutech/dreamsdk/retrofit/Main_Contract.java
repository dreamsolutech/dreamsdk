package com.dreamsolutech.dreamsdk.retrofit;

import com.google.gson.JsonObject;

public interface Main_Contract {

    interface model {
        interface onModelListener {
            void onFinished(JsonObject Sring, String from);
//            void onFinished(String Sring, String from);
        }

//        void intro(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void main_info(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void terms(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void hp_auth_req(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void hp_auth_chk(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void profile(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void recommend(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void event_push_chk(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void set_info(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void main(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void faq(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void cash_history(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void keyword_proc(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void email_auth_req(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void email_auth_chk(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void board_list(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void board_view(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void comment_write(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void comment_delete(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void board_delete(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void quiz_a(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void quiz_q(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void sns_share_view(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void quiz_c(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void ad_reward_admob(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void arcade_list(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void my_inventory(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void sponsorship(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void shopping_list(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void shopping_view(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void shopping_buy(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void get_free_list(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void shopping_send(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void box_open(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void pilot(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void list_view(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void pilot_enter(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void sub_enter(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void ad_confirm(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void deliver_send(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void maxnum_enter(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void maxnum_rst(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void maxnum_start(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void list1(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void keyword_list(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void srch_list(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void cococo_start(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void cococo_enter(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void cococo_rst(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void main_open(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void mark_proc(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void keyword_usr_list(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void mark_list(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void ad_view(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void list2(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void profile_etc_edit(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void member_del(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void recommend_evt(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void ad_offerwall_viewbox(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void ad_sub_event_reward_admob(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void ad_offerwall(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void cs_board_list(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void board_write(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void cs_board_write(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void board_edit(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void join_req(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//        void sns_share_buy(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void main_enter(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//
//        void profile_edit(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
        void check_server(Main_Contract.model.onModelListener onModelListener, JsonObject jsonObject);
//        void write_proc(onModelListener onModelListener, JsonObject jsonObject, ArrayList<MultipartBody.Part> image_List, MultipartBody.Part movfilePart);
    }

    interface View {
        void result(JsonObject result, String from);
    }

    interface Presenter {
//        void intro(JsonObject jsonObject);
//
//        void main_info(JsonObject jsonObject);
//
//        void terms(JsonObject jsonObject);
//
//        void hp_auth_req(JsonObject jsonObject);
//
//        void hp_auth_chk(JsonObject jsonObject);
//
//        void list2(JsonObject jsonObject);
//        void sns_share_buy(JsonObject jsonObject);
//
//        void profile(JsonObject jsonObject);
//
//        void recommend(JsonObject jsonObject);
//
//        void event_push_chk(JsonObject jsonObject);
//
//        void mark_list(JsonObject jsonObject);
//
//        void keyword_usr_list(JsonObject jsonObject);
//
//        void email_auth_req(JsonObject jsonObject);
//
//        void email_auth_chk(JsonObject jsonObject);
//
//        void list1(JsonObject jsonObject);
//
//        void mark_proc(JsonObject jsonObject);
//
//        void board_list(JsonObject jsonObject);
//
//        void ad_offerwall(JsonObject jsonObject);
//
//        void keyword_list(JsonObject jsonObject);
//
//        void keyword_proc(JsonObject jsonObject);
//
//        void sns_share_view(JsonObject jsonObject);
//
//        void srch_list(JsonObject jsonObject);
//
//        void ad_offerwall_viewbox(JsonObject jsonObject);
//
//        void board_view(JsonObject jsonObject);
//
//        void comment_write(JsonObject jsonObject);
//
//        void comment_delete(JsonObject jsonObject);
//
//        void board_delete(JsonObject jsonObject);
//
//        void quiz_a(JsonObject jsonObject);
//
//        void quiz_c(JsonObject jsonObject);
//
//        void ad_reward_admob(JsonObject jsonObject);
//
//        void my_inventory(JsonObject jsonObject);
//
//        void arcade_list(JsonObject jsonObject);
//
//        void quiz_q(JsonObject jsonObject);
//
//        void main_enter(JsonObject jsonObject);
//
//        void set_info(JsonObject jsonObject);
//
//        void sponsorship(JsonObject jsonObject);
//
//        void shopping_list(JsonObject jsonObject);
//
//        void list_view(JsonObject jsonObject);
//
//        void shopping_view(JsonObject jsonObject);
//
//        void ad_view(JsonObject jsonObject);
//
//        void shopping_buy(JsonObject jsonObject);
//
//        void get_free_list(JsonObject jsonObject);
//
//        void shopping_send(JsonObject jsonObject);
//
//        void box_open(JsonObject jsonObject);
//
//        void sub_enter(JsonObject jsonObject);
//
//        void ad_confirm(JsonObject jsonObject);
//
//        void deliver_send(JsonObject jsonObject);
//
//        void maxnum_enter(JsonObject jsonObject);
//
//        void pilot_enter(JsonObject jsonObject);
//
//        void maxnum_rst(JsonObject jsonObject);
//
//        void recommend_evt(JsonObject jsonObject);
//
//        void maxnum_start(JsonObject jsonObject);
//
//        void cococo_enter(JsonObject jsonObject);
//
//        void cococo_start(JsonObject jsonObject);
//
//        void cococo_rst(JsonObject jsonObject);
//
//        void pilot(JsonObject jsonObject);
//
//        void profile_etc_edit(JsonObject jsonObject);
//
//        void member_del(JsonObject jsonObject);
//
//        void ad_sub_event_reward_admob(JsonObject jsonObject);
//
//        void main_open(JsonObject jsonObject);
//
//        void cs_board_list(JsonObject jsonObject);
//
//        void cs_board_write(JsonObject jsonObject);
//
//        void board_write(JsonObject jsonObject);
//
//        void main(JsonObject jsonObject);
//
//        void cash_history(JsonObject jsonObject);
//
//        void faq(JsonObject jsonObject);
//
//        void board_edit(JsonObject jsonObject);
//
//        void join_req(JsonObject jsonObject);
//
//        void profile_edit(JsonObject jsonObject);
        void check_server(JsonObject jsonObject);
    }

}
