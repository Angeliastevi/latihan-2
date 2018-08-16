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
    