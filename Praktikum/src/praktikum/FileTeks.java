/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mikel
 */
public class FileTeks {
    private String namaFile;

    public FileTeks(String namaFile) {
        this.namaFile = namaFile;
    }
    
    public String getNamaFile() {
        return namaFile;
    }

    public void setNamaFile(String namaFile) {
        this.namaFile = namaFile;
    }
    public void tulisFile(String text){
        try{
            FileWriter tulis = new FileWriter(namaFile);
            tulis.write(text);
            tulis.close();
        }
        catch(IOException e){
            System.out.println("Ada kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public String[] bacaFile(){
        String hasil = "";
        try{
            File fileku = new File (namaFile);
            Scanner pembacaFile = new Scanner(fileku);
            //Cetak isi File
            while(pembacaFile.hasNextLine()){
                String data = pembacaFile.nextLine();
                hasil += data + "\n";
            }
        }catch(FileNotFoundException e){
            System.out.println("Ada kesalahan : " + e.getMessage());
            e.printStackTrace();
        }
        return hasil.split("\n");
    }
    
    
}
