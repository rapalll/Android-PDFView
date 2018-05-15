package com.go.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class modul2 extends AppCompatActivity {

    PDFView modul2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul2);

        modul2 = (PDFView) findViewById(R.id.modul2);

        modul2.fromAsset("praktek.pdf").load();
    }
}
