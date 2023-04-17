/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author mikel
 */
public class Larik {
        private int[] data;
    private int banyak;
    
    public Larik (int bnyk){
        this.data = new int[bnyk];
        this.banyak = 0;
        
    }
    
    public void addData(int data){
        if(this.banyak<this.data.length){
            this.data[this.banyak++] = data;
        }
        else
            System.out.println("ARRAY PENUH");
    }
    
    public void selectionSort(){
        int min, titip;
        for(int pivot = 0; pivot < this.banyak-1 ; pivot++){
            min = pivot;
            for(int cari = pivot + 1; cari < this.banyak; cari++){
                if(this.data[cari]<this.data[min]){
                    min = cari;
                }
            }
            titip = this.data[pivot];
            this.data[pivot] = this.data[min];
            this.data[min] = titip;
            
        }
//        for(int i = 0; i < this.data.length ; i++){
//            baca += baca + this.data[i] + ", ";
//        }
//        return baca;
    }
    public String baca(){
        String tulis = "";
        for(int i = 0 ; i < this.banyak ; i++){
            tulis += this.data[i] + ", ";
        }
        return tulis;
    }
}

