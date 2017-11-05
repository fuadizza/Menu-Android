package com.example.etge.menu_posttestpraktikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_awal,menu);
        return true;
    }

    public void nama_menu(){
        Toast.makeText(this, "Nama Menu Selected", Toast.LENGTH_LONG).show();
        Intent nama_menu_input = new Intent(MainActivity.this,Nama_menu_input.class);
        startActivity(nama_menu_input);
    }

    public void univ_menu(){
        Toast.makeText(this, "Universitan Menu Selected",Toast.LENGTH_LONG).show();
        Intent univ_menu_input = new Intent(MainActivity.this,Univ_menu_input.class);
        startActivity(univ_menu_input);
    }

    public void sosial_media_menu(){
        Toast.makeText(this, "Sosial Media Selected", Toast.LENGTH_LONG).show();
        Intent sosial_media_menu_tampil = new Intent(MainActivity.this,Sosmed_menu.class);
        startActivity(sosial_media_menu_tampil);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.nama_menu:
                nama_menu();
                break;

            case R.id.univ_menu:
                univ_menu();
                break;

            case R.id.sosial_media_menu:
                sosial_media_menu();
                break;


        }return true;

    }
}
