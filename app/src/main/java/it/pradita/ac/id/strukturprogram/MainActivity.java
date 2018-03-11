package it.pradita.ac.id.strukturprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
//Import ini adalah library ButterKnife
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.etNilai1)
    EditText etsatu;
    @BindView(R.id.etNilai2)
    EditText etdua;
    @BindView(R.id.etHasil)
    EditText ettiga;

    @OnClick(R.id.btnproses)
    void jumlah() {

        int angka1 = Integer.parseInt(etsatu.getText().toString());
        int angka2 = Integer.parseInt(etdua.getText().toString());
        int jumlah = angka1 + angka2;
        ettiga.setText("" + jumlah);

        ettiga.setEnabled(false);

        int tambah = (int) jumlah;
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("nilai2", tambah);
        startActivity(intent);

    }

    @OnClick(R.id.btnhapus)
    void hapus() {
        etsatu.setText("");
        etdua.setText("");
        ettiga.setText("");
    }

    // CASTING
    //    Button btnproses, btndelete;
    //    EditText etket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //TODO 2 menambahkan  ButterKnife.bind(this);  di dalam activity_main
        ButterKnife.bind(this);

// Dibawah ini adalah Koding Tanpa Library ButterKnife , Cukup Njlimet bukan :D

//        //casting
//        btnproses = (Button) findViewById(R.id.btnproses);
//        btndelete = (Button) findViewById(R.id.btnhapus);
////        etket = (EditText) findViewById(R.id.etketerangan);
//
//        //casting langsung
//        final EditText etsatu = (EditText) findViewById(R.id.etNilai1);
//        final EditText etdua = (EditText) findViewById(R.id.etNilai2);
//        final EditText ettiga = (EditText) findViewById(R.id.etHasil);
//
//
//        btnproses.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String angka1 = etsatu.getText().toString().trim();
//                String angka2 = etdua.getText().toString().trim();
//
//                double p = Double.parseDouble(angka1);
//                double l = Double.parseDouble(angka2);
//                double hasil = p + l;
//
//
//                ettiga.setText("Hasil : " + hasil);
//                ettiga.setEnabled(false);
//
//                int tambah = (int) hasil;
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra("nilai2", tambah);
//                startActivity(intent);
//
//            }
//
//        });
//
//
//
//
//
//
//
//        btndelete.setOnClickListener(new View.OnClickListener()
//
//        {
//            @Override
//            public void onClick(View view) {
//                etsatu.setText("");
//                etdua.setText("");
//                ettiga.setText("");
//            }
//        });


    }
}
