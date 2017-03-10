package com.shopspreeng.android.javadev;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.shopspreeng.android.javadev.DevActivity.LoadImageFromWebOperations;

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

        Bitmap _bitmap = BitmapFactory.decodeByteArray(
                getIntent().getByteArrayExtra("byteArray"),0,getIntent().getByteArrayExtra("byteArray").length);


        mUserName.setText(profileName);
        mUserUrl.setText(profileUrl);
        mUserImage.setImageBitmap(_bitmap);

        mUserUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(profileUrl));
                startActivity(browserIntent);
            }
        });

    }
}
