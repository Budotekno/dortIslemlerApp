package com.example.islemler;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtSayi1, edtSayi2;
    Button btnTopla , btnCikar, btnCarp, btnBol , btnTemizle;
    TextView txtSonuc;
    Integer sayi1, sayi2,sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSayi1 = findViewById(R.id.edtSayi1);
        edtSayi2 = findViewById(R.id.edtSayi2);
        txtSonuc = findViewById(R.id.txtSonuc);
        btnTopla = findViewById(R.id.btnTopla);
        btnCikar = findViewById(R.id.btnCikar);
        btnCarp = findViewById(R.id.btnCarp);
        btnBol = findViewById(R.id.btnBol);
        btnTemizle = findViewById(R.id.btnTemizle);

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (boslukHesaplama()==false) {

                sayi1 = Integer.parseInt(edtSayi1.getText().toString());
                sayi2 = Integer.parseInt(edtSayi2.getText().toString());

                sonuc = sayi1+sayi2;
                txtSonuc.setText("= "+sonuc.toString());

                txtSonuc.setVisibility(View.VISIBLE);

                btnTemizle.setVisibility(View.VISIBLE);

                }

            }
        });

        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (boslukHesaplama()==false) {


                sayi1 = Integer.parseInt(edtSayi1.getText().toString());
                sayi2 = Integer.parseInt(edtSayi2.getText().toString());

                sonuc = sayi1-sayi2;
                txtSonuc.setText("= "+sonuc.toString());

                    txtSonuc.setVisibility(View.VISIBLE);
                    btnTemizle.setVisibility(View.VISIBLE);

                }

            }
        });

        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (boslukHesaplama()==false) {
                    sayi1 = Integer.parseInt(edtSayi1.getText().toString());
                    sayi2 = Integer.parseInt(edtSayi2.getText().toString());

                    sonuc = sayi1 * sayi2;
                    txtSonuc.setText("= " + sonuc.toString());

                    txtSonuc.setVisibility(View.VISIBLE);
                    btnTemizle.setVisibility(View.VISIBLE);

                }

            }
        });

        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (boslukHesaplama()==false) {

                    Double sonuc, sayi1, sayi2;
                    sayi1 = Double.parseDouble(edtSayi1.getText().toString());
                    sayi2 = Double.parseDouble(edtSayi2.getText().toString());

                    sonuc = sayi1 / sayi2;
                    txtSonuc.setText("= " + sonuc.toString());

                    txtSonuc.setVisibility(View.VISIBLE);
                    btnTemizle.setVisibility(View.VISIBLE);

                }

            }
        });


        btnTemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtSayi2.setText("");
                edtSayi1.setText("");
                txtSonuc.setText("");

                txtSonuc.setVisibility(View.GONE);

                btnTemizle.setVisibility(View.INVISIBLE);


            }
        });


    }

    private Boolean boslukHesaplama(){

        boolean bos = false;

       String sayi1= edtSayi1.getText().toString();
       String sayi2= edtSayi2.getText().toString();


        edtSayi1.setBackgroundColor(Color.WHITE);
        edtSayi2.setBackgroundColor(Color.WHITE);

        if(TextUtils.isEmpty(sayi2)){

            edtSayi2.setBackgroundColor(Color.RED);
            bos = true;


        }

        if(TextUtils.isEmpty(sayi1)){

            edtSayi1.setBackgroundColor(Color.RED);
            bos = true;


        }

        if (TextUtils.isEmpty(sayi1) || TextUtils.isEmpty(sayi2)) {

            Toast.makeText(MainActivity.this, "Lütfen boşlukları doldurunuz", Toast.LENGTH_LONG).show();
        }
        return bos;
    }
}