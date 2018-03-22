package com.example.cathlineadelia.tugas1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.edNama) EditText edNama;
    @BindView(R.id.edNpm) EditText edNpm;
    @BindView(R.id.edNilaitugas) EditText edNilaitugas;
    @BindView(R.id.edNilaiquiz) EditText edNilaiquiz;
    @BindView(R.id.edNilaiuts) EditText edNilaiuts;
    @BindView(R.id.edNilaiuas) EditText edNilaiuas;

    @BindView(R.id.txtHasil1) TextView txtHasil1;
    @BindView(R.id.txtHasil2) TextView txtHasil2;
    @BindView(R.id.txtHasil3) TextView txtHasil3;
    @BindView(R.id.txtHasil4) TextView txtHasil4;
    @BindView(R.id.txtHasil5) TextView txtHasil5;
    @BindView(R.id.txtHasil6) TextView txtHasil6;

    @OnClick(R.id.btnInput)
    void input() {
        String nama = edNama.getText().toString();
        String npm = edNpm.getText().toString();
        String tugas = edNilaitugas.getText().toString();
        String quiz = edNilaiquiz.getText().toString();
        String uts = edNilaiuts.getText().toString();
        String uas = edNilaiuas.getText().toString();
        String hasil = "Nama: " + nama + ", "
                + "NPM: " + npm + ", "
                + "Nilai Tugas: " + tugas + ", "
                + "Nilai Quiz:  " + quiz + ", "
                + "Nilai UTS: " + uts + ", "
                + "Nilai UAS: " + uas;
        Toast.makeText(getApplicationContext(), hasil, Toast.LENGTH_LONG).show();
        txtHasil1.setText(nama);
        txtHasil2.setText(npm);
        txtHasil3.setText(tugas);
        txtHasil4.setText(quiz);
        txtHasil5.setText(uts);
        txtHasil6.setText(uas);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
