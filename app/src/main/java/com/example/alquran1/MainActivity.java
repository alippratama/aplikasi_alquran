package com.example.alquran1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton icon_quran,icon_doa,icon_mesjid,icon_kiblat,icon_iqra,icon_bantuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_home);

        icon_quran = (ImageButton)findViewById(R.id.icon_quran);
        icon_quran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),menu_quran.class);
                startActivity(i);
            }
        });
    }
}