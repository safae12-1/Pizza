package com.example.pizza.service;

import android.util.Log;

import com.example.pizza.classes.Produit;
import com.example.pizza.dao.IDao;

import java.util.ArrayList;
import java.util.List;


public class ProduitService implements IDao<Produit>{
    private List<Produit> produits;
    public ProduitService() {

        this.produits = new ArrayList<>();
    }
    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public boolean update(Produit o) {
        Produit p = findById(o.getId());
        p.setNom(o.getNom());
        p.setNbrIngredients(o.getNbrIngredients());
        p.setPhoto(o.getPhoto());
        p.setDuree(o.getDuree());
        p.setDetailsIngred(o.getDetailsIngred());
        p.setDescription(o.getDescription());
        p.setPreparation(o.getPreparation());

        return false;
    }

    @Override
    public List<Produit> findAll() {

        return produits;
    }

    @Override
    public Produit findById(int id) {
        for(Produit p : produits)
            if(p.getId() == id)
                return p;
        return null;
    }

}
