package cn.jxzhang.campushelper.constant;

import android.util.Log;

/**
 * Created on 2017-03-18 00:37
 * <p>Title:       Urls</p>
 * <p>Description: [Description]</p>
 *
 * @author <a href=zhangjx_dev@163.com>j.x.zhang</a>
 * @version 1.0
 */

public enum Urls {

    IS_ACCOUNT_EXIST("/account/isAccountExist"),

    SIGN_UP("/account/signUp"),

    SIGN_IN("/account/signIn"),

    SEND_VERIFY_CODE("/account/sendVerifyCode"),

    VERIFY_VERIFY_CODE("/account/verifyVerifyCode"),

    GET_ACCOUNT_TYPE("/account/getAccountType"),

    RESET_PASSWORD("/account/resetPassword");

    private final String value;

    private final String REMOTE_SERVICE_URL = "http://192.168.10.105:8080/";

    private final String SERVER_CONTEXT_PATH = "CampusHelper";

    Urls(String value) {
        this.value = value;
    }

    public String value() {
        String url = REMOTE_SERVICE_URL + SERVER_CONTEXT_PATH + this.value;
        Log.d("Request URL : ", url);
        return url;
    }

    @Override
    public String toString() {
        return value();
    }
}
