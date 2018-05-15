package com.go.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Modul1 extends AppCompatActivity {


    PDFView    modul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul1);

        modul = (PDFView) findViewById(R.id.modul1);

        modul.fromAsset("contoh.pdf").load();
    }
}
