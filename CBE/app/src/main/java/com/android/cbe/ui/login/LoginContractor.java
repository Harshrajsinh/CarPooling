package com.android.cbe.ui.login;

import com.android.cbe.ui.login.model.LoginModel;
import com.android.cbe.ui.login.model.LoginModelExample;
import com.android.cbe.ui.login.model.LoginRequestModelExample;

import java.util.List;

/**
 * Created by Intern.harshrajT on 3/4/2016.
 */
public class LoginContractor {

    public interface ILoginView{
        public void onLoginResult(List<LoginModel> resultList );

        public void onLoginResultExample(LoginModelExample loginModelExample);

    }

    public interface ILoginPresenter{
        void doLogin(String userName,String password);
        void doLogin(LoginRequestModelExample loginRequestModelExample);
    }
}
