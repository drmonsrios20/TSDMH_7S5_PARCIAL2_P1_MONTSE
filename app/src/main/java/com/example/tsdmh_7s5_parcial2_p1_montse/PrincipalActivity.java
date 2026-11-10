package com.example.tsdmh_7s5_parcial2_p1_montse;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class PrincipalActivity extends AppCompatActivity {
Spinner p1sp1,p1sp2;
    @SuppressLint("MissingInflatedId")
    ArrayList<String> lista = new ArrayList<>();
     Arrayadapter<String> adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lista.add("Manzana");
        lista.add("Fresa");
        lista.add("Pera");
        lista.add("Mango");
        lista.add("Melon");
        p1sp1 = findViewById(R.id.p1sp1);
        p1sp2 = findViewById(R.id.p1sp2);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item_1, lista);
        p1sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

        }

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String valor = adapterView.getItemAtPasition(i).toString();
                    Toast.makeText(PrincipalActivity.this, "Valor Seleccionado: " + valor, Toast.LENGTH_SHORT).show();
                }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

    @Override
    private void Btnclick(View v){
       if(v.getId() == R.id.p1btn_1) {
           Toast.makeText(this, "Se preciono el boton 1", Toast.LENGTH_SHORT).show();
       }
       else if(v.getId() == R.id.p1btn_2) {
           Toast.makeText(this, "Se preciono el boton 2", Toast.LENGTH_SHORT).show();
       }
    }
}