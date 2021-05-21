package com.example.heroinosheroinas;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.AdapterView.*;


public class MainActivity extends AppCompatActivity {
    //Declarar a variável que irá receber a ListView do XML
    ListView listView;
    //Criar os arrays que serão inseridos na listView

    String nomeHerois[] = {"Chapolin", "Malévola", "Neo", "Pai dos Incríveis",
            "Super-Choque", "Plutão", "Saturno", "Sol", "Terra", "Urano", "Venus"};

    int imgHerois[] = {R.drawable.chapolin, R.drawable.malevola,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listaHerois);

        CustomAdapter adaptador = new CustomAdapter();

        listView.setAdapter(adaptador);


listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view,int i, long l){

        Intent intent=new Intent(getApplicationContext(), Olhar_heroi.class);


        intent.putExtra("nomeHeroi",nomeHerois[i]);
        intent.putExtra("imagemHeroi", imgHerois[i]);

        startActivity(intent);
    }
});
}
    }




public class CustomAdapter extends BaseAdapter {
    @Override

    public int getCount(){return imgHerois.length;}

    @Override

    public Object getItem(int i) {return null;}

    @Override

    public long getItemId(int i) {return 0;}

    @Override

    public View getView(int position, View view, ViewGroup viewgGroup){
        TextView textoNomeHeroi;
        ImageView imagemHeroi;

        View carregaView=getLayoutInflater().inflate(R.layout.modelo_lista_herois,null);

        textoNomeHeroi=carregaView.findViewById(R.id.textoListaHerois);
        imagemHeroi=carregaView.findViewById(R.id.imagemListaHerois);


        textoNomeHeroi.setText(nomeHeroi[position]);
        imagemHeroi.setImageResource(imgheroi[position]);
    }
}