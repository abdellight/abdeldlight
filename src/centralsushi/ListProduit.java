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
public class ListProduit {
    private Vector<Produit> lp = new Vector<Produit>();
    private Produit p;
    public ListProduit(Produit p){
        this.p = p;
    }
    
    public void add(Produit u){
        lp.add(u);
    }
    
    public void remove(Produit u){
        lp.remove(u);
    }
    
    public Produit getProduit(int i){
        return lp.get(i);
    }
    
    public int length(){
        return lp.size();
    }
    
    public String toString(){
        String s = "";
        for (int i = 0; i < lp.size(); i++) {
            s = s + lp.get(i).toString();
        }
        return s;
    }
}
