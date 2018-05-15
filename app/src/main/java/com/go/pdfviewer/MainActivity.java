package com.go.pdfviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnModul1, btnModul2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnModul1 = (Button) findViewById(R.id.modul1);
        btnModul2 = (Button) findViewById(R.id.modul2);


        btnModul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Modul1.class);
                startActivity(i);
            }
        });

        btnModul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2 = new Intent(MainActivity.this, modul2.class);
                startActivity(i2);
            }
        });
    }


}


