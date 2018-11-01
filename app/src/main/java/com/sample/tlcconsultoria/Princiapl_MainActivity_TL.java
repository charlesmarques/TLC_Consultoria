package com.sample.tlcconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Princiapl_MainActivity_TL extends Activity {
private ImageView obtn_Empresa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princiapl__main__tl);

        obtn_Empresa =  findViewById(R.id.btn_Empresa);

        /*obtn_Empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Princiapl_MainActivity_TL.this ,Empresa_MainActivity_TL.class));
            }
        });*/
    }
}
