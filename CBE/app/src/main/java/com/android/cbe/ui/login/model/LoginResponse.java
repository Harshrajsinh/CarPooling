package com.android.cbe.ui.login.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intern.harshrajT on 3/2/2016.
 */
public class LoginResponse {
    @SerializedName("items")
    private List<LoginModel> items = new ArrayList<>();
    public List<LoginModel> getItems() {
        return items;
    }
//    public void setItems(List<LoginModel> items) {
//        this.items = items;
//    }

}
