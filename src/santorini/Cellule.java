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
public class Cellule {
    /* une cellule correspond à une colonne du plateau
    sa hauteur est determinée par la variable construction*/
    Ouvrier ouvrierCourant;
    int construction; /* variable allant de 0 à 4
                        - 0 sol
                        - 1 à 3 étages
                        - chapeau*/    
    
    public Cellule(){//constructeur
        ouvrierCourant = null;
        construction = 0;
    }
    
    public boolean affecterOuvrier(Ouvrier unOuvrier){
        // affecte à la cellule un Ouvrier s'il n'y en avait pas 
        // et renvoie true, false sinon
        if(ouvrierCourant == null){
            ouvrierCourant = unOuvrier;
            return true;
        }
        return false;
    }
    
    public Ouvrier recupererOuvrier(){
        // supprime l'ouvrier de la cellule et renvoie sa reference
        //renvoie null s'il n'y a pas d'ouvrier
        Ouvrier ouvrierRetour = ouvrierCourant;
        ouvrierCourant = null;
        return ouvrierRetour;
    }
    public boolean construire(){
        //si le batiment n'a pas de toit et qu'il n'y a pas de joueur dessus, alors on peut construire
        if (construction < 4 && ouvrierCourant == null){
        construction++;
        return true;}
        return false;
    }
    
    String lireCouleurOuvrier(){
        if (ouvrierCourant == null){
        return "vide";}
        return ouvrierCourant.couleur;
    }
}
