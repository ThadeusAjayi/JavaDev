package com.shopspreeng.android.javadev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DevActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev);

        final ArrayList<Users> users = UserJson.extractUsers();

        ListView userListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of users
        final UserAdapter adapter = new UserAdapter(this, users);

        // Set the adapter on the {@link ListView}
        // so the git_user_list can be populated in the user interface
        userListView.setAdapter(adapter);

        userListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Users currentUser;
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Find the current users that was clicked on
                currentUser = adapter.getItem(i);

                Intent intent = new Intent(DevActivity.this,UserProfile.class);
                startActivity(intent);


            }
        });


    }
}
