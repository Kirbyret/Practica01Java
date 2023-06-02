package com.example.practica01_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnPulsar;
    private Button btnLimpiar;
    private Button btnCerrar;
    private EditText txtNombre;
    private TextView lblSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // relacionar los objetos
        btnPulsar = (Button) findViewById(R.id.btnSaludar);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        lblSaludar = (TextView) findViewById(R.id.lblSaludo);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);

        // codificar el evento clic del boton
        btnPulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // validar
                if(txtNombre.getText().toString().matches("")) {

                    Toast.makeText(MainActivity.this, "Falto capturar informacion", Toast.LENGTH_SHORT).show();
                } else {
                    String str = "Hola " + txtNombre.getText().toString() + " ¿como estas?";
                    lblSaludar.setText(str.toString());
                }
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                lblSaludar.setText(":: ::");
                txtNombre.setText("");
            }
        });

        // Codificar el evento click del boton cerrar
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });






    }
}