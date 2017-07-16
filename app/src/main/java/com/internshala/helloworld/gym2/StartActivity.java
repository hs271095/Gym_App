package com.internshala.helloworld.gym2;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {

    Button FbButton, EmailButton,emb;
    TextView TextTerms,TextPrivacy;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start2);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        List<String> categories = new ArrayList<String>();
        categories.add("Male");
        categories.add("Female");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        linearLayout=(LinearLayout)findViewById(R.id.linearLayout2);
        emb=(Button)findViewById(R.id.emailButton2);
        FbButton=(Button)findViewById(R.id.fbButton2);
        TextTerms=(TextView)findViewById(R.id.textTerms);
        TextPrivacy=(TextView)findViewById(R.id.textPrivacy);
        emb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setVisibility(View.VISIBLE);
                emb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent go= new Intent(StartActivity.this,CoachOne.class);
                        startActivity(go);
                    }
                });


            }
        });

        FbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent web=new Intent();
                web.setAction(Intent.ACTION_VIEW);
                web.setData(Uri.parse("http://www.facebook.com"));
                startActivity(web);
            }
        });

        TextTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent web=new Intent();
                web.setAction(Intent.ACTION_VIEW);
                web.setData(Uri.parse("www.freeletics.com/en/pages/terms"));
                startActivity(web);

            }
        });

        TextPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent web=new Intent();
                web.setAction(Intent.ACTION_VIEW);
                web.setData(Uri.parse("www.freeletics.com/en/pages/privacy"));
                startActivity(web);

            }
        });
    }
}
