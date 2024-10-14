package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

    public void deschide(View view){
        Intent it = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(it);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("activitate", "E aici");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("activitate", "W aici");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activitate", "I aici");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("activitate", "debugging");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("activitate", "verbose here");
    }
}


