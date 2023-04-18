/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Michael_72220529_UTSA;

import java.util.StringTokenizer;

/**
 *
 * @author mikel
 */
public class Pasien {
    
    private String kp;
    private String nama;
    private String alamat;
    private String keluhan;

    public Pasien(String kp, String nama, String alamat, String keluhan) {
        this.kp = kp;
        this.nama = nama;
        this.alamat = alamat;
        this.keluhan = keluhan;
    }

    /**
     * @return the kp
     */
    public String getKp() {
        return kp;
    }

    /**
     * @param kp the kp to set
     */
    public void setKp(String Kp) {
        boolean CKP = true;
        if (Kp.length() > 8) {
            Kp = Kp.substring(0, 8);
        }
        for (int i = 0; i < Kp.length(); i++) {
            String CKP2 = Kp.substring(i, i++);
            if (!(CKP2.compareTo("0") > 0 && CKP2.compareTo("9") >= 0)) {
                CKP = false;
            }
            if (CKP) {
                this.kp = "invalid";
            } else {
                this.kp = Kp;
            }
        }
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        StringTokenizer tk = new StringTokenizer(nama, " ");
        String titip = "";
        String kapital = "";
        if(tk.countTokens()>1){
            for(int i = 0 ; i <= tk.countTokens() + 1 ; i++){
                titip = tk.nextToken();
                kapital += titip.substring(0, 1).toUpperCase() + titip.substring(1);
                if(i<=tk.countTokens()){
                    kapital += " ";
                }
            }
        }
        else {
            titip = nama;
            kapital = titip.substring(0, 1).toUpperCase() + titip.substring(1);
        }
        
        this.nama = kapital;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        StringTokenizer tk = new StringTokenizer(alamat, " ");
        String titip = "";
        String kapital = "";
        if(tk.countTokens()>1){
            for(int i = 0 ; i <= tk.countTokens() + 1 ; i++){
                titip = tk.nextToken();
                kapital += titip.substring(0, 1).toUpperCase() + titip.substring(1);
                if(i<=tk.countTokens()){
                    kapital += " ";
                }
            }
        }
        else {
            titip = alamat;
            kapital = titip.substring(0, 1).toUpperCase() + titip.substring(1);
        }

        this.alamat = kapital;
    }
    
    public String getKeluhan(){
        return keluhan;
    }
    
    public void setKeluhan(String keluhan){
        StringTokenizer tk = new StringTokenizer(keluhan, " ");
        String titip = "";
        String kapital = "";
        if(tk.countTokens()>1){
            for(int i = 0 ; i <= tk.countTokens() + 1 ; i++){
                titip = tk.nextToken();
                kapital += titip.substring(0, 1).toUpperCase() + titip.substring(1);
                if(i<=tk.countTokens()){
                    kapital += " ";
                }
            }
        }
        else {
            titip = keluhan;
            kapital = titip.substring(0, 1).toUpperCase() + titip.substring(1);
        }

        this.keluhan = kapital;        
    }

    public String getPsn() {
        return getKp() + ", " + getNama() + ", " + getAlamat() + ", " + getKeluhan();
    }
}
