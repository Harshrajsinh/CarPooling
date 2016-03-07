package com.android.cbe.ui.login.presenter;

import com.android.cbe.ui.login.LoginContractor;
import com.android.cbe.ui.login.model.LoginModelExample;
import com.android.cbe.ui.login.model.LoginRequestModelExample;
import com.android.cbe.webservice.CBEServiceClass;
import com.android.cbe.webservice.CBEServices;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by Intern.harshrajT on 3/4/2016.
 */
public class LoginPresenterExample implements LoginContractor.ILoginPresenter {

    LoginContractor.ILoginView iLoginViewExample;
    LoginModelExample loginModelExample;


    public LoginPresenterExample(LoginContractor.ILoginView iLoginViewExample) {
        this.iLoginViewExample = iLoginViewExample;
    }

    @Override
    public void doLogin(String userName, String password) {

    }

    @Override
    public void doLogin(LoginRequestModelExample loginRequestModelExample) {
        CBEServices cbeServicesexample= CBEServiceClass.loginServiceConnection();
        Call<LoginModelExample> call=cbeServicesexample.loginModelExample(loginRequestModelExample);
        call.enqueue(new Callback<LoginModelExample>() {
            @Override
            public void onResponse(Response<LoginModelExample> response, Retrofit retrofit) {
                if(response.isSuccess()){
                    loginModelExample=response.body();
                    iLoginViewExample.onLoginResultExample(loginModelExample);
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });


    }
}
