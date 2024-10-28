package com.example.testsmeinar4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
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

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText width = findViewById(R.id.ETWidth);
                EditText height = findViewById(R.id.ETHeight);
                EditText color = findViewById(R.id.ETColor);
                EditText material = findViewById(R.id.ETMaterial);
                CheckBox isSent = findViewById(R.id.CBIsSent);

                String width_text = width.getText().toString();
                String height_text = height.getText().toString();
                String color_text = color.getText().toString();
                String material_text = material.getText().toString();
                Boolean isSent_flag = isSent.isChecked();

                Toast.makeText(getApplicationContext(), "Width: " + width_text + " height: " + height_text + " color: " + color_text + " material: " + material_text + " Sent: " + isSent_flag, Toast.LENGTH_LONG).show();

            }
        });
    }
}