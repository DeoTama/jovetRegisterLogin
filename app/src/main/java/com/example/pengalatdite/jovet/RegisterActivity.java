package com.example.pengalatdite.jovet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Deotama on 5/28/2018.
 */

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    Button register_button;
    EditText nameRegister, emailRegister, usernameRegister, passwordRegister,webRegister;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameRegister = (EditText) findViewById(R.id.nameRegister);
        emailRegister = (EditText) findViewById(R.id.emailRegister);
        usernameRegister = (EditText) findViewById(R.id.usernameRegister);
        passwordRegister = (EditText) findViewById(R.id.passwordRegister);
        webRegister = (EditText) findViewById(R.id.webRegister);
        register_button = (Button) findViewById(R.id.register_button);

        register_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.register_button:


                break;

            case R.id.register_user:


                break;

        }


    }
}
