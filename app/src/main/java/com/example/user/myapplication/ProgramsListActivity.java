package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProgramsListActivity extends AppCompatActivity {
    ListView tutorialList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials_list);
        tutorialList = (ListView)findViewById(R.id.list_item);
        final String [] list = getResources().getStringArray(R.array.programs_list);
        tutorialList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list));
        tutorialList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ProgramsListActivity.this,DetailsActivity.class);
                i.putExtra(DetailsActivity.DETAILS_TEXT,list[position]);
                startActivity(i);
            }
        });
    }
}
