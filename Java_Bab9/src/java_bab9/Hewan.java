/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_bab9;

/**
 *
 * @author nel
 */
public class Hewan {
   
    public String JenisKelamin;
    public int umur;
    public String warnaBulu;
    
    //constructor default
    public Hewan()  {
    }
    //constructor with parameter
    public Hewan(String JenisKelamin, int umur, String warnaBulu) {
        this.JenisKelamin = JenisKelamin;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }
    
    //function
    public String melompat(String parameter) {
        String Perilaku = "Kucing melompati "+ parameter+".";
        return Perilaku;
     }
    //procedure
    public void memakan(String parameter) {
        System.out.println("Kucing sedang memakan "+ parameter + ".");
    }
}
