package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button orderButton = findViewById(R.id.orderButton);

        orderButton.setOnClickListener(v -> {
            Toast.makeText(
                    MainActivity.this,
                    "Order placed successfully!",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }

}