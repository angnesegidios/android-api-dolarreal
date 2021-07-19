package com.example.apidolarreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtValorDolar, edtQuantDolar;
    TextView txtResultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValorDolar = findViewById(R.id.edtValorDolar);
        edtQuantDolar = findViewById(R.id.edtQuantDolar);

        txtResultados = findViewById(R.id.txtResultados);
    }

    public void calcular(View view) {

        double quantDolar = Double.parseDouble(edtQuantDolar.getText().toString());
        //quantidade em U$ dolar
        double valorDolar = Double.parseDouble(edtValorDolar.getText().toString());
        //preço do dolar

        double totalReais = valorDolar * quantDolar;
        // pega o valor do dolar na cotação de hoje vezes o quantidade que quero converter
        // exp: R$ 5.69 * U$ 100 = R$ 569.00

        DecimalFormat decimal = new DecimalFormat( "0.00");
        String valorFormatado = decimal.format(totalReais);

        txtResultados.setText("R$: " + valorFormatado);

    }
}