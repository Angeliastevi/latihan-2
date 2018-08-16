package Jobsheet11;


import java.util.Scanner;
public class ConvertVocal2Angka {
    
    private static void tampilJudul(String identitas){
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
    
    public static void main(String[] args){
    
        String identitas = " Angelia Stevinesyabudi Leoninda / X RPL 2 / 06 ";
        
        tampilJudul(identitas); 
    }
    
    private static String tampilInput(){
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = baca.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
    
        String kalimat = tampilInput();
    private static String vocal2Angka(String kalimat){
        char [][] arConvert = 
        {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
        
        kalimat = kalimat.toLowerCase();
        for(int i=0;i<arConvert.length;i++)
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
        
        return kalimat;
    }
    