/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralsushi;

import sun.security.util.Password;

/**
 *
 * @author Abdelali
 */
public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    public Client(String nom, String prenom, String adresse, String tel){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public String getAdresse(){
        return adresse;
    }
    
    public String getTel(){
        return tel;
    }
    
    public boolean equals(Client c) {
      return (c instanceof Client) && 
	  ((Client)c).getNom().equals(nom) && 
	  ((Client)c).getPrenom().equals(prenom)&& 
	  ((Client)c).getAdresse().equals(adresse)&& 
	  ((Client)c).getTel().equals(tel);
    }
    
    public String toString(){
        return "Nom: "+nom+"\nPrenom: "+prenom+"\nAdresse: "+adresse+"\nTel: "+tel+"\n";
    }
}
