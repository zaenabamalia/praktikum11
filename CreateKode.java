/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum11;

/**
 *
 * @author Zaenab
 */
public class CreateKode {
    
    String tahun_ajaran ="2017-2018";
    String semester = "Gasal";
    String kd_prodi = "";
    String kode = "";
    
    public static void main(String[] args){
        CreateKode zzz = new CreateKode();
        for(int i=1;i<=30;i++){
            zzz.set_kode(i);
        }
    }
    public void set_kode(int no_urut){
        String tmp="",ta;
        if(semester.equals("Gasal")){
            tmp = "2";
        }else if(semester.equals("Genap")){
            tmp = "2";
        }
        ta = tahun_ajaran.substring(2,4)+tahun_ajaran.substring(7,9);
        if(no_urut<10){
            kode = ta+tmp+kd_prodi+"00"+no_urut;
        }else{
            kode = ta+tmp+kd_prodi+0+no_urut;
        }
        
        System.out.println("Kode = "+kode);
    }    
}
