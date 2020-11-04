package com.gian.mascotas;

import androidx.annotation.ArrayRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listadeM;
    ArrayList<Mascottas> mascotas;
    Menu menuEstrella;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionbar);
        listadeM = (RecyclerView) findViewById(R.id.rvRecyclerMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listadeM.setLayoutManager(llm);
        iniListaMascotas();
        iniAdaptador();
        getSupportActionBar().setIcon(R.drawable.ic_huella);

        getSupportActionBar().setDisplayShowTitleEnabled(false);


    }


    public void iniListaMascotas() {
        mascotas = new ArrayList<Mascottas>();
        mascotas.add(new Mascottas("Franklin", R.drawable.mascota1, 4));
        mascotas.add(new Mascottas("Fito", R.drawable.mascota2, 5));
        mascotas.add(new Mascottas("Pluto", R.drawable.mascota3, 3));
        mascotas.add(new Mascottas("Michi", R.drawable.mascota4, 1));
        mascotas.add(new Mascottas("Jordan", R.drawable.mascota5, 3));
    }

    public void iniAdaptador () {
        AdapterMascotas adaptador = new AdapterMascotas(mascotas);
        listadeM.setAdapter(adaptador);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }


    public void onRatingAction (MenuItem mi) {
        Intent intent = new Intent (MainActivity.this, mascotasFavoritas.class);
        startActivity(intent);


    }


    public void like(View view) {
        Snackbar.make(findViewById(R.id.RelativeLayout), R.string.mensaje_snackbar, Snackbar.LENGTH_SHORT).show();
    }



}





