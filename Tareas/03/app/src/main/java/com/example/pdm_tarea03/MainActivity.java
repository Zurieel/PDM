package com.example.pdm_tarea03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginbutton;
    TextView register;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.editTextEmailAddress);
        password = findViewById(R.id.editTextPassword);
        loginbutton = findViewById(R.id.buttonLogIn);
        register = findViewById(R.id.textViewRegistro);

        loginbutton.setOnClickListener(view -> {
            intent = new Intent(this, Principal.class);
            startActivity(intent);
        });

        register.setOnClickListener(view -> {
            intent = new Intent(this, Registro.class);
            startActivity(intent);
        });

    }
}