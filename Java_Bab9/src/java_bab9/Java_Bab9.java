/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_bab9;

/**
 *
 * @author nel
 */
public class Java_Bab9 {
    
    public static void main(String[] args) {
        Hewan kucing = new Hewan();
        kucing.JenisKelamin = "Jantan";
        kucing.umur = 3;
        kucing.warnaBulu ="Oren";
        
        System.out.println("Kucing "+kucing.JenisKelamin + " berumur " + kucing.umur + " tahun berbulu " + kucing.warnaBulu);
        //calling a function
        System.out.println(kucing.melompat("Kepala Apid"));
        //calling a procedure
        kucing.memakan("Ayam milik Apid");
    }
}
