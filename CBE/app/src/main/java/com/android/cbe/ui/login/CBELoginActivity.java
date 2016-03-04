package com.android.cbe.ui.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.cbe.ui.login.model.LoginModel;
import com.android.cbe.ui.login.model.LoginModelExample;
import com.android.cbe.ui.login.model.LoginRequestModelExample;
import com.android.cbe.ui.login.presenter.LoginPresenter;
import com.android.cbe.ui.login.presenter.LoginPresenterExample;
import com.cbe.android.R;

import java.util.List;


public class CBELoginActivity extends AppCompatActivity implements LoginContractor.ILoginView, View.OnClickListener {

    EditText et_userName,et_userPassword;
    Button btn_login;
    LoginPresenter loginPresenter;
    LoginPresenterExample loginPresenterExample;
    LoginRequestModelExample loginRequestModelExample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_login);
        et_userName=(EditText)findViewById(R.id.login_user_name);
        et_userPassword=(EditText)findViewById(R.id.login_user_password);
        btn_login=(Button)findViewById(R.id.btnLogin);
        btn_login.setOnClickListener(this);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        loginPresenter=new LoginPresenter(this);
        loginPresenterExample=new LoginPresenterExample(this);
    }



    @Override
    public void onClick(View v) {
        //loginPresenter.doLogin(et_userName.getText().toString(),et_userPassword.getText().toString());
//        Log.d("asdasdasd",et_userName.getText().toString());
//        Log.d("asdasdasdasd", et_userPassword.getText().toString());
        loginRequestModelExample=new LoginRequestModelExample();
        loginRequestModelExample.setPasswoord(et_userPassword.getText().toString());
        loginRequestModelExample.setUserName(et_userName.getText().toString());
        loginPresenterExample.doLogin(loginRequestModelExample);
    }

    @Override
    public void onLoginResult(List<LoginModel> resultList) {
        for(LoginModel loginModel:resultList) {
            Log.d("asdasdasd", "-------------------");
            Log.d("Name:",loginModel.login);
        }
    }

    @Override
    public void onLoginResultExample(LoginModelExample loginModelExample) {
        Log.d("asdasdasd", "-------------------");
        Log.d("Name:",loginModelExample.name);
    }
}
