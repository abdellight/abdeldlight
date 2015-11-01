/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralsushi;

import java.util.Vector;

/**
 *
 * @author Abdelali
 */
public class ListUtilisateur {
    private Vector<Utilisateur> lu = new Vector<Utilisateur>();
    private Utilisateur u;
    public ListUtilisateur(Utilisateur u){
        this.u = u;
    }
    
    public void add(Utilisateur u){
        lu.add(u);
    }
    
    public void remove(Utilisateur u){
        lu.remove(u);
    }
    
    public Utilisateur getUtilisateur(int i){
        return lu.get(i);
    }
    
    public int length(){
        return lu.size();
    }
    
    public String toString(){
        String s = "";
        for (int i = 0; i < lu.size(); i++) {
            s = s + lu.get(i).toString();
        }
        return s;
    }
}
