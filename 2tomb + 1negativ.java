/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.tomb;
/**
 *
 * @author Szalanics Szabolcs
 */
public class Tomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int elemszam;
        elemszam = (int) (Math.random()*10)+10;
        int tomb1[] = new int[elemszam];
        int tomb2[] = new int[elemszam];
        int nevativtomb[] = new int[elemszam*2];
        
        for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random()*200)-100;           
            tomb2[i] = (int) (Math.random()*200)-100;               
        }
      
       for (int i = 0; i < elemszam; i++) {
            
            System.out.print("A tömbök "+(String.format("%,2d",(i+1))) + ". elemei: " + (String.format("%,4d", tomb1[i])+"  + "));
            System.out.print(String.format("%,4d", tomb2[i])+" \n");
        }
       int negativDb=0;
       for (int i = 0; i < elemszam; i++) {
            if (tomb1[i]<0) {
                nevativtomb[negativDb++]=tomb1[i];
            }
        }
       for (int i = 0; i < elemszam; i++) {
            if (tomb2[i]<0) {
                nevativtomb[negativDb++]=tomb2[i];
            }
        }
       System.out.print("Negatív tömb elemei: ");
        
            if (negativDb > 0){
                for (int i = 0; i < negativDb; i++) {
                    System.out.print(nevativtomb[i]+" ");               
                }
            }
            else {
                System.out.print("nincs negativ");
            }
        
    }
    
}
