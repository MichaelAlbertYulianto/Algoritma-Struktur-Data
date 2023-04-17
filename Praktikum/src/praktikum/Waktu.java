/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author M S I
 */
public class Waktu {
    private String waktu1;
    private String waktu2;
    
//    public Waktu(String waktu1, String waktu2){
//        this.waktu1 = waktu1;
//        this.waktu2 = waktu2;
//    }
    
    
    private boolean cekJam(String waktu){
        String jam = waktu.substring(0,2);
        if(jam.compareTo("00")>0 && jam.compareTo("24")<0){
            return true;
        }
        else{
            return false;
        }
    }

    
    private boolean cekMenit(String waktu){
        String menit = waktu.substring(3,5);
        if(menit.compareTo("00")>0 && menit.compareTo("60")<0){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public String getWaktu1() {
        return waktu1;
    }

    
    public void setWaktu1(String waktu1) {
        if(cekJam(waktu1)){
            this.waktu1 = waktu1;
        }
        else{
            this.waktu1 = "00:" + waktu1.substring(0, 3);
        }
        if(cekMenit(waktu1)){
            this.waktu1 = this.waktu1.substring(0, 2) + ":" + waktu1.substring(3, 5);
        }
        else{
            this.waktu1 = this.waktu1.substring(0, 2)+ ":00";
        }
    }
    

    public String getWaktu2() {
        return waktu2;
    }
    
    public void setWaktu2(String waktu2) {
        if(cekJam(waktu2)){
            this.waktu2 = waktu2;
        }
        else{
            this.waktu2 = "00:" + waktu2.substring(0, 3);
        }
        if(cekMenit(waktu2)){
            this.waktu2 = this.waktu2.substring(0, 2) + ":" + waktu2.substring(3, 5);
        }
        else{
            this.waktu2 = this.waktu2.substring(0, 2)+":00";
        }
    }

//    public void setWaktu2(String waktu2) {
//        if(cekJam(waktu2)){
//            this.waktu2 = waktu2;
//        }
//        else{
//            this.waktu2 = "00" + waktu2.substring(0, 2);
//        }
//        if(cekMenit(waktu2)){
//            this.waktu2 = this.waktu2.substring(3, 5);
//        }
//        else{
//            this.waktu2 = this.waktu2.substring(0, 2);
//        }
//    }
    
    
    
    private int jadiMenit(String waktu){
        String jam = waktu.substring(0, 2);
        String menit = waktu.substring(3, 5);
        int mnt = Integer.parseInt(jam)*60 + Integer.parseInt(menit);
        return mnt;
    }
    
    private String jadiWaktu(int mnt){
        int jam = mnt / 60;
        int men = mnt % 60;
        String jamStr = "0" + jam;
        String menStr = "0" + men;
        String hh = jamStr.substring(jamStr.length() -2 , jamStr.length());
        String mm = menStr.substring(menStr.length() - 2, menStr.length());
        String waktu = hh + ":" + mm;
        return waktu;
        
    }
    
    String selisihWaktu(){
        int w1 = jadiMenit(waktu1);
        int w2 = jadiMenit(waktu2);
        int selisih = Math.abs(w2-w1);
        String selisihWaktu = jadiWaktu(selisih);
        return selisihWaktu;
    }
    
    
    
    
    
}
