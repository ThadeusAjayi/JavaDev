package com.shopspreeng.android.javadev;

/**
 * Created by jayson surface on 09/03/2017.
 */

public class Users {

    private String mUser;

    private String mResource;

    private String mUrl;

    public Users(String user, String resource, String url){
        mUser = user;
        mResource = resource;
        mUrl = url;
    }

    public String getmUser(){
        return mUser;
    }

    public String getmResource(){
        return mResource;
    }

    public String getmUrl(){
        return mUrl;
    }


}
