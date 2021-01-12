package com.ogocer.weatherappwithvolley;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button button;
    private TextView tvSehirAdi,tvSicaklik,tvHissedilen,tvMin,tvMax,tvAciklama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        button = findViewById(R.id.button);
        tvAciklama = findViewById(R.id.tvAciklama);
        tvSehirAdi = findViewById(R.id.tvSehirAdi);
        tvSicaklik = findViewById(R.id.tvSicaklik);
        tvMin = findViewById(R.id.tvMin);
        tvMax = findViewById(R.id.tvMax);
        tvHissedilen = findViewById(R.id.tvHissedilen);
        toolbar.setTitle("Weather App");
        setSupportActionBar(toolbar);
    }
}