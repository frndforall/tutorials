package com.example.user.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class ProgramsActivity extends AppCompatActivity {

    public static final String DETAILS_TEXT="details_name";
    private String fileName;
    private TextView title,details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        fileName = getIntent().getStringExtra(DETAILS_TEXT);
        title = (TextView)findViewById(R.id.title);
        details = (TextView)findViewById(R.id.details);
        Log.d("Details",fileName);
        title.setText(fileName);
        details.setText(LoadData(fileName+".txt"));

    }


    public String LoadData(String inFile) {
        String tContents = "";

        try {
            InputStream stream = getAssets().open(inFile);

            int size = stream.available();
            byte[] buffer = new byte[size];
            stream.read(buffer);
            stream.close();
            tContents = new String(buffer);
        } catch (IOException e) {
            // Handle exceptions here
        }

        return tContents;

    }
}
