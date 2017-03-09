package com.shopspreeng.android.javadev;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

import static android.R.attr.resource;

/**
 * Created by jayson surface on 09/03/2017.
 */

public class UserAdapter extends ArrayAdapter<Users> {

    public UserAdapter(Context context,  List<Users> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Users currentUser = getItem(position);
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.git_user_list, parent, false);
        }

        ImageView userImage = (ImageView) listItemView.findViewById(R.id.user_img);

        String imageUrl = currentUser.getmResource();

        userImage.setImageDrawable(LoadImageFromWebOperations(imageUrl));

        TextView userProfile = (TextView) listItemView.findViewById(R.id.user_name);
        userProfile.setText(currentUser.getmUser());

        return listItemView;
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
}
