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
//        CApp.disProgress();
        view.result(result, from);
    }
//    @Override
//    public void sns_share_view(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.sns_share_view(this, jsonObject);
//    }
//    @Override
//    public void sns_share_buy(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.sns_share_buy(this, jsonObject);
//    }
//    @Override
//    public void main_info(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.main_info(this, jsonObject);
//    }
//    @Override
//    public void cash_history(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.cash_history(this, jsonObject);
//    }
//    @Override
//    public void faq(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.faq(this, jsonObject);
//    }
//    @Override
//    public void profile(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.profile(this, jsonObject);
//    }
//    @Override
//    public void recommend_evt(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.recommend_evt(this, jsonObject);
//    }
//    @Override
//    public void recommend(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.recommend(this, jsonObject);
//    }
//    @Override
//    public void event_push_chk(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.event_push_chk(this, jsonObject);
//    }
//    @Override
//    public void set_info(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.set_info(this, jsonObject);
//    }
//    @Override
//    public void member_del(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.member_del(this, jsonObject);
//    }
//
//    @Override
//    public void main(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.main(this, jsonObject);
//    }
//    @Override
//    public void email_auth_req(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.email_auth_req(this, jsonObject);
//    }
//    @Override
//    public void profile_etc_edit(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.profile_etc_edit(this, jsonObject);
//    }
//    @Override
//    public void deliver_send(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.deliver_send(this, jsonObject);
//    }
//
//    @Override
//    public void get_free_list(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.get_free_list(this, jsonObject);
//    }
//
//    @Override
//    public void arcade_list(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.arcade_list(this, jsonObject);
//    }
//    @Override
//    public void ad_confirm(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.ad_confirm(this, jsonObject);
//    }
//    @Override
//    public void list1(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.list1(this, jsonObject);
//    }
//    @Override
//    public void srch_list(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.srch_list(this, jsonObject);
//    }
//    @Override
//    public void list2(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.list2(this, jsonObject);
//    }
//    @Override
//    public void mark_proc(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.mark_proc(this, jsonObject);
//    }
//    @Override
//    public void keyword_usr_list(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.keyword_usr_list(this, jsonObject);
//    }
//    @Override
//    public void keyword_proc(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.keyword_proc(this, jsonObject);
//    }
//    @Override
//    public void list_view(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.list_view(this, jsonObject);
//    }
//    @Override
//    public void mark_list(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.mark_list(this, jsonObject);
//    }
//    @Override
//    public void keyword_list(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.keyword_list(this, jsonObject);
//    }
//    @Override
//    public void sponsorship(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.sponsorship(this, jsonObject);
//    }
//    @Override
//    public void email_auth_chk(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.email_auth_chk(this, jsonObject);
//    }
//    @Override
//    public void board_list(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.board_list(this, jsonObject);
//    }
//    @Override
//    public void cs_board_list(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.cs_board_list(this, jsonObject);
//    }
//
//    @Override
//    public void shopping_list(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.shopping_list(this, jsonObject);
//    }
//
//    @Override
//    public void shopping_view(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.shopping_view(this, jsonObject);
//    }
//
//    @Override
//    public void shopping_buy(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.shopping_buy(this, jsonObject);
//    }
//
//    @Override
//    public void box_open(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.box_open(this, jsonObject);
//    }
//    @Override
//    public void main_open(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.main_open(this, jsonObject);
//    }
//    @Override
//    public void ad_view(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.ad_view(this, jsonObject);
//    }
//
//    @Override
//    public void sub_enter(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.sub_enter(this, jsonObject);
//    }
//    @Override
//    public void main_enter(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.main_enter(this, jsonObject);
//    }
//
//    @Override
//    public void quiz_a(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.quiz_a(this, jsonObject);
//    }
//
//    public void quiz_q(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.quiz_q(this, jsonObject);
//    }
//
//    public void quiz_c(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.quiz_c(this, jsonObject);
//    }
//    public void pilot(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.pilot(this, jsonObject);
//    }
//    public void pilot_enter(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.pilot_enter(this, jsonObject);
//    }
//    public void maxnum_enter(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.maxnum_enter(this, jsonObject);
//    }
//    public void maxnum_rst(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.maxnum_rst(this, jsonObject);
//    }
//    public void maxnum_start(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.maxnum_start(this, jsonObject);
//    }
//    public void cococo_enter(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.cococo_enter(this, jsonObject);
//    }
//    public void cococo_rst(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.cococo_rst(this, jsonObject);
//    }
//    public void cococo_start(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.cococo_start(this, jsonObject);
//    }
//    public void ad_offerwall(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.ad_offerwall(this, jsonObject);
//    }
//    public void ad_offerwall_viewbox(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.ad_offerwall_viewbox(this, jsonObject);
//    }
//
//    @Override
//    public void ad_reward_admob(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.ad_reward_admob(this, jsonObject);
//    }
//    @Override
//    public void ad_sub_event_reward_admob(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.ad_sub_event_reward_admob(this, jsonObject);
//    }
//
//    @Override
//    public void board_view(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.board_view(this, jsonObject);
//    }
//
//    @Override
//    public void comment_write(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.comment_write(this, jsonObject);
//    }
//
//    @Override
//    public void comment_delete(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.comment_delete(this, jsonObject);
//    }
//
//    @Override
//    public void board_delete(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.board_delete(this, jsonObject);
//    }
//    @Override
//    public void board_write(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.board_write(this, jsonObject);
//    }
//    @Override
//    public void cs_board_write(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.cs_board_write(this, jsonObject);
//    }
//
//    @Override
//    public void board_edit(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.board_edit(this, jsonObject);
//    }
//
//    @Override
//    public void my_inventory(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.my_inventory(this, jsonObject);
//    }
//
//    @Override
//    public void shopping_send(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.shopping_send(this, jsonObject);
//    }
//    @Override
//    public void profile_edit(JsonObject jsonObject) {
//        if (jsonObject.get("usr_key").equals("0@0"))return;
//        model.profile_edit(this, jsonObject);
//    }
//
//    @Override
//    public void join_req(JsonObject jsonObject) {
//        model.join_req(this, jsonObject);
//    }
//    @Override
//    public void terms(JsonObject jsonObject) {
//        model.terms(this, jsonObject);
//    }
//    @Override
//    public void hp_auth_req(JsonObject jsonObject) {
//        model.hp_auth_req(this, jsonObject);
//    }
//
//    @Override
//    public void hp_auth_chk(JsonObject jsonObject) {
//        model.hp_auth_chk(this, jsonObject);
//    }
//    @Override
//    public void intro(JsonObject jsonObject) {
//        model.intro(this, jsonObject);
//    }
    @Override
    public void check_server(JsonObject jsonObject) {
        model.check_server(this, jsonObject);
    }
}
