package com.example.amirafwan.amirafwanlab3;

import android.app.Activity;
import android.content.Intent;
import android.media.ImageReader;
import android.os.Bundle;
import android.widget.ImageView;

import static android.widget.ImageView.*;

/**
 * Created by amirafwan on 10/2/17.
 */

public class fullImageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);

        //get intent data
        Intent i = getIntent();

        //selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        ImageView imageView = new ImageView(this);

        imageView = (ImageView) findViewById(R.id.full_image_view);
        ImageView imageViewmageView;
        imageView.setImageResource(imageAdapter.mThumbsId[position]);

    }




}

