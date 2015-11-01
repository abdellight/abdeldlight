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
public class ListClient {
    private Vector<Client> lc = new Vector<Client>();
    private Client c;
    public ListClient(Client c){
        this.c = c;
    }
    
    public void add(Client c){
        lc.add(c);
    }
    
    public void remove(Client c){
        lc.remove(c);
    }
    
    public Client getClient(int i){
        return lc.get(i);
    }
    
    public int length(){
        return lc.size();
    }
    
    public String toString(){
        String s = "";
        for (int i = 0; i < lc.size(); i++) {
            s = s + lc.get(i).toString();
        }
        return s;
    }
}
