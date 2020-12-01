/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorini;

/**
 *
 * @author tarri
 */
public class Ouvrier {
    String couleur = new String();
    String joueur = new String();
    int numero;// chaque joueur possède 2 ouvriers
    
    public Ouvrier(Joueur unJoueur, int unNumero){
        joueur = unJoueur.nom;
        couleur = unJoueur.couleur;
        numero = unNumero;
    }
    
    public Ouvrier(){
    
    }
    public String lireCouleur(){
        return couleur;
    }
}
