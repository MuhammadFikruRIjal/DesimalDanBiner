
package KonversiBilangan;

import java.util.Scanner;
/**
 *
 * @author L
 */
public class BinerDesimal {
    
    void decimalToBiner(int a){
        if (a > 1){
            decimalToBiner(a / 2);
        }
        System.out.print(a % 2);
    }
    
    String binerToDecimal(String bilangan){
        String [] binerReverse = new String[bilangan.length()];
        double resultDecimal = 0;
        
        //reverse
        int n = 0;
        for (int i = bilangan.length() - 1; i >= 0; i--){
            binerReverse[n] = String.valueOf(bilangan.charAt(i));
            n++;
        }
        //pangkatkan
        for (int i = 0; i < binerReverse.length; i++){
            if (Integer.parseInt(binerReverse[i]) == i){
                resultDecimal += Math.pow(2,i);
            }
        }
        return String.valueOf(resultDecimal);
    }
    
    public static void main(String[] args) {
        //BinerDecimal bd = new BinerDecimal ();
        System.out.println("====== Konversi Bilangan ======");
        System.out.println(" 1. Desimal Ke Biner \n 2. Biner Ke Desimal\n");
        
        System.out.print("Masukkan Pililhan: ");
        Scanner input = new Scanner(System.in);
        
        switch (input.nextInt()){
            case 1:
                System.out.println("\n= Desimel Ke Biner= ");
                System.out.print("Masukkan Bil.Desimal: ");
                Scanner desimal = new Scanner(System.in);
                String biner =
                        Integer.toBinaryString(desimal.nextInt());
                System.out.println("Hasil: "+biner);
                //int inputInt = desimal.nextInt();
                //System.out.print("Hasil: ");
                //bd.decimalToBiner(inputInt);
                System.out.println("\n");
                break;
                
            default:
                System.out.println("\n = Biner Ke Desimal= ");
                System.out.print("Masukkan Bil.Biner: ");
                Scanner inputBiner = new Scanner(System.in);
                int result = Integer.parseInt(inputBiner.nextLine(), 2); //radix 2(biner)
                System.out.println("Hasil: "+result);
                //System.out.println("Desimal: " + bd.binerToDecimal(inputBiner.nextLine()));               
                break;
        }
    }
}
