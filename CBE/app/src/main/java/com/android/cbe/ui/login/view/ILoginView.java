package com.android.cbe.ui.login.view;

import com.android.cbe.ui.login.model.LoginModel;
import com.android.cbe.ui.login.model.LoginResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intern.harshrajT on 3/3/2016.
 */
public interface ILoginView {
    public void onLoginResult(List<LoginModel> resultList );
}
