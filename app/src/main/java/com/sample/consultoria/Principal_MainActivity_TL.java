package com.sample.consultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Principal_MainActivity_TL extends AppCompatActivity {

    private ImageView obtn_Empresa ;
    private ImageView obtn_Servico;
    private ImageView obtn_Contato;
    private ImageView obtn_Cliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal__main__tl);

        obtn_Empresa = findViewById(R.id.btn_Empresa);
        obtn_Empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Principal_MainActivity_TL.this,Empresa_MainActivity_TL.class));
            }
        });

        obtn_Cliente = findViewById(R.id.btn_Cliente);
        obtn_Cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Principal_MainActivity_TL.this,ClientesMainActivityTL.class));
            }
        });

        obtn_Contato = findViewById(R.id.btn_Contato);
        obtn_Contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Principal_MainActivity_TL.this,ContatoMainActivityTL.class));
            }
        });

        obtn_Servico= findViewById(R.id.btn_Servico);
        obtn_Servico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Principal_MainActivity_TL.this,ServicoMainActivityTL.class));
            }
        });

    }
}
