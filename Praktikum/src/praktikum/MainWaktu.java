/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.HashSet;
import javafx.application.Application;
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
public class MainWaktu extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        stage.setTitle("Program Selisih Waktu");
        Text jdl = new Text("Menghitung Selisih Waktu");        
        jdl.setFill(Paint.valueOf("blue"));
        Text nama = new Text("72220592 - Michael Albert Yulianto");
        GridPane.setHalignment(nama, HPos.CENTER);
        nama.setFill(Paint.valueOf("orange"));
        grid.add(nama, 0, 1, 4, 1);
        GridPane.setHalignment(jdl, HPos.CENTER);
        jdl.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        grid.setGridLinesVisible(Boolean.FALSE);
        grid.add(jdl, 0, 0, 4, 1);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(15);
        grid.setHgap(10);
        
        Label lbw1 = new Label("Waktu 1 :");
        grid.add(lbw1, 0, 2);
        
        TextField w1 = new TextField();
        grid.add(w1, 1, 2);
        
        Label lbw2 = new Label("Waktu 2 :");
        grid.add(lbw2, 0, 3);
        
        TextField w2 = new TextField();
        grid.add(w2, 1, 3);
        
        Label hsl = new Label("Selisih Waktu :");
        grid.add(hsl, 0, 4);
        
        TextField hslt = new TextField();
        grid.add(hslt, 1, 4);
        hslt.setEditable(false);
        
        Waktu wk = new Waktu();
        
        Button htng = new Button("Hitung");
        grid.add(htng, 2, 4);
        
        Button cls = new Button("Close");
        grid.add(cls, 3, 4);
        
        htng.setOnAction((e) -> {
            wk.setWaktu1(w1.getText());
            wk.setWaktu2(w2.getText());
            w1.setText(wk.getWaktu1());
            w2.setText(wk.getWaktu2());
            hslt.setText(wk.selisihWaktu());
            
        });
        
        cls.setOnAction((e) -> {
            System.exit(0);
        });
        
        Scene sc = new Scene(grid, 400, 200);
        stage.setScene(sc);
        stage.show();
    }
}
