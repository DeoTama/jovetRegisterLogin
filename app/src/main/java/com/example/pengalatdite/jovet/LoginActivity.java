package com.example.pengalatdite.jovet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button Login_button;
    EditText password_text, username_text;
    TextView register_here;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        password_text = (EditText) findViewById(R.id.password_text);
        username_text = (EditText) findViewById(R.id.username_text);
        Login_button = (Button) findViewById(R.id.login_button);
        register_here = (TextView) findViewById(R.id.register_here);

        Login_button.setOnClickListener(this);
        register_here.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.login_button:

                startActivity(new Intent(this, MainActivity.class));

                break;

            case R.id.register_here:

                startActivity(new Intent(this, RegisterActivity.class));

                break;

        }


    }
}


