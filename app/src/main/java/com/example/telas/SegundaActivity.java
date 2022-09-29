package com.example.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView secondActivityTitle;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        secondActivityTitle = findViewById(R.id.secondActivityTitle);
        name = getIntent().getStringExtra("name");

        secondActivityTitle.setText("Olá, " + name);
    }
}