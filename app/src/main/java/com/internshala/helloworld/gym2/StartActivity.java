package com.internshala.helloworld.gym2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    Button FbButton, EmailButton;
    TextView TextTerms,TextPrivacy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        FbButton=(Button)findViewById(R.id.fbButton);
        EmailButton=(Button)findViewById(R.id.emailButton);
        TextTerms=(TextView)findViewById(R.id.textTerms);
        TextPrivacy=(TextView)findViewById(R.id.textPrivacy);

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
