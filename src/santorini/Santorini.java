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
public class Santorini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grille maGrille = new Grille();
        maGrille.cellule[0][0].construction = 4;
        Ouvrier leBoss = new Ouvrier();
        maGrille.cellule[2][1].affecterOuvrier(leBoss);
        boolean [][] grilleMoove = maGrille.deplacementsPossibles(1, 0);
        for(int y=4;y>-1;y--){
            for(int x=0;x<5;x++){
                System.out.print(grilleMoove[x][y]+"\t");
            }System.out.println(y);
        }System.out.print("0\t1\t2\t3\t4");
    }
    
}
