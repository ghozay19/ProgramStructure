package it.pradita.ac.id.strukturprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    int tangkap1;
    Button btnKembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvGanGen = (TextView) findViewById(R.id.tvGanGen);
        TextView tvNilai = (TextView) findViewById(R.id.tvNilai);
        btnKembali =(Button)findViewById(R.id.btnHome);

//        String tangkap = getIntent().getStringExtra("nilai");
        tangkap1 = getIntent().getIntExtra("nilai2",0);
        tvNilai.setText("Hasil Penjumlahan = " + tangkap1);
//        tvGanGen.setText("nilai "+ tangkap);


        if (tangkap1 % 2 == 0) {
            tvGanGen.setText("Bernilai Genap ");
        } else {
            tvGanGen.setText("Bernilai Ganjil");
        }




        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHome = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intentHome);
            }
        });


    }
}
