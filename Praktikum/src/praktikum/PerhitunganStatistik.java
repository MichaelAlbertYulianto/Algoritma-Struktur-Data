/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.awt.Color;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author M S I
 */
public class PerhitunganStatistik extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    String datanya = "";
    int cacah = 0, bykgnp, bykgnjl;
    double jumlah = 0, baca, max = Double.MIN_VALUE, min = Double.MAX_VALUE, ratarata;
   
    
    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        stage.setTitle("Program Perhitungan Statistik");
        Text jdl = new Text("Program Perhitungan Statistik");
        jdl.setFill(Paint.valueOf("cornflowerblue"));
        jdl.setStroke(Paint.valueOf("Cornflowerblue"));
        GridPane.setHalignment(jdl, HPos.CENTER);
        jdl.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
        grid.setGridLinesVisible(false);
        grid.add(jdl, 0, 0, 4, 1);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(10);
        
        Label mskdata = new Label("Masukkan data :");
        grid.add(mskdata, 0, 1);
        
        TextField isidata = new TextField();
        grid.add(isidata, 1, 1);
        
        Button prs = new Button("Proses");
        grid.add(prs, 2, 1);
        
        Button cls = new Button("Close");
        grid.add(cls, 3, 12);
        cls.setOnAction((e) -> {
            System.exit(0);
        });
        
        Label hsl = new Label("Hasil Perhitungan :");
        grid.add(hsl, 0, 2);
        
        Label sd = new Label("Semua data");
        grid.add(sd, 0, 3);
        
        Label bd = new Label("Banyak data");
        grid.add(bd, 0, 4);
        
        Label jmlh = new Label("Jumlah");
        grid.add(jmlh, 0, 5);
        
        Label rata = new Label("Rata-Rata");
        grid.add(rata, 0, 6);
        
        Label tkl = new Label("Terkecil");
        grid.add(tkl, 0, 7);
        
        Label tbr = new Label("Terbesar");
        grid.add(tbr, 0, 8);
        
        Label gnp = new Label("Genap");
        grid.add(gnp, 0, 9);
        
        Label gjl = new Label("Ganjil");
        grid.add(gjl, 0, 10);
        
        
        TextField sdt = new TextField();
        grid.add(sdt , 1, 3, 4, 1);
        
        TextField bdt = new TextField();
        grid.add(bdt, 1, 4);
        
        
        TextField jml = new TextField();
        grid.add(jml, 1, 5);
        
        TextField rta = new TextField();
        grid.add(rta, 1, 6);
        
        TextField tkc = new TextField();
        grid.add(tkc, 1, 7);
        
        TextField tbs = new TextField();
        grid.add(tbs, 1, 8);
        
        TextField gen = new TextField();
        grid.add(gen, 1, 9);
        
        Label bhgen = new Label("Buah");
        grid.add(bhgen, 2, 9);
        
        TextField gan = new TextField();
        grid.add(gan, 1, 10);
        
        Label bhgan = new Label("Buah");
        grid.add(bhgan, 2, 10);
        
               
        prs.setOnAction((e) -> {
            
            datanya = datanya + isidata.getText() + " ";
            sdt.setText(datanya);
            
            cacah += 1; 
            bdt.setText(String.valueOf(cacah));
            
            baca = Double.parseDouble(isidata.getText());
            jumlah = jumlah + baca;
            
            jml.setText(String.valueOf(jumlah));
            
            ratarata = jumlah/cacah;
            
            rta.setText(String.valueOf(ratarata));
            
            if(max<baca){
                max = baca;
            }
            if(min>baca){
                min = baca;
            }
            
            if(baca % 2 == 0){
                bykgnp += 1;
            }
            else{
                bykgnjl += 1;
            }
            tkc.setText(String.valueOf(min));
            tbs.setText(String.valueOf(max));
            gen.setText(String.valueOf(bykgnp));
            gan.setText(String.valueOf(bykgnjl));
        });
        
        
        
        Text nm = new Text("72220529 - Michael Albert Yulianto");
        grid.add(nm, 0, 12, 3, 1);
        nm.setFill(Paint.valueOf("lawngreen"));
        //nm.setStroke(Paint.valueOf("lawngreen"));
        
        Scene sc = new Scene(grid, 500, 400);
        stage.setScene(sc);
        stage.show();
    }
}
