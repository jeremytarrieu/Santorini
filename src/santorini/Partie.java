/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorini;

import java.util.Scanner;

/**
 *
 * @author tarri
 */
public class Partie {
    Joueur listeJoueurs[] = new Joueur [2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();
    

    public void initialiserPartie(){
        grilleJeu.viderGrille();

    }
    public void debuterPartie(){
        //préparation de la partie
        initialiserPartie();
        
        //on demande les noms des joueurs
        
        String x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Entrer le nom du premier joueur : ");
        x = sc.next();
        Joueur Joueur1 = new Joueur();// attribut le nom du joueur au Joueur1
        Joueur1.nom=x;
        listeJoueurs[0] = Joueur1;//ListeJoueurs[0] est represente par le Joueur1
        System.out.println("Le Joueur1 s'appelle : "+Joueur1.nom+"\n");
        
        String y;
        Scanner sc2 = new Scanner (System.in);
        System.out.println("Entrer le nom du deuxieme joueur : ");
        y = sc2.next();
        Joueur Joueur2 = new Joueur();
        Joueur2.nom=y;
        listeJoueurs[1] = Joueur2;
        System.out.println("Le Joueur2 s'appelle : "+Joueur2.nom+"\n");
        //on leur affecte une couleur
        affecterCouleur
    }
}
