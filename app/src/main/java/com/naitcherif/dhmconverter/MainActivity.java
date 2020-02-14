package com.naitcherif.dhmconverter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMontant;
    private TextView textViewRes;
    private Button buttonCalculer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMontant = findViewById(R.id.editTextMontant);
        buttonCalculer = findViewById(R.id.buttonCalculer);
        textViewRes = findViewById(R.id.textViewRes);
        buttonCalculer.setOnClickListener(e -> {
            double mt = Double.parseDouble(editTextMontant.getText().toString());
            double res = mt * 10.52;
            textViewRes.setText(String.valueOf(res));
        });
    }

}
