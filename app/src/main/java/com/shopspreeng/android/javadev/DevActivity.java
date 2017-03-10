package com.shopspreeng.android.javadev;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.shopspreeng.android.javadev.R.string.url;

public class DevActivity extends AppCompatActivity {

    static ListView userListView = null;
    UserAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev);

        UserAsyncTask task = new UserAsyncTask();
        task.execute();

    }


    private static final String USERS_REQUEST_URL = "https://api.github.com/search/users?q=location:lagos+language:java";


    private String readFromStream(InputStream inputStream) throws IOException {
        StringBuilder output = new StringBuilder();
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null) {
                output.append(line);
                line = reader.readLine();
            }
        }
        return output.toString();
    }

    private String makeHttpRequest(URL url) throws IOException {
        String jsonResponse = "";
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(10000 /* milliseconds */);
            urlConnection.setConnectTimeout(15000 /* milliseconds */);
            urlConnection.connect();
            inputStream = urlConnection.getInputStream();
            jsonResponse = readFromStream(inputStream);
        } catch (IOException e) {
            // TODO: Handle the exception
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (inputStream != null) {
                // function must handle java.io.IOException here
                inputStream.close();
            }
        }
        return jsonResponse;
    }

    public static Drawable LoadImageFromWebOperations(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            return d;
        } catch (Exception e) {
            return null;
        }

    }

    private static ArrayList<Users> extractUsersFromJson(String userJSON) {

        ArrayList<Users> userArrayList = new ArrayList<>();

        try {

            JSONObject JSONroot = new JSONObject(userJSON);

            JSONArray itemsArray = JSONroot.getJSONArray("items");

            for (int i = 0; i < itemsArray.length(); i++) {

                JSONObject itemsObject = itemsArray.getJSONObject(i);

                String username = itemsObject.getString("login");

                Drawable userImg = LoadImageFromWebOperations(itemsObject.getString("avatar_url"));

                String url = itemsObject.getString("html_url");

                Users javaDev = new Users(username, userImg, url);
                userArrayList.add(javaDev);

            }
        } catch (JSONException e) {
            Log.e("JSON extraction", "Problem parsing the earthquake JSON results", e);
        }

        Log.v("userArrayList size", ""+userArrayList.size());
        return userArrayList;
    }

    private class UserAsyncTask extends AsyncTask<URL, Void, ArrayList<Users>>{

        @Override
        protected ArrayList<Users> doInBackground(URL... urls) {
            // Create URL object
            URL url = createUrl(USERS_REQUEST_URL);

            // Perform HTTP request to the URL and receive a JSON response back
            String jsonResponse = "";
            try {
                jsonResponse = makeHttpRequest(url);
            } catch (IOException e) {
                // TODO Handle the IOException
            }

            // Extract relevant fields from the JSON response and create an {@link Event} object
            ArrayList<Users> user = extractUsersFromJson(jsonResponse);
            Log.v("compare to UAL", ""+user.size());

            // Return the {@link Event} object as the result fo the {@link TsunamiAsyncTask}
            return user;
        }

        /**
         * Update the screen with the given earthquake (which was the result of the
         * {@link UserAsyncTask}).
*/
        @Override
        protected void onPostExecute(ArrayList<Users> userSelect) {
            super.onPostExecute(userSelect);

            final ArrayList<Users> userDisplay = userSelect;

            userListView = (ListView) findViewById(R.id.list);

            // Create a new {@link ArrayAdapter} of users
            adapter = new UserAdapter(DevActivity.this, userDisplay);

            userListView.setAdapter(adapter);

            userListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                Users currentUser;
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    currentUser = adapter.getItem(i);
                    String PNAME = currentUser.getmUser();
              //      String PIMG = currentUser.getmResource();
                    String PURL = currentUser.getmUrl();


                    Intent profileIntent = new Intent(DevActivity.this,UserProfile.class);
                    profileIntent.putExtra("profileName", PNAME);
                  //  profileIntent.putExtra("Image", (BitmapDrawable)PIMG);
                    profileIntent.putExtra("profileUrl", PURL);
                    startActivity(profileIntent);

                }
            });


        }

        /**
         * Returns new URL object from the given string URL.
         */
        private URL createUrl(String stringUrl) {
            URL url = null;
            try {
                url = new URL(stringUrl);
            } catch (MalformedURLException exception) {
                Log.e("UrlError", "Error with creating URL", exception);
                return null;
            }
            return url;
        }

    }


}
