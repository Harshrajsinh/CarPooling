package com.android.cbe.webservice;

import com.android.cbe.ui.login.model.LoginModel;
import com.android.cbe.ui.login.model.LoginResponse;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.util.logging.Level;

import okhttp3.logging.HttpLoggingInterceptor;
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
    public static final  String  url=HTTPConstant.LOGIN_BASE_URL;
    public static CBEServices loginServiceConnection() {
        if (cbeServices == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
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
