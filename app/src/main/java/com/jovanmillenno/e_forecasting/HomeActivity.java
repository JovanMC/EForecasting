package com.jovanmillenno.e_forecasting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private EditText namabrg, satuanbrg;

    String nama, satuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        namabrg = findViewById(R.id.namabarang);
        satuanbrg = findViewById(R.id.satuanbarang);


        Button btn4 = findViewById(R.id.btn4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = namabrg.getText().toString();
                satuan = satuanbrg.getText().toString();
                if (nama.matches("")){
                    Toast.makeText(HomeActivity.this, "Silahkan Masukan Nama Barang !", Toast.LENGTH_SHORT).show();
                }else if (satuan.matches("")){
                    Toast.makeText(HomeActivity.this, "Silahkan Masukan Satuan Barang !", Toast.LENGTH_SHORT).show();}
                else {


                        proses();
                }
            }
        });

    }
    void proses(){
            Intent intent = new Intent(this,ProsesActivity.class);
            intent.putExtra("nama",nama);
            intent.putExtra("satuan",satuan);

            startActivity(intent);



    }
}