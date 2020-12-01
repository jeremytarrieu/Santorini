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
public class Grille {
    Cellule cellule [][]= new Cellule [5][5];
    //plateau de jeu 
    
    public Grille(){//constructeur, créée les cellules de la grille
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                cellule[i][j] = new Cellule();
            }
        }
    }
    
    public boolean[][] deplacementsPossibles(int x, int y){
        /*Prends en arguments la position d'un ouvrier renvoie une grille de booleens isomorphe à la grille de cellules.
        Si une case est true c'est que le déplacement est possible, false le déplacement est impossible.
        
        Pour cela on fait le tour des cellules alentoures (haut/bas/gauche/droite/4 diagonales) et on verifie pour chaqu'une si :
            (*) elle est à coté de la cellule de base
            (*) elle n'est pas hors de la grille
            (*) le batiment n'est pas plus haut de 2 cases que le batiement de base 
            (*) le batiment n'a pas de toit (4 constructions)
            (*) il n'y a pas d'ouvrier sur la cellule  
            */

        boolean grilleRenvoi[][] = new boolean [5][5];
        //toutes les cases sont false par défaut.

        
        for(int i =-1; i<2;i++){    //on fait le tour des cases alentoures et on vérifie qu'elle appartient au tableau
            for(int j=-1; j<2;j++){
                if((x+i)>-1 && (x+i)<5 && (y+j)>-1 && (y+j)<5){ // la cellule est dans le tableau
                        if( cellule[x+i][y+j].construction<4 // la batiment n'est pas achevé
                        && (cellule[x+i][y+j].construction-cellule[x][y].construction) < 2 // le batiment n'est pas plus haut de deux ou trois cases
                        && cellule[x+i][y+j].ouvrierCourant == null// il n'y a pas d'ouvrier
                        && cellule[x+i][y+j] != cellule[x][y]){ // annule pour la cellule de base
                            grilleRenvoi[x+i][y+j] = true;
                }
                }
                
            }
        }
        return grilleRenvoi;
    }
    
    public boolean [][] constructionsPossibles(int x, int y){
        /* Prends en argument la position d'un ouvrier et renvoie une grille de booleens isomorphe à la grille de cellulles.
        Si une case est true c'est qu'il est possible de construire dessus, false si c'est impossible.
        
        Pour cela on fait le tour des cases alentoures(haut/bas/gauche/droite/4 diagonales) et on verifie pour chaqu'une si :
            (*) le batiment n'est pas terminé (4 constructions)
            (*) il n'y a pas d'ouvrier sur la cellule
        */
        boolean grilleRenvoi [][] = new boolean [5][5];
        
        for(int i=-1;i<2;i++){
            for(int j=-1;j<2;j++){
                if((x+i)>-1 && (x+1)<5 && (y+j)>-1 && (y+j)>5){
                    if(cellule[x+i][y+j].ouvrierCourant == null // il n'y a pas d'ouvrier
                    && cellule[x+i][y+j].construction<4 // le batiement n'est pas terminé 
                    && cellule[x+i][y+j] != cellule[x][y]){ // annule le test pour la cellule de base
                            grilleRenvoi[x+i][y+j] = true;
                    }
                }}}
        return grilleRenvoi;
    }
    
    public boolean etreGagnantPourJoueur(Joueur unJoueur){
        /* Prends en agrument un Joueur et renvoie un booleen.
        Cherche pour chaque cellule de la grille si l'ouvrier courant appartient au Joueur 
        et si le batiment est construit au troisieme etage.
        Si c'est le cas le joueur gagne et on renvoie true, sinon on renvoie false
        */
        for(int i=0; i<2;i++){// i correspond au nombre d'ouvriers
            for(int x=0;x<5;x++){// chaque case de la grille
                for(int y=0;y<5;y++){
                    if(cellule[x][y].ouvrierCourant == unJoueur.ouvriers[i] 
                        && cellule[x][y].construction == 3){
                        return true;
                    }
                }
            }
        }return false;
    }
}
