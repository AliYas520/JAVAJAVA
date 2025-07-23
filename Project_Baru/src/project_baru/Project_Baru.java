/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_baru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author nel
 **/
public class Project_Baru {
    
    public static void main(String[] args)
            throws IOException {
    /* *
       System.out.println("Halo"+" "+"Dunia");
        System.out.println(2+" "+5);
        System.out.println(2+5);
        System.out.println("Angka "+" "+5);
        System.out.println("2 + 5"+" = "+2+5);
        System.out.println("2 + 5"+" = "+(2+5));
    /**/
       
    /*string input*
        String namaDepan =   "" ;
        String namaBelakang = "";
        Scanner input = new Scanner(System.in);
        System.out.append("Nama Depan : ");
        //User input
        namaDepan = input.next();
        System.out.append("Nama Belakang : ");
        namaBelakang = input.next();
        
        System.out.println("Namamu adalah : ");
        System.out.println(namaDepan + " " + namaBelakang);
    */
    
    /*Buffer readder*
        String namaDepan = " ";
        String namaBelakang = " ";
        
        //Buat Objek dari inputStream
        InputStreamReader ireader = 
                new InputStreamReader(System.in);
        
        //Buat objek dari buff reader
        BufferedReader breader = 
                new BufferedReader(ireader);
        
        System.out.println("Nama Depan : ");
        
        namaDepan = 
        breader.readLine();
        System.out.println("Nama Belakang : ");
        namaBelakang = 
        breader.readLine();
        
        System.out.println("Namamu adalah : ");
        System.out.println(namaDepan + " " + namaBelakang);
       /**/
    
    /*Option Pane*
//        String nama = JOptionPane.showInputDialog("masukan nama : ");
//        System.out.println("Nama : "+nama);
        
       String a = JOptionPane.showInputDialog("masukkan nilai untuk variabel a : ");
       String b = JOptionPane.showInputDialog("masukkan nilai untuk variabel b : ");
       System.out.println("Hasil : "+ (Integer.parseInt(a) * Integer.parseInt(b)));
/**/
    
/*Show Message*/
/*Dialog
String Nama = "Kurone";
String Guild = "Wing of Eternal Light";
JOptionPane.showMessageDialog(null,"Hello "+ Nama + " from the " + Guild +" guild"); */

/*Information Message*
JOptionPane.showMessageDialog(null, "Yapping.","YAP INCOMING", 
        JOptionPane.INFORMATION_MESSAGE); */

/*Error Message/
JOptionPane.showMessageDialog(null, "AHHHHHHh!","Oh no", 
        JOptionPane.ERROR_MESSAGE);*/

/*Warning Message*
JOptionPane.showMessageDialog(null, "Warnig", "WARNING",
        JOptionPane.WARNING_MESSAGE);*/

/*qUESTION
JOptionPane.showMessageDialog(null, "Are You, still the one you aspire to be?","Let me ask you a question", JOptionPane.QUESTION_MESSAGE);*/
    
/*Plain Message*
JOptionPane.showMessageDialog(null, "Plain","What Is Love?", JOptionPane.PLAIN_MESSAGE);*/
   
//*Confirm Dialog*/
int Important = JOptionPane.showConfirmDialog(null, "Yes or no", "QUICK!",JOptionPane.YES_NO_OPTION);

if(JOptionPane.YES_OPTION == Important){
    JOptionPane.showMessageDialog(null, "Yes");
}else if(JOptionPane.NO_OPTION == Important){
    JOptionPane.showMessageDialog(null, "Nah");
}
    }
}
