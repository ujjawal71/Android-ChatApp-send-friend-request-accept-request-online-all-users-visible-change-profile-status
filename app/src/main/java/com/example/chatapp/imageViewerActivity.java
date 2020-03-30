package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class imageViewerActivity extends AppCompatActivity {

    private ImageView imageView;
    private String imageUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);


        imageView =findViewById(R.id.ImageView_image);
        imageUrl=getIntent().getStringExtra("url");

        Picasso.get().load(imageUrl).into(imageView);

    }
}
