package com.example.ecorecicla;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class inicio_seccion extends AppCompatActivity {

    Button btnGoBack;
    Button btnStatistics;
    Button btnTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_seccion);

        btnGoBack = findViewById(R.id.buttonReturnMain);
        btnStatistics = findViewById(R.id.buttonStatisticsMain);
        btnTips = findViewById(R.id.buttonTipsMain);

        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToLogin = new Intent(inicio_seccion.this, MainActivity.class);
                startActivity(goToLogin);
            }
        });

        btnStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToStatistics = new Intent(inicio_seccion.this, statistics.class);
                startActivity(goToStatistics);
            }
        });

        btnTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTips = new Intent(inicio_seccion.this, tips.class);
                startActivity(goToTips);
            }
        });
    }
}