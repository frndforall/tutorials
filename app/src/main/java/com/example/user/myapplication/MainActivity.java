package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tutorials).setOnClickListener(this);
        findViewById(R.id.programs).setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.tutorials){
            startActivity(new Intent(this,TutorialsListActivity.class));
        } else if (v.getId() == R.id.programs){
            startActivity(new Intent(this,ProgramsListActivity.class));
        }

    }
}
