package com.gian.mascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterMascotas extends RecyclerView.Adapter<AdapterMascotas.MascotasViewHolder> {

    ArrayList<Mascottas> mascotas;

    public AdapterMascotas(ArrayList<Mascottas> mascotas) {
        this.mascotas = mascotas;
    }



    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasViewHolder holder, int position) {
    Mascottas mascota = mascotas.get(position);
    holder.ivFoto.setImageResource(mascota.getFoto());
    holder.tvNombre.setText(mascota.getNombre());
    holder.tvRating.setText(Integer.toString(mascota.getRating()));
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder {
      private final TextView tvNombre;
      private final TextView tvRating;
      private final ImageView ivFoto;


        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = (TextView) itemView.findViewById(R.id.txtNombre);
            tvRating = (TextView) itemView.findViewById(R.id.txtRating);
            ivFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
        }
    }


}
