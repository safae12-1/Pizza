package com.example.pizza;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity  extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Récupérez les données du produit à partir de l'Intent
        int imageResourceId = getIntent().getIntExtra("image", R.mipmap.ic_launcher);
        String nom = getIntent().getStringExtra("nom");
        String description = getIntent().getStringExtra("description");
        String ingredients = getIntent().getStringExtra("ingredients");
        String preparation = getIntent().getStringExtra("preparation");

        // Associez les vues avec leurs éléments correspondants dans le fichier de mise en page
        ImageView imageView = findViewById(R.id.photo);
        TextView nomTextView = findViewById(R.id.nom);
        TextView descriptionTextView = findViewById(R.id.description);
        TextView ingredientsTextView = findViewById(R.id.detailIngredients);
        TextView preparationTextView = findViewById(R.id.preparation);

        // Affichez les données du produit dans les vues
        imageView.setImageResource(imageResourceId);
        nomTextView.setText(nom);
        descriptionTextView.setText(description);
        ingredientsTextView.setText(ingredients);
        preparationTextView.setText(preparation);
    }
}
