/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kezd01;

/**
 *
 * @author user01
 */
public class Kezd01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] t = {1,2,3,4,5,6,7,8,9,10};

        // Összegzés
        System.out.println("Összeg: " + Összegzés(t));
        
        // Megszámolás
        System.out.println("5-nél nagyobb számok száma: " + Megszámolás(t));
        
        //Eldöntés
        int keresett = 7;
        if (Eldöntés(t, keresett)) System.out.println("Van a tömbben " + keresett + ".");
        else System.out.println("Nincsen a tömbben " + keresett + ".");
        
        // Kiválasztás
        keresett = 4;
        System.out.println("A keresett szám a " + (Kiválasztás(t, keresett) + 1) + ". helyen van.");
        
        // Keresés
        keresett = 12;
        int hely = Keresés(t, keresett);
        if (hely == -1) System.out.println("Nincs ilyen elem a tömbben.");
        else System.out.println("Van ilyen elem a következő helyen: " + (hely+1));
    }
    
    public static int Összegzés(int[] t){
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum;
    }
    
    public static int Megszámolás(int[] t){
        int count = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > 5) count++;
        }
        return count;
    }
    
    public static boolean Eldöntés(int[] t, int keresett) {
        int i = 0;
        while (i<t.length && t[i] != keresett) i++;
        return i<t.length;
    }
    
    public static int Kiválasztás(int[] t, int keresett) {
        int i = 0;
        while (t[i] != keresett) i++;
        return i;
    }
    
    public static int Keresés(int[] t, int keresett) {
        if (!Eldöntés(t, keresett)) return -1;
        else return Kiválasztás(t, keresett);
    }
    
    
}
