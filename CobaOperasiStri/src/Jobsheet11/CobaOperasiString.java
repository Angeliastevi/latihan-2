
package Jobsheet11;

import java.util.Scanner;
import java.util.Locale;


    /**
     * @param args the command line arguments
     */
    
public class CobaOperasiString {
    public static void main(String[] args) {
        String identitas = "Angelia Stevinesyabudi Leoninda / X PRL 2 / 06";
        System.out.println("Identitas : "+ identitas);
         String x = "operasi";
        System.out.println("isi variable x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variable y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
    }
}
