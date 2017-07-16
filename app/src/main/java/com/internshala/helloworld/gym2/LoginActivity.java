package com.internshala.helloworld.gym2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button FbLogin,EmailLogin;
    EditText EmailText,PwdText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        FbLogin=(Button)findViewById(R.id.fbLogin);
        EmailLogin=(Button)findViewById(R.id.emailLogin);
        EmailText=(EditText)findViewById(R.id.emailText);
        PwdText=(EditText)findViewById(R.id.pwdText);

        FbLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go=new Intent(LoginActivity.this,LoadingPage.class);
                startActivity(go);
            }
        });

        EmailLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go=new Intent(LoginActivity.this,LoadingPage.class);
                startActivity(go);
            }
        });
    }
}
