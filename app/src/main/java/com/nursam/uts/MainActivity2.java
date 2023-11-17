package com.nursam.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("data_name");
        String deskripsi = intent.getStringExtra("data_deskripsi");
        int foto = intent.getIntExtra("data_foto", 0);

        TextView nameTextView = findViewById(R.id.textViewNamaFurniture);
        TextView deskripsiTextView = findViewById(R.id.textViewDeskripsiFurniture);
        ImageView fotoTextView = findViewById(R.id.imageViewFurniture);

        nameTextView.setText(name);
        deskripsiTextView.setText(deskripsi);
        fotoTextView.setImageResource(foto);

    }
}