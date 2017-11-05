 package com.example.etge.menu_posttestpraktikum;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

 public class Sosmed_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosmed_menu);
    }

    public void instagram(View view){

        Uri uri = Uri.parse("https://www.instagram.com/fuadizza/?hl=en");
        Intent share = new Intent(Intent.ACTION_VIEW, uri);
        share.setPackage("com.instagram.android");
        startActivity(share);

    }
}
