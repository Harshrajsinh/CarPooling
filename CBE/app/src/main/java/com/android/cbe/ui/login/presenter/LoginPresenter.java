package com.android.cbe.ui.login.presenter;

import com.android.cbe.ui.login.LoginContractor;
import com.android.cbe.ui.login.model.LoginModel;
import com.android.cbe.ui.login.model.LoginRequestModelExample;
import com.android.cbe.ui.login.model.LoginResponse;
import com.android.cbe.webservice.CBEServiceClass;
import com.android.cbe.webservice.CBEServices;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by Intern.harshrajT on 3/3/2016.
 */
public class LoginPresenter implements LoginContractor.ILoginPresenter {
    LoginContractor.ILoginView iLoginView;
    LoginModel loginModel;
    List<LoginModel> loginModelList;

    public LoginPresenter(LoginContractor.ILoginView iLoginView) {
        this.iLoginView = iLoginView;
    }

    @Override
    public void doLogin(String userName, String password) {
        loginModelList=new ArrayList<>();
        CBEServices cbeServices=CBEServiceClass.loginServiceConnection();
        Call<LoginResponse> call=cbeServices.loginResponse(userName);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Response<LoginResponse> response, Retrofit retrofit) {
                if(response.isSuccess()){
                    LoginResponse loginResponse=response.body();
                    loginModelList=loginResponse.getItems();
                    iLoginView.onLoginResult(loginModelList);

                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });


    }

    @Override
    public void doLogin(LoginRequestModelExample loginRequestModelExample) {

    }
}
