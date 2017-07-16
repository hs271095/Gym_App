package com.internshala.helloworld.gym2;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CoachOne extends AppCompatActivity {
    ListView list1;
    String[] item1={"Rather weak","I have no trouble taking my groceries up two flights of stairs","I can do atleast 20 clean kne-pushups","I can do atleast 40 clean kne-pushups","I can deadlift atleast 7kg once"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1=(ListView)findViewById(R.id.list1);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(CoachOne.this,android.R.layout.simple_list_item_1,item1);
        list1.setAdapter(ad);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent go=new Intent(CoachOne.this,CoachTwo.class);
                startActivity(go);
            }
        });

    }
}