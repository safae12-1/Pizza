package com.example.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.R;
import com.example.pizza.classes.Produit;

import java.util.List;

public class ProduitAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;

    public ProduitAdapter(List<Produit> produits, Activity activity) {
        this.produits =produits;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {

        return produits.size();
    }

    @Override
    public Object getItem(int position) {

        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {

        return produits.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item, null);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngredients);
        ImageView photo = convertView.findViewById(R.id.photo);
        TextView duree = convertView.findViewById(R.id.duree);
        //TextView detailsIngred = convertView.findViewById(R.id.detailsIngred);
        //TextView description = convertView.findViewById(R.id.description);
        //TextView preparation = convertView.findViewById(R.id.preparation);
        //TextView id = convertView.findViewById(R.id.id);

        nom.setText(produits.get(position).getNom());
        nbrIngredients.setText(produits.get(position).getNbrIngredients()+"");
        photo.setImageResource(produits.get(position).getPhoto());
        duree.setText(produits.get(position).getDuree());
        //detailsIngred.setText(produits.get(position).getDetailsIngred());
        //description.setText(produits.get(position).getDescription());
       // preparation.setText(produits.get(position).getPreparation());
        //id.setText(produits.get(position).getId()+"");
        return convertView;
    }
}

