package com.shopspreeng.android.javadev;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jayson surface on 09/03/2017.
 */

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.git_user_profile);

        DevActivity user = new DevActivity();

        TextView mUserName = (TextView) findViewById(R.id.m_user_name);
        ImageView mUserImage = (ImageView) findViewById(R.id.m_user_img);
        TextView mUserUrl = (TextView) findViewById(R.id.m_user_url);


    }
}
