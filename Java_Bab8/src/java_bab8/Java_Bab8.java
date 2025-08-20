/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_bab8;

import javax.swing.JOptionPane;

/**
 *
 * @author nel
 */
public class Java_Bab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                //LOOPS
//        // For Loop
//        for (int a = 0; a < 10; a++) {
//            System.out.println("Nel Dayo");
//        }
//        for (int a = 2; a < 20; a += 2){
//            System.out.println("BIlangan Genap : " +a);
//        }
//        //Nested For loop
//        int baris = 25;
//
//        for (int i = 0; i <= baris; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
        //User input
        int JumlahKelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan jumlah kelas : ", "Input", JOptionPane.INFORMATION_MESSAGE));
        String IsiKelas[][] = new String[JumlahKelas][];

        for (int kelas = 0; kelas < JumlahKelas; kelas++) {
            String namaKelas = JOptionPane.showInputDialog(null, "Nama Kelas : ", "Masukan Nama Kelas", JOptionPane.INFORMATION_MESSAGE);
            int jumlahKursi = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah murid masing-masing kelas : ", "Input", JOptionPane.INFORMATION_MESSAGE));
            IsiKelas[kelas] = new String[jumlahKursi];
            System.out.println("Kelas " + namaKelas + " : ");
            for (int kursi = 0; kursi < jumlahKursi; kursi++) {
                String namaSiswa = JOptionPane.showInputDialog(null, "Nama Siswa ", "Kelas " + namaKelas, JOptionPane.INFORMATION_MESSAGE);
                IsiKelas[kelas][kursi] = namaSiswa;
                System.out.println("Nama Siswa : " + IsiKelas[kelas][kursi]);
            }
            System.out.println("----------------------------------------------");
        }
    }

}
