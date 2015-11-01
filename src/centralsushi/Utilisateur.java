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
public class Utilisateur {
    private String login;
    private Password pass;
    public Utilisateur(String login, Password pass){
        this.login = login;
        this.pass = pass;
    }
    
    public String getLog(){
        return login;
    }
    
    public Password getPass(){
        return pass;
    }
    
    public boolean equals(Utilisateur u) {
      return (u instanceof Utilisateur) && 
	  ((Utilisateur)u).getLog().equals(login) && 
	  ((Utilisateur)u).getPass().equals(pass);
    }
}
