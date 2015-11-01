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
public class Commande {
    private int num;
    private int etat;
    public Commande(String nom, int etat){
        this.nom = nom;
        this.etat = etat;  
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getEtat(){
        return etat;
    }
    
    public boolean equals(Livreur l) {
      return (l instanceof Livreur) && 
	  ((Livreur)l).getNom().equals(nom) && 
	  ((Livreur)l).getEtat()== etat;
    }
    
    public String toString(){
        return "Nom: "+nom+"\nEtat: "+etat+"\n";
    }
}
