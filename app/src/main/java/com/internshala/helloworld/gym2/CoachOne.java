package com.internshala.helloworld.gym2;

import android.app.ListActivity;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class CoachOne extends AppCompatActivity {
    ListView list1;
    String[] item1={"Rather weak","I have no trouble taking my groceries up two flights of stairs","I can do atleast 20 clean kne-pushups","I can do atleast 40 clean kne-pushups","I can deadlift atleast 7kg once"};
    ConstraintLayout ll;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach_one1);
        list1=(ListView)findViewById(R.id.list1);
        ll=(ConstraintLayout) findViewById(R.id.activity_coach_one);
        iv=(ImageView)findViewById(R.id.imageView4);
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setVisibility(View.GONE);
            }
        });
        ArrayAdapter<String> ad=new ArrayAdapter<String>(CoachOne.this,R.layout.items,item1);
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