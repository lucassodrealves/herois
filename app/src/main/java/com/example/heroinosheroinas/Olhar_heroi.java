package com.example.heroinosheroinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Olhar_heroi extends AppCompatActivity {
TextView nomeHerois;
ImageView imgHerois;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olhar_heroi);

        nomeHerois = findViewById(R.id.nomeHeroi);
        imgHerois = findViewById(R.id.imgHeroi);


        Intent intent = getIntent();


        String Heroiletras = intent.getStringExtra("nomeHeroi");
        int Heroiordem = intent.getIntExtra("imgHeroi", 0);

        nomeHerois.setText(Heroiletras);
        imgHerois.setImageResource(Heroiordem);

    }

    }
