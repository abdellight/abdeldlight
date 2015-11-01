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
public class ListLivreur {
    private Vector<Livreur> ll = new Vector<Livreur>();
    private Livreur l;
    public ListLivreur(Livreur l){
        this.l = l;
    }
    
    public void add(Livreur u){
        ll.add(u);
    }
    
    public void remove(Livreur u){
        ll.remove(u);
    }
    
    public Livreur getLivreur(int i){
        return ll.get(i);
    }
    
    public int length(){
        return ll.size();
    }
    
    public String toString(){
        String s = "";
        for (int i = 0; i < ll.size(); i++) {
            s = s + ll.get(i).toString();
        }
        return s;
    }   
}
