package com.internshala.helloworld.gym2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CoachTwo extends AppCompatActivity {
    ListView list2;
    String[] item2={"Cardio","Classes","Machines or Bodyweight","Mainly free weight training","Heavy compound lifts"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list2=(ListView)findViewById(R.id.list2);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(CoachTwo.this,android.R.layout.simple_list_item_1,item2);
        list2.setAdapter(ad);

        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent go=new Intent(CoachTwo.this,CoachThree.class);
                startActivity(go);
            }
        });

    }
}
