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
public class Joueur {
    String nom = new String();
    String couleur = new String();
    int nbConstruction;
    Ouvrier [] ouvriers = new Ouvrier [2];
    
    public void affecterCouleur(String uneCouleur){
        couleur = uneCouleur;
    }
    
    public void ajouterOuvrier(Ouvrier unOuvrier, int numero){
        ouvriers[numero] = unOuvrier;
    }
    
    public void poserConstruction(){//rajouter (if posage de constru return true)
        nbConstruction--;
    }
}
