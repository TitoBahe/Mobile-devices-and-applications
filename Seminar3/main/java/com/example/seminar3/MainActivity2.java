package com.example.seminar3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent it = getIntent(); //todas as atividades são criados pelo sistema por meio de Intents
        String text = it.getStringExtra("text"); //chave usada no MainActivity.java
        int valoare1 = it.getIntExtra("Numar 1:", 0);
        int valoare2 = it.getIntExtra("Numar 2:", 0);
        Toast.makeText(this, "Suma este:"+(valoare1+valoare2), Toast.LENGTH_LONG).show();
    }
    
    public void MainActivity3(View view){
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
}