package com.internshala.helloworld.gym2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CoachThree extends AppCompatActivity {
    ListView list3;
    String[] item3={"Rather weak","I have no trouble taking my groceries up two flights of stairs","I can do atleast 20 clean kne-pushups","I can do atleast 40 clean kne-pushups","I can deadlift atleast 7kg once"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list3=(ListView)findViewById(R.id.list3);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(CoachThree.this,android.R.layout.simple_list_item_1,item3);
        list3.setAdapter(ad);

        list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent go=new Intent(CoachThree.this,CoachTwo.class);
                startActivity(go);
            }
        });

    }
}

