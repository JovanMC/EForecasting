package com.jovanmillenno.e_forecasting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class ProsesActivity extends AppCompatActivity {
String nama, satuan;
String edit1s,edit2s,edit3s,edit4s,edit5s,edit6s,edit7s,edit8s,edit9s,edit10s,edit11s,edit12s;
double edit1i,edit2i,edit3i,edit4i,edit5i,edit6i,edit7i,edit8i,edit9i,edit10i,edit11i,edit12i;
EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7,edit8,edit9,edit10,edit11,edit12;
double hasilakhir;


RelativeLayout relativeLayout, relativeLayout1,relativeLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        edit4 = findViewById(R.id.edit4);
        edit5 = findViewById(R.id.edit5);
        edit6 = findViewById(R.id.edit6);
        edit7 = findViewById(R.id.edit7);
        edit8 = findViewById(R.id.edit8);
        edit9 = findViewById(R.id.edit9);
        edit10 = findViewById(R.id.edit10);
        edit11 = findViewById(R.id.edit11);
        edit12 = findViewById(R.id.edit12);


        relativeLayout = findViewById(R.id.relativeLayout2);
        relativeLayout1 = findViewById(R.id.relativeLayout3);
        relativeLayout2 = findViewById(R.id.relativeLayout4);
        Button proses = findViewById(R.id.proses);
        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        satuan = intent.getStringExtra("satuan");


        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1s = edit1.getText().toString();
                edit2s = edit2.getText().toString();
                edit3s = edit3.getText().toString();
                edit4s = edit4.getText().toString();
                edit5s = edit5.getText().toString();
                edit6s = edit6.getText().toString();
                edit7s = edit7.getText().toString();
                edit8s = edit8.getText().toString();
                edit9s = edit9.getText().toString();
                edit10s = edit10.getText().toString();
                edit11s = edit11.getText().toString();
                edit12s = edit12.getText().toString();

                if (edit1s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 1", Toast.LENGTH_SHORT).show();
                }else if (edit2s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 2", Toast.LENGTH_SHORT).show();}
                else if (edit3s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 3", Toast.LENGTH_SHORT).show();}
                else if (edit4s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 4", Toast.LENGTH_SHORT).show();}
                else if (edit5s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 5", Toast.LENGTH_SHORT).show();}
                else if (edit6s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 6", Toast.LENGTH_SHORT).show();}
                else if (edit7s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 7", Toast.LENGTH_SHORT).show();}
                else if (edit8s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 8", Toast.LENGTH_SHORT).show();}
                else if (edit9s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 9", Toast.LENGTH_SHORT).show();}
                else if (edit10s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 10", Toast.LENGTH_SHORT).show();}
                else if (edit11s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 11", Toast.LENGTH_SHORT).show();}
                else if (edit12s.matches("")){
                    Toast.makeText(ProsesActivity.this, "Silahkan Masukan Data Bulan 12", Toast.LENGTH_SHORT).show();}
                else {

                    onproses();
                akhir();
            }}
        });


    }

     void onproses() {


             edit1i = Double.parseDouble(edit1s);
             edit2i = Double.parseDouble(edit2s);
             edit3i = Double.parseDouble(edit3s);
             edit4i = Double.parseDouble(edit4s);
             edit5i = Double.parseDouble(edit5s);
             edit6i = Double.parseDouble(edit6s);
             edit7i = Double.parseDouble(edit7s);
             edit8i = Double.parseDouble(edit8s);
             edit9i = Double.parseDouble(edit9s);
             edit10i = Double.parseDouble(edit10s);
             edit11i = Double.parseDouble(edit11s);
             edit12i = Double.parseDouble(edit12s);

             proses inputproses = new proses();
             hasilakhir = inputproses.prosesakhir(edit1i, edit2i, edit3i, edit4i, edit5i, edit6i, edit7i, edit8i, edit9i, edit10i, edit11i, edit12i);
         }



    void akhir(){
        Intent intent = new Intent(this,HasilActivity.class);
        intent.putExtra("nama",nama);
        intent.putExtra("satuan",satuan);
        intent.putExtra("hasil",hasilakhir);
        startActivity(intent);
    }
}