package com.example.ramonbr14.bandeirasbrasil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView ivbandeiras;
    TextView estados;
    Button btnAnt, btnPro;
    ArrayList<Bandeira> bandeira = new ArrayList<Bandeira>();
    int bandeiraAtual = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivbandeiras = (ImageView) findViewById(R.id.ivBandeiras);
        estados = (TextView) findViewById(R.id.textView2);
        btnAnt = (Button) findViewById(R.id.btnAnterior);
        btnPro = (Button) findViewById(R.id.btnProximo);

        bandeira.add(new Bandeira(R.drawable.acre, "ACRE"));
        bandeira.add(new Bandeira(R.drawable.alagoas, "ALAGOAS"));
        bandeira.add(new Bandeira(R.drawable.amapa, "AMAPÁ"));
        bandeira.add(new Bandeira(R.drawable.amazonas, "AMAZONAS"));
        bandeira.add(new Bandeira(R.drawable.bahia, "BAHIA"));
        bandeira.add(new Bandeira(R.drawable.ceara, "CEARA"));
        bandeira.add(new Bandeira(R.drawable.distritofederal, "DISTRITO FEDERAL"));
        bandeira.add(new Bandeira(R.drawable.espiritosanto, "ESPIRITO SANTO"));
        bandeira.add(new Bandeira(R.drawable.goias, "GOIAS"));
        bandeira.add(new Bandeira(R.drawable.maranhao, "MARANHAO"));
        bandeira.add(new Bandeira(R.drawable.matogrosso, "MATO GROSSO"));
        bandeira.add(new Bandeira(R.drawable.matogrossodosul, "MATO GROSSO DO SUL"));
        bandeira.add(new Bandeira(R.drawable.minasgerais, "MINAS GERAIS"));
        bandeira.add(new Bandeira(R.drawable.para, "PARÁ"));
        bandeira.add(new Bandeira(R.drawable.paraiba, "PARAÍBA"));
        bandeira.add(new Bandeira(R.drawable.parana, "PARANÁ"));
        bandeira.add(new Bandeira(R.drawable.pernanbuco, "PERNANBUCO"));
        bandeira.add(new Bandeira(R.drawable.piaui, "PIAUÍ"));
        bandeira.add(new Bandeira(R.drawable.riodejaneiro, "RIO DE JANEIRO"));
        bandeira.add(new Bandeira(R.drawable.riograndedonorte, "RIO GRANDE DO NORTE"));
        bandeira.add(new Bandeira(R.drawable.riograndedosul, "RIO GRANDE DO SUL"));
        bandeira.add(new Bandeira(R.drawable.rondonia, "RONDÔNIA"));
        bandeira.add(new Bandeira(R.drawable.roraima, "RORAIMA"));
        bandeira.add(new Bandeira(R.drawable.santacatarina, "SANTA CATARINA"));
        bandeira.add(new Bandeira(R.drawable.saopaulo, "SAO PAULO"));
        bandeira.add(new Bandeira(R.drawable.sergipe, "SERGIPE"));
        bandeira.add(new Bandeira(R.drawable.tocantins, "TOCANTINS"));

        View.OnClickListener btClickListener = new View.OnClickListener(){
            @Override
            public void onClick (View view){
                if(view == btnAnt){
                    if(bandeiraAtual > 0)
                        bandeiraAtual--;
                }
                if(view == btnPro){
                    if(bandeiraAtual < bandeira.size()-1)
                        bandeiraAtual++;
                }
                ivbandeiras.setImageResource(bandeira.get(bandeiraAtual).getImagemResource());
                estados.setText(bandeira.get(bandeiraAtual).getNome());
            }
        };
        btnAnt.setOnClickListener(btClickListener);
        btnPro.setOnClickListener(btClickListener);
    }
}