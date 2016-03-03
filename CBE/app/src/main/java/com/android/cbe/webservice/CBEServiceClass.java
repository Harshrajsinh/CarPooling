package com.android.cbe.webservice;

import com.android.cbe.ui.login.model.LoginModel;
import com.android.cbe.ui.login.model.LoginResponse;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import java.io.IOException;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Intern.harshrajT on 3/2/2016.
 */
public class CBEServiceClass {
    static CBEServices cbeServices;
    public static final  String  url="https://api.github.com";
    public static CBEServices getList() {
        if (cbeServices == null) {
            OkHttpClient okHttpClient = new OkHttpClient();
            okHttpClient.interceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response response = chain.proceed(chain.request());
                    return response;
                }
            });
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(url)
                    .build();

            cbeServices = retrofit.create(CBEServices.class);
        }
        return cbeServices;
    }



}
