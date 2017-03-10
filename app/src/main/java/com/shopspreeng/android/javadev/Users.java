package com.shopspreeng.android.javadev;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/**
 * Created by jayson surface on 09/03/2017.
 */

public class Users {

    private String mUser;

    private Bitmap mResource;

    private String mUrl;

    public Users(String user, Bitmap resource, String url){
        mUser = user;
        mResource = resource;
        mUrl = url;
    }

    public String getmUser(){
        return mUser;
    }

    public Bitmap getmResource(){
        return mResource;
    }

    public String getmUrl(){
        return mUrl;
    }


}
