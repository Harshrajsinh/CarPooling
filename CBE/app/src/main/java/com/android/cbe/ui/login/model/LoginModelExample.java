package com.android.cbe.ui.login.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Intern.harshrajT on 3/4/2016.
 */
public class LoginModelExample {

    @SerializedName("id")
    public String id;

    @SerializedName("name")
    public String name;

    @SerializedName("emailId")
    public String email_Id;

    @SerializedName("age")
    public int age;

    @SerializedName("department")
    public String department;

    @SerializedName("secondaryEmailId")
    public String secondaryEmailId;

    @SerializedName("mobile")
    public String mobile;

    @SerializedName("bloodGroup")
    public String bloodGroup;

    @SerializedName("gender")
    public boolean gender;

    @SerializedName("picPath")
    public String picPath;
}
