package com.example.seminar3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void MainActivity2(View view){
        Intent it = new Intent(this, MainActivity2.class);
        it.putExtra("text", "acesta este un text trimis din prima activitate");
        //puExtra é uma forma de enviar valores com chaves para ooutras atividades que
        // estão no mesmo contexto, por isso e segunda atvidade tem acesso usando o metodo getExtra
        it.putExtra("Numar 1:", 10);
        it.putExtra("Numar 2:", 20);
        startActivity(it);
    }

}