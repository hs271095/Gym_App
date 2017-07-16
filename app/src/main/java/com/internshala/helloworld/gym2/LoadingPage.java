package com.internshala.helloworld.gym2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class LoadingPage extends AppCompatActivity {

    RelativeLayout loadpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_page);
        startActivity(new Intent(this, CoachOne.class));
        loadpage=(RelativeLayout)findViewById(R.id.activity_loading_page);
        loadpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go=new Intent(LoadingPage.this,CoachOne.class);
                startActivity(go);
            }
        });
    }
}

