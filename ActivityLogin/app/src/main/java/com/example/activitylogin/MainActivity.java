package com.example.activitylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
        private EditText docUsername, docPassword;
        private final String username = "Avi";
        private final String password = "1234";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            docUsername = findViewById(R.id.editTextTextUsername);
            docPassword = findViewById(R.id.editTextTextUserPassword);

            Button btnLogin = findViewById(R.id.Loginbutton);

            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    String inputUsername = docUsername.getText().toString();
                    String inputPassword = docPassword.getText().toString();

                    if(inputUsername.equals(username) && inputPassword.equals(password)){
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent myIntent = new Intent(MainActivity.this,  DashBoard.class);
                        MainActivity.this.startActivity(myIntent);
                    } else{
                        Toast.makeText(MainActivity.this, "Login Unsuccessful!!!!", Toast.LENGTH_SHORT).show();
                    }
                }
            });


        }
    }

