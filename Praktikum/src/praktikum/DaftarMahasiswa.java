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
public class DaftarMahasiswa {

    Mahasiswa[] data;
    int cacah;
    private FileTeks file;

    public DaftarMahasiswa(int tampung) {
        this.data = new Mahasiswa[tampung];
        this.cacah = 0;
        this.file = new  FileTeks("src/praktikum/mhs.csv");
    }
    
    public void tambah(String nim, String nama, String kota) {
        Mahasiswa baru = new Mahasiswa(nim, nama, kota);
        baru.setNama(nama);
        baru.setKota(kota);
        baru.setNim(nim);
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
            semua +=  this.data[i].getMhs() + "\n";
        }
        return semua;
    }

    public void bubbleNim(String sort) {
        if (sort.equals("Ascending")) {
            int p, b;
            Mahasiswa titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getNim().compareTo(this.data[b + 1].getNim()) > 0) {
                        titip = this.data[b];
                        this.data[b] = this.data[b + 1];
                        this.data[b + 1] = titip;
                    }
                }
            }
        } else {
            int p, b;
            Mahasiswa titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getNim().compareTo(this.data[b + 1].getNim()) < 0) {
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
            Mahasiswa titip;
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
            Mahasiswa titip;
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

    public void bubbleKota(String sort) {
        if (sort.equals("Ascending")) {
            int p, b;
            Mahasiswa titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getKota().compareTo(this.data[b + 1].getKota()) > 0) {
                        titip = this.data[b];
                        this.data[b] = this.data[b + 1];
                        this.data[b + 1] = titip;
                    }
                }
            }
        } else {
            int p, b;
            Mahasiswa titip;
            for (p = 1; p < this.cacah; p++) {
                for (b = 0; b < (cacah - p); b++) {
                    if (this.data[b].getKota().compareTo(this.data[b + 1].getKota()) < 0) {
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
        tambah(brs[0], brs[1], brs[2]);
        }
    }
}
