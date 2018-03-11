package it.pradita.ac.id.strukturprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.tvGanGen) TextView tvGanGen;
    @BindView(R.id.tvNilai) TextView tvNilai;


    // TODO Ini adalah Butter Knife untuk tombol Home
    @OnClick(R.id.btnHome) void kembali(){
        Intent intentHome = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intentHome);
    }



    int tangkap1;
//    Button btnKembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

//
//        TextView tvGanGen = (TextView) findViewById(R.id.tvGanGen);
//        TextView tvNilai = (TextView) findViewById(R.id.tvNilai);
//        btnKembali =(Button)findViewById(R.id.btnHome);

//  Tangkap Intent
        String tangkap = getIntent().getStringExtra("nilai");
        tangkap1 = getIntent().getIntExtra("nilai2",0);
        tvNilai.setText("Hasil Penjumlahan = " + tangkap1);
        tvGanGen.setText("nilai "+ tangkap);


        if (tangkap1 % 2 == 0) {
            tvGanGen.setText("Bernilai Genap ");
        } else {
            tvGanGen.setText("Bernilai Ganjil");
        }


//Button Kembali / btnKembali sebelum memakai ButterKnife
//        btnKembali.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intentHome = new Intent(Main2Activity.this, MainActivity.class);
//                startActivity(intentHome);
//            }
//        });
//

    }
}
