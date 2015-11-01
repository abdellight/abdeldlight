/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralsushi;
import java.sql.*;
/**
 *
 * @author Abdelali
 */
public class GestionBD {
    public GestionBD(){
        Connexion();
    }
    
    public void Connexion(){
        /* Connexion à la base de données */
        String url = "jdbc:mysql://localhost:3306/mydb";
        String utilisateur = "root";
        String motDePasse = "root";
        Connection connexion = null;
        try {
            connexion = DriverManager.getConnection( url, utilisateur, motDePasse );

            /* Ici, nous placerons nos requêtes vers la BDD */
            /* ... */

        } catch ( SQLException e ) {
            /* Gérer les éventuelles erreurs ici */
        } finally {
            if ( connexion != null )
                try {
                    /* Fermeture de la connexion */
                    connexion.close();
                } catch ( SQLException ignore ) {
                    /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
                }
        }     
    }
}
