package com.example.pdm_tarea03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Register extends AppCompatActivity  {

    Button createButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        createButton = findViewById(R.id.buttonCreate);

        createButton.setOnClickListener(view -> {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }
}
