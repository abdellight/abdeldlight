/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralsushi;

/**
 *
 * @author Abdelali
 */
public class Produit {
    private String nom;
    private Double prix;
    private String descr;
    public Produit(String nom, Double prix, String descr){
        this.nom = nom;
        this.prix = prix;
        this.descr = descr;
    }
    
    public String getNom(){
        return nom;
    }
    
    public Double getPrix(){
        return prix;
    }
    
    public String getDescription(){
        return descr;
    }
    
    public boolean equals(Produit p) {
      return (p instanceof Produit) && 
	  ((Produit)p).getNom().equals(nom) && 
	  ((Produit)p).getPrix()==(prix)&& 
	  ((Produit)p).getDescription().equals(descr);
    }
    
    public String toString(){
        return "Nom: "+nom+"\nPrix: "+prix+"\nDescription: "+descr+"\n";
    }
}
