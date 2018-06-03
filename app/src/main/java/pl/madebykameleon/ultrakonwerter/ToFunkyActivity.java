package pl.madebykameleon.ultrakonwerter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ToFunkyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        EditText wpis = findViewById(R.id.wpisText);
        final Button kgToStone = findViewById(R.id.lbsToKgBtn);
        kgToStone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis * 0.1574);
                wyswietlanie.setText(wynik+"");
                kgToStone.setText(R.string.done);
            }
        });
        final Button kgToLbs = findViewById(R.id.kgToLbsBtn);
        kgToLbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis / 0.4535);
                wyswietlanie.setText(wynik+"");
                kgToLbs.setText(R.string.done);
            }
        });

        final Button gramToOz = findViewById(R.id.gramToOzBtn);
        gramToOz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis * 0.0352);
                wyswietlanie.setText(wynik+"");
                gramToOz.setText(R.string.done);
            }
        });

        final Button litToGal = findViewById(R.id.litToGalBtn);
        litToGal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis*0.2641);
                wyswietlanie.setText(wynik+"");
                litToGal.setText(R.string.done);
            }
        });
        final Button celsToFar = findViewById(R.id.celsToFarBtn);
        celsToFar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis * 9 / 5 + 32);
                wyswietlanie.setText(wynik+"");
                celsToFar.setText(R.string.done);
            }
        });

        final Button m2ToFoot2 = findViewById(R.id.m2ToFeet2Btn);
        m2ToFoot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis * 10.7639);
                wyswietlanie.setText(wynik+"");
                m2ToFoot2.setText(R.string.done);
            }
        });

        final Button kmToMile = findViewById(R.id.kmToMileBtn);
        kmToMile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis*1.6093);
                wyswietlanie.setText(wynik+"");
                kmToMile.setText(R.string.done);
            }
        });

        final Button mToYard = findViewById(R.id.mToYardBtn);
        mToYard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis/0.9144);
                wyswietlanie.setText(wynik+"");
                mToYard.setText(R.string.done);
            }
        });

        final Button cmToInch = findViewById(R.id.cmToInchBtn);
        cmToInch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wpisywanie = findViewById(R.id.wpisText);
                TextView wyswietlanie = findViewById(R.id.wynik);
                double wpis = Integer.parseInt(wpisywanie.getText().toString());
                double wynik = (wpis / 2.54);
                wyswietlanie.setText(wynik+"");
                cmToInch.setText(R.string.done);
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
        Button convertButton = findViewById(R.id.lbsToKgBtn);
        convertButton.setText(R.string.kg_to_st);
        Button convertButton1 = findViewById(R.id.gramToOzBtn);
        convertButton1.setText(R.string.g_to_oz);
        Button convertButton2 = findViewById(R.id.kgToLbsBtn);
        convertButton2.setText(R.string.kg_to_lb);
        Button convertButton3 = findViewById(R.id.litToGalBtn);
        convertButton3.setText(R.string.lit_to_gal);
        Button convertButton4 = findViewById(R.id.celsToFarBtn);
        convertButton4.setText(R.string.cels_to_far);
        Button convertButton5 = findViewById(R.id.m2ToFeet2Btn);
        convertButton5.setText(R.string.m2_to_foot2);
        Button kmToMile = findViewById(R.id.kmToMileBtn);
        kmToMile.setText(R.string.km_to_mile);
        Button mToYard = findViewById(R.id.mToYardBtn);
        mToYard.setText(R.string.m_to_yard);
        Button cmToInch = findViewById(R.id.cmToInchBtn);
        cmToInch.setText(R.string.cm_to_inch);
        EditText wpisText = findViewById(R.id.wpisText);
        wpisText.setText("");
    }
}
