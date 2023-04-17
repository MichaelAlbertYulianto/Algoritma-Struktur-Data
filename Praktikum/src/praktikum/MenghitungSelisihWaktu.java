/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author M S I
 */
public class MenghitungSelisihWaktu extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 5, 5, 5));
        stage.setTitle("Selisih Waktu");
        
        
        
        Text judul = new Text("Menghitung Selisih Waktu");
        judul.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        grid.add(judul, 0, 0, 4, 1);
        
        Label waktu1 = new Label("Waktu 1");
        grid.add(waktu1, 0, 1);
        
        Label waktu2 = new Label("Waktu 2");
        grid.add(waktu2, 0, 2);
        
        Label selisih = new Label("Selisih Waktu");
        grid.add(selisih, 0, 3);
        
        TextField jam1 = new TextField();
        grid.add(jam1, 1, 1);
        jam1.setMaxWidth(30);
        
        TextField menit1 = new TextField();
        grid.add(menit1, 2, 1);
        menit1.setMaxWidth(30);
        
        TextField detik1 = new TextField();
        grid.add(detik1, 3, 1);
        detik1.setMaxWidth(30);
        
        TextField jam2 = new TextField();
        grid.add(jam2, 1, 2);
        jam2.setMaxWidth(30);
        
        TextField menit2 = new TextField();
        grid.add(menit2, 2, 2);
        menit2.setMaxWidth(30);
        
        TextField detik2 = new TextField();
        grid.add(detik2, 3, 2);
        detik2.setMaxWidth(30);
        
        TextField sjam2 = new TextField();
        grid.add(sjam2, 1, 3);
        sjam2.setEditable(false);
        sjam2.setMaxWidth(30);
        
        TextField smenit2 = new TextField();
        grid.add(smenit2, 2, 3);
        smenit2.setEditable(false);
        smenit2.setMaxWidth(30);
        
        TextField sdetik2 = new TextField();
        grid.add(sdetik2, 3, 3);
        sdetik2.setEditable(false);
        sdetik2.setMaxWidth(30);
        grid.setGridLinesVisible(false);
        
        
        Button hitung = new Button("Hitung");
        grid.add(hitung, 0, 4);
        Button close = new Button("Close");
        grid.add(close, 1, 4, 2, 1);
        
        hitung.setOnAction((e) -> {
        int j1, m1, d1, j2, m2, d2, jh, mh, dh;
        j1 = Integer.parseInt(jam1.getText());
        m1 = Integer.parseInt(menit1.getText());
        d1 = Integer.parseInt(detik1.getText());
        j2 = Integer.parseInt(jam2.getText());
        m2 = Integer.parseInt(menit2.getText());
        d2 = Integer.parseInt(detik2.getText());
        if(j1 <= 23 && j2 <=23 && m1 <= 59 && m2 <= 59 && d1 <= 59 && d2 <= 59){
        if(j1>j2){
            dh = d1 - d2;
            if(dh<0){
                m1 -= 1;
                dh += 60;
            }
            mh = m1 - m2;
            if(mh<0){
                j1 -= 1;
                mh += 60;
            }
            jh = j1 - j2;
            sjam2.setText(String.valueOf(jh));
            smenit2.setText(String.valueOf(mh));
            sdetik2.setText(String.valueOf(dh));
        }
        if(j1<j2){
            dh = d2 - d1;
            if(dh<0){
                m1 -= 1;
                dh += 60;
            }
            mh = m2 - m1;
            if(mh<0){
                j2 -= 1;
                mh += 60;
            }
            jh = j2 - j1;
            sjam2.setText(String.valueOf(jh));
            smenit2.setText(String.valueOf(mh));
            sdetik2.setText(String.valueOf(dh));
        }
        if(j1==j2){
            if(m2>m1){
                dh = d2 - d1;
            if(dh<0){
                m1 -= 1;
                dh += 60;
            }
            mh = m2 - m1;
            if(mh<0){
                j2 -= 1;
                mh += 60;
            }
            jh = j2 - j1;
            sjam2.setText(String.valueOf(jh));
            smenit2.setText(String.valueOf(mh));
            sdetik2.setText(String.valueOf(dh));
            }
            if(m1>m2){
                dh = d1 - d2;
            if(dh<0){
                m1 -= 1;
                dh += 60;
            }
            mh = m1 - m2;
            if(mh<0){
                j2 -= 1;
                mh += 60;
            }
            jh = j2 - j1;
            sjam2.setText(String.valueOf(jh));
            smenit2.setText(String.valueOf(mh));
            sdetik2.setText(String.valueOf(dh));
            }
            if(m2==m1){
                if(d1>d2){
                    dh = d1 - d2;
                    mh = m1 - m2;
                    jh = j1 - j2;
                    sjam2.setText(String.valueOf(jh));
                    smenit2.setText(String.valueOf(mh));
                    sdetik2.setText(String.valueOf(dh));
                }
                if(d1<d2){
                    dh = d2 - d1;
                    mh = m2 - m1;
                    jh = j1 - j2;
                    sjam2.setText(String.valueOf(jh));
                    smenit2.setText(String.valueOf(mh));
                    sdetik2.setText(String.valueOf(dh));
                }
                if(d1 == d2){
                    dh = d2 - d1;
                    mh = m2 - m1;
                    jh = j1 - j2;
                    sjam2.setText(String.valueOf(jh));
                    smenit2.setText(String.valueOf(mh));
                    sdetik2.setText(String.valueOf(dh));
                }
            }
        }
        }
        else{
            Text tdkvld = new Text("Angka tidak valid");
            grid.add(tdkvld, 4, 4);
        }
        });
        
        close.setOnAction((e) -> {
            System.exit(0);
        });
        
        Text nama = new Text("Nama");
        grid.add(nama, 0, 6);
        
        Text NIM = new Text("NIM");
        grid.add(NIM, 0, 5);
        
        Text mike = new Text(": Michael Albert Yulianto");
        grid.add(mike, 1, 6,3, 1);
        
        Text nim72220529 = new Text(": 72220529");
        grid.add(nim72220529, 1, 5, 3, 1);
        
        Scene scene = new Scene(grid, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
    
}
