package com.example.oscarapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.oscarapp.R;

import static com.example.oscarapp.activity.BoasVindasActivity.salvarFilme;

public class ConfirmarActivity extends AppCompatActivity {

    TextView Diretor, Filme;

    public String nomediretor;
    //public String nomeFilme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);

        Diretor = (TextView) findViewById(R.id.txtDiretor);
        Filme = (TextView) findViewById(R.id.txtFilme);

        Intent intentR = getIntent();
        Bundle paramR = intentR.getExtras();


        if(paramR != null){
            String nomeDi = paramR.getString("nome");
            int idDi = paramR.getInt("id");
                nomediretor = nomeDi;
                Diretor.setText(nomeDi);
            if (paramR.getString("nomeFilme") != null) {
                Filme.setText(salvarFilme.getNome());
            }
        }else if(salvarFilme.getNome() != null){
            Filme.setText(salvarFilme.getNome());
        }
    }





}