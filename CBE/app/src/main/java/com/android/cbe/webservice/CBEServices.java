package com.android.cbe.webservice;

import android.content.Context;

import com.android.cbe.ui.login.model.LoginModel;
import com.android.cbe.ui.login.model.LoginResponse;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Intern.harshrajT on 3/2/2016.
 */
public interface CBEServices {
    @GET("/search/users")
    Call<LoginResponse> listResp (@Query("q") String name);
}
