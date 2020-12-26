
package KalkulatorTumpukan;

import java.util.Scanner;

/**
 *
 * @author L
 */
public class Kalkulator {
    public static void main(String[] args) {
        
        double result = 0;
        
        System.out.println("====== Aplikasi Kalkulator Sederhana ======");
        System.out.println("Pilihan Operasi:\n"
                + "1. Penjumlahan\n"
                + "2. Pengurangan\n"
                + "3. Perkalian\n"
                + "4. Pembagian\n");
        System.out.print("Masukkan Pilihan: ");
        
        Scanner operation = new Scanner(System.in);
        int option = operation.nextInt();
        
        //Input Bilangan
        System.out.print("Masukkan Bilangan 1: ");
        Scanner val1 = new Scanner(System.in);
        double bil1 = val1.nextDouble();
        
        System.out.print("Masukkan Bilangan 2: ");
        Scanner val2 = new Scanner(System.in);
        double bil2 = val1.nextDouble();
        
        //Switch Case Operasi
        switch(option){
            
            case 1:
                System.out.println("\nPenjumlahan");
                result = bil1 + bil2;
                System.out.format("Hasil: %.2f\n", result);
                break;
                
            case 2:
                System.out.println("\nPengurangan");
                result = bil1 - bil2;
                System.out.format("Hasil: %.2f\n", result);
                break;
            
            case 3:
                System.out.println("\nPerkalian");
                result = bil1 * bil2;
                System.out.format("Hasil: %.2f\n", result);
                break;
                
            case 4:
                System.out.println("\nPembagian");
                result = bil1 / bil2;
                System.out.format("Hasil: %.2f\n", result);
                break;
        }
        
    }
}
