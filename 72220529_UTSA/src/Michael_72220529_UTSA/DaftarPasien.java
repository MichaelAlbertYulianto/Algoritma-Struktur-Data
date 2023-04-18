/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Michael_72220529_UTSA;

/**
 *
 * @author mikel
 */
public class DaftarPasien {
        Pasien[] data;
    int cacah;
    private FileTeks file;

    public DaftarPasien(int tampung) {
        this.data = new Pasien[tampung];
        this.cacah = 0;
        this.file = new  FileTeks("src/Michael_72220529_UTSA/psn.csv");
    }
    
    public void tambah(String kp, String nama, String alamat, String keluhan) {
        Pasien baru = new Pasien(kp, nama, alamat, keluhan);
        baru.setNama(nama);
        baru.setAlamat(alamat);
        baru.setKp(kp);
        baru.setKeluhan(keluhan);
        if (cacah < this.data.length) {
            this.data[this.cacah++] = baru;
        } else {
            System.out.println("Array Penuh");
        }
    }
    
    public void hapus(){
        this.cacah--;
        this.data[this.cacah]=null;
    }

    public String getAll() {
        String semua = "";
        for (int i = 0; i < this.cacah; i++) {
            semua +=  this.data[i].getPsn() + "\n";
        }
        return semua;
    }

    public void bubbleKp(String sort) {
        if (sort.equals("Ascending")) {
            int p, b;
            Pasien titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getKp().compareTo(this.data[b + 1].getKp()) > 0) {
                        titip = this.data[b];
                        this.data[b] = this.data[b + 1];
                        this.data[b + 1] = titip;
                    }
                }
            }
        } else {
            int p, b;
            Pasien titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getKp().compareTo(this.data[b + 1].getKp()) < 0) {
                        titip = this.data[b];
                        this.data[b] = this.data[b + 1];
                        this.data[b + 1] = titip;
                    }
                }
            }
        }
    }

    public void bubbleNama(String sort) {
            if (sort.equals("Ascending")) {
            int p, b;
            Pasien titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getNama().compareTo(this.data[b + 1].getNama()) > 0) {
                        titip = this.data[b];
                        this.data[b] = this.data[b + 1];
                        this.data[b + 1] = titip;
                    }
                }
            }
        } else {
            int p, b;
            Pasien titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getNama().compareTo(this.data[b + 1].getNama()) < 0) {
                        titip = this.data[b];
                        this.data[b] = this.data[b + 1];
                        this.data[b + 1] = titip;
                    }
                }
            }
        }
    }

    public void bubbleAlamat(String sort) {
        if (sort.equals("Ascending")) {
            int p, b;
            Pasien titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getAlamat().compareTo(this.data[b + 1].getAlamat()) > 0) {
                        titip = this.data[b];
                        this.data[b] = this.data[b + 1];
                        this.data[b + 1] = titip;
                    }
                }
            }
        } else {
            int p, b;
            Pasien titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getAlamat().compareTo(this.data[b + 1].getAlamat()) < 0) {
                        titip = this.data[b];
                        this.data[b] = this.data[b + 1];
                        this.data[b + 1] = titip;
                    }
                }
            }
        }        
    }
    
    public void bubbleKeluhan(String sort){
        if (sort.equals("Ascending")) {
            int p, b;
            Pasien titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getKeluhan().compareTo(this.data[b + 1].getKeluhan()) > 0) {
                        titip = this.data[b];
                        this.data[b] = this.data[b + 1];
                        this.data[b + 1] = titip;
                    }
                }
            }
        } else {
            int p, b;
            Pasien titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getKeluhan().compareTo(this.data[b + 1].getKeluhan()) < 0) {
                        titip = this.data[b];
                        this.data[b] = this.data[b + 1];
                        this.data[b + 1] = titip;
                    }
                }
            }
        }        
    }
    
    public void saveData(){
        file.tulisFile(this.getAll());
    }

    public void ambilData() {
    String[] semua = file.bacaFile();
    this.cacah = 0;    
    for (int i = 0; i < semua.length; i++) {
        String[] brs = semua[i].split(", ");
        tambah(brs[0], brs[1], brs[2], brs[3]);
        }
    }
}
