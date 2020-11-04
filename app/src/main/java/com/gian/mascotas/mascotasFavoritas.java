package com.gian.mascotas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class mascotasFavoritas extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<Mascottas> mascotas;
    Menu menuEstrella;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar miActionbar = (Toolbar) findViewById(R.id.miActionBar2);
        TextView tituloActionbar = (TextView) findViewById(R.id.toolbar_title);
        setSupportActionBar(miActionbar);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tituloActionbar.setText(R.string.activity2_title);

        rv = (RecyclerView) findViewById(R.id.rvRecyclerMascotasFav);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);

        DataSet();
        listaMascotasAdapter();





    }
        public void DataSet() {
        mascotas = new ArrayList<>();
        mascotas.add(new Mascottas("Fito", R.drawable.mascota2, 5));
        mascotas.add(new Mascottas("Franklin", R.drawable.mascota1, 4));
        mascotas.add(new Mascottas("Pluto", R.drawable.mascota3, 3));
        mascotas.add(new Mascottas("Jordan", R.drawable.mascota5, 3));
        mascotas.add(new Mascottas("Michi", R.drawable.mascota4, 1));


    }

    public void listaMascotasAdapter() {
        AdapterMascotas adapter = new AdapterMascotas(mascotas);
        rv.setAdapter(adapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        menu.setGroupVisible(R.id.groupStar, false);
        return true;
    }

    public void onRatingAction (MenuItem mi) {
    }










}