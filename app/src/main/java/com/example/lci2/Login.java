package com.example.lci2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText editText,editText3;
    Button  button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText = findViewById(R.id.editText);
        editText3 = findViewById(R.id.editText3);

        button = findViewById(R.id.button);


        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email,pass;

                email = editText.getText().toString();
                pass  = editText3.getText().toString();

                if (email.equals(""))
                {

                   Toast.makeText(Login.this,"Email Required",Toast.LENGTH_SHORT).show();
                }
                else if(pass.equals("")){
                    Toast.makeText(Login.this,"Password Required",Toast.LENGTH_SHORT).show();
                }
                else{
                    //authentication
                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this,SignUp.class);
                startActivity(i);
                finish();

            }
        });

        }
    }

