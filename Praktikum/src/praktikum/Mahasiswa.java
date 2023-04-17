/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.StringTokenizer;

/**
 *
 * @author M S I
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private String kota;

    public Mahasiswa(String nim, String nama, String kota) {
        this.nim = nim;
        this.nama = nama;
        this.kota = kota;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        boolean Nim = true;
        if (nim.length() > 8) {
            nim = nim.substring(0, 8);
        }
        for (int i = 0; i < nim.length(); i++) {
            String Nim2 = nim.substring(i, i++);
            if (!(Nim2.compareTo("0") > 0 && Nim2.compareTo("9") >= 0)) {
                Nim = false;
            }
            if (Nim) {
                this.nim = "invalid";
            } else {
                this.nim = nim;
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
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        StringTokenizer tk = new StringTokenizer(kota, " ");
        String titip = "";
        String kapital = "";
        for(int i = 0 ; i < tk.countTokens() + 1; i++){
            titip = tk.nextToken();
            kapital += titip.substring(0, 1).toUpperCase() + titip.substring(1);
            if(i<=tk.countTokens()){
                kapital += " ";
            }
        }
        this.kota = kapital;
    }

    public String getMhs() {
        return getNim() + ", " + getNama() + ", " + getKota();
    }

}
