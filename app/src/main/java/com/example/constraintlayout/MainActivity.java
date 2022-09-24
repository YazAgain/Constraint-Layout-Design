package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Authentication

    String userName="Hem";
    String password="TenTen";
    String otp1 = "123456789";

    Button login;
    EditText user,pass,otp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.ed_enterEmailAddress);
        pass=findViewById(R.id.ed_enterPassword);
        login=findViewById(R.id.bt_signup);
        otp=findViewById(R.id.tx_OTP);
    }

    @Override
    protected void onResume() {
        super.onResume();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usr = user.getText().toString();
                String pw=pass.getText().toString();
                String op=otp.getText().toString();
                boolean ju=otp.equals(otp1);

                if (usr.equals(userName) && pw.equals(password) && op.equals(otp1)){
                    Intent go = new Intent(MainActivity.this,Welcome.class);
                    startActivity(go);
                }else {
                    Toast.makeText(MainActivity.this, "Wrong Username or Password Entered", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}