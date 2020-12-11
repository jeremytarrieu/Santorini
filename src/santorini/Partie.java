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
    public void AffecterCouleur(Joueur j1, Joueur j2){
        //premier joueur
        System.out.println(j1+" quel couleur veux tu jouer: "+j1.nom+"\n");
        int x;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1.rouge 2.jaune 3.bleu 4.marron");
        x = sc.nextInt();
        while (x!=0){
            if(x==1){
                j1.couleur="rouge";
                x=0;
            }else if(x==2){
                j1.couleur="jaune";
                x=0;

            }else if(x==3){
                j1.couleur="bleu";
                x=0;

            }else if(x==3){
                j1.couleur="marron";
                x=0;

            }
        }
        //deuxieme joueur
        int y;
        Scanner sch = new Scanner (System.in);
        System.out.println(j2+" quel couleur veux tu jouer: "+j2.nom+"\n");
        System.out.println("1.rouge 2.jaune 3.bleu 4.marron");
        y = sch.nextInt();
        while (y!=0){
            if(y==1){
                j2.couleur="rouge";
                y=0;
            }else if(y==2){
                j2.couleur="jaune";
                y=0;

            }else if(y==3){
                j2.couleur="bleu";
                y=0;

            }else if(y==3){
                j2.couleur="marron";
                y=0;

            }
        }
        listeJoueurs[0]=j1;//remplit le tableau de joueurs
        listeJoueurs[1]=j2;
        
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
        AffecterCouleur(Joueur1, Joueur2);
        System.out.println("La couleur de "+Joueur1.nom+" est: " +Joueur1.couleur+"\n");
        System.out.println("La couleur de "+Joueur2.nom+" est: " +Joueur2.couleur+"\n");
    }
}
