package com.android.cbe.ui.login.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Intern.harshrajT on 3/2/2016.
 */
public class LoginModel {

    @SerializedName("login")
    public String login;

    @SerializedName("id")
    public double id;

    @SerializedName("avatar_url")
    public String avatar_url;

    @SerializedName("gravatar_id")
    public String gravatar_id;

    @SerializedName("url")
    public String url;

    @SerializedName("html_url")
    public String html_url;

    @SerializedName("followers_url")
    public String followers_url;

    @SerializedName("following_url")
    public String following_url;

    private String gistsUrl;

    @SerializedName("starred_url")
    private String starredUrl;

    @SerializedName("subscriptions_url")
    private String subscriptionsUrl;

    @SerializedName("organizations_url")
    private String organizationsUrl;

    @SerializedName("repos_url")
    private String reposUrl;

    @SerializedName("events_url")
    private String eventsUrl;

    @SerializedName("received_events_url")
    private String receivedEventsUrl;

    @SerializedName("type")
    private String type;

    @SerializedName("site_admin")
    private Boolean siteAdmin;

    @SerializedName("score")
    private Double score;


}
