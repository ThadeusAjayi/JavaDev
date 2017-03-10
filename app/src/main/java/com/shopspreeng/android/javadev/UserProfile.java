package com.shopspreeng.android.javadev;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

        Intent intent = getIntent();
        String profileName = intent.getStringExtra("profileName");
        final String profileUrl = intent.getStringExtra("profileUrl");

        mUserName.setText(profileName);
        mUserUrl.setText(profileUrl);

        mUserUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(profileUrl));
                startActivity(browserIntent);
            }
        });

    }
}
