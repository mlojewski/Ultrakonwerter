package pl.madebykameleon.ultrakonwerter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ToEuroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_euro);
        EditText wpis = findViewById(R.id.wpisText);

        final Button lbsToKg = findViewById(R.id.lbsToKgBtn);
        lbsToKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis * 0.4535);
                wyswietlanie.setText(wynik+"");
                lbsToKg.setText(R.string.done);
            }
        });

        final Button ozToGram = findViewById(R.id.ozToGramBtn);
        ozToGram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis / 0.0352);
                wyswietlanie.setText(wynik+"");
                ozToGram.setText(R.string.done);
            }
        });

        final Button stoneToKg = findViewById(R.id.stoneToKg);
        stoneToKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis * 6.3502);
                wyswietlanie.setText(wynik+"");
                stoneToKg.setText(R.string.done);
            }
        });

        final Button farToCels = findViewById(R.id.farToCelsBtn);
        farToCels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = ((wpis - 32)/1.8 );
                wyswietanie.setText(wynik+"");
                farToCels.setText(R.string.done);
            }
        });

        final Button galToLit = findViewById(R.id.galToLitBtn);
        galToLit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis * 3.7854);
                wyswietlanie.setText(wynik+"");
                galToLit.setText(R.string.done);
            }
        });

        final Button foot2ToM2 = findViewById(R.id.foot2ToM2Btn);
        foot2ToM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis/10.764);
                wyswietlanie.setText(wynik+"");
                foot2ToM2.setText(R.string.done);
            }
        });

        final Button mileToKm = findViewById(R.id.milToKmBtn);
        mileToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis*1.6093);
                wyswietlanie.setText(wynik+"");
                mileToKm.setText(R.string.done);
            }
        });

        final Button yardToM = findViewById(R.id.ydToMBtn);
        yardToM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis*0.9144);
                wyswietlanie.setText(wynik+"");
                yardToM.setText(R.string.done);
            }
        });

        final Button inchToCm = findViewById(R.id.inchToCmBtn);
        inchToCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis*2.54);
                wyswietlanie.setText(wynik+"");
                inchToCm.setText(R.string.done);
            }
        });

        FloatingActionButton fab =  findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(home);
            }
        });
    }
    public void reset (View v){
        TextView result = findViewById(R.id.wynik);
        result.setText(R.string.result);
        Button convertButton = findViewById(R.id.stoneToKg);
        convertButton.setText(R.string.st_to_kg);
        Button convertButton1 = findViewById(R.id.ozToGramBtn);
        convertButton1.setText(R.string.oz_to_g);
        Button convertButton2 = findViewById(R.id.lbsToKgBtn);
        convertButton2.setText(R.string.lbs_to_kg);
        Button convertButton3 = findViewById(R.id.foot2ToM2Btn);
        convertButton3.setText(R.string.foot2_to_m2);
        Button convertButton4 = findViewById(R.id.galToLitBtn);
        convertButton4.setText(R.string.gal_to_lit);
        Button convertButton5 = findViewById(R.id.farToCelsBtn);
        convertButton5.setText(R.string.f_to_cels);
        Button milToKm = findViewById(R.id.milToKmBtn);
        milToKm.setText(R.string.mile_to_km);
        Button inchToCm = findViewById(R.id.inchToCmBtn);
        inchToCm.setText(R.string.inch_to_cm);
        EditText wpis = findViewById(R.id.wpisText);
        Button yardToM = findViewById(R.id.ydToMBtn);
        yardToM.setText(R.string.yard_to_m);
        wpis.setText("");
    }

}
