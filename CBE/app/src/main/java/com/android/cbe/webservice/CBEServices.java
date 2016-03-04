package com.android.cbe.webservice;

import android.content.Context;

import com.android.cbe.ui.login.model.LoginModel;
import com.android.cbe.ui.login.model.LoginModelExample;
import com.android.cbe.ui.login.model.LoginRequestModelExample;
import com.android.cbe.ui.login.model.LoginResponse;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Intern.harshrajT on 3/2/2016.
 */
public interface CBEServices {
    @GET(HTTPConstant.LOGIN_URL)
    Call<LoginResponse> loginResponse (@Query("q") String name);

    @GET(HTTPConstant.LOGIN_URL1)
    Call<LoginModelExample> loginResponseExample(@Query("username") String username,@Query("password") String password);

    @GET(HTTPConstant.LOGIN_URL1)
    Call<LoginModelExample> loginModelExample(@Body LoginRequestModelExample modelExample);
}
