package com.jovanmillenno.e_forecasting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    TextView namabarang,hasil;
    Button ulang, keluar;
    Intent pindah;
    String nama, satuan;
    String hasilakhirstring;
    int hasilakhirint;

    double hasilakhir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Intent intent = getIntent();

        nama = intent.getStringExtra("nama");
        satuan = intent.getStringExtra("satuan");
        hasilakhir = intent.getDoubleExtra("hasil",hasilakhir);
        namabarang = findViewById(R.id.namabarang);
        hasil = findViewById(R.id.hasil);
        namabarang.setText(nama);
        hasilakhirint = (int) hasilakhir;

        hasilakhirstring = String.valueOf(hasilakhirint);
        hasil.setText(hasilakhirstring+" "+satuan);
        ulang = findViewById(R.id.btn1);
        ulang.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              pindah = new Intent(HasilActivity.this, HomeActivity.class);
              startActivity(pindah);
              //saat pindah, activity yg sekarang langsung ditutup
              //agar saat menekan tombol kembali tidak bolak-balik
              finish();
          }
      });
      keluar = findViewById(R.id.btn2);
      keluar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              moveTaskToBack(true);
          }
      });



    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setMessage("Kamu yakin ingin keluar?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
}