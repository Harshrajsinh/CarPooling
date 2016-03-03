package com.android.cbe.ui.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.cbe.ui.login.model.LoginModel;
import com.android.cbe.ui.login.presenter.LoginPresenter;
import com.android.cbe.ui.login.view.ILoginView;
import com.cbe.android.R;

import java.util.List;


public class CBELoginActivity extends AppCompatActivity implements ILoginView, View.OnClickListener {

    EditText et_userName,et_userPassword;
    Button btn_login;
    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_login);
//        et_userName=(EditText)findViewById(R.id.userName);
//        et_userPassword=(EditText)findViewById(R.id.userPassword);
//        btn_login=(Button)findViewById(R.id.loginBtn);
//        btn_login.setOnClickListener(this);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        loginPresenter=new LoginPresenter(this);
    }



    @Override
    public void onClick(View v) {
//        loginPresenter.doLogin(et_userName.getText().toString(),et_userPassword.getText().toString());

    }

    @Override
    public void onLoginResult(List<LoginModel> resultList) {
//        for(LoginModel loginModel:resultList) {
//            Log.d("asdasdasd","-------------------");
//            Log.d("Name:",loginModel.login);
//        }
    }
}
