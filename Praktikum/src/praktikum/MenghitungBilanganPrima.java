/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

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
public class MenghitungBilanganPrima extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    int i = 2, bil=2, dt, j, counter;
    String isi = "";
    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        stage.setTitle("Program Deret Bilangan Prima");
        Text jdl = new Text("Deret Bilangan Prima");        
        jdl.setFill(Paint.valueOf("blue"));
        Text nama = new Text("72220592 - Michael Albert Yulianto");

        nama.setFill(Paint.valueOf("orange"));
        grid.add(nama, 0, 5, 2, 1);
        GridPane.setHalignment(jdl, HPos.CENTER);
        jdl.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        grid.setGridLinesVisible(Boolean.FALSE);
        grid.add(jdl, 0, 0, 2, 1);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(15);
        grid.setHgap(10);
        
        Label pj = new Label("Panjang deret Prima yang diinginkan:");
        grid.add(pj, 0, 1);
        
        TextField data = new TextField();
        grid.add(data, 1, 1);
        data.setMaxWidth(40);
        
        Text hasil = new Text("");
        grid.add(hasil, 0, 4);
        
        Text drt = new Text("Deret yang ada minta adalah " + data.getText() + " sbb.:");
        grid.add(drt, 0, 3);
        
        Button prs = new Button("Proses");
        grid.add(prs, 0, 2 , 2, 1);
        prs.setMaxWidth(500);
        prs.setOnAction((e) -> {   
            drt.setText("Deret yang ada minta adalah " + data.getText() + " sbb.:");
            dt = Integer.parseInt(data.getText());
            while(counter < dt){                    
                boolean prima = true;
                for (j = 2; j < i-1; j++) {
                    if (i % j == 0) {
                        prima = false;
                        break;
                    }
                }
                if(prima){
                    isi = isi + String.valueOf(i) + "  ";
                    counter++;                        
                }
                i++;
            }
                hasil.setText(isi);
        });
        
        Button cls = new Button("Close");
        grid.add(cls, 1, 5);
        cls.setOnAction((e) -> {
            System.exit(0);
        });
        
        Scene sc = new Scene(grid, 400, 250);
        stage.setScene(sc);
        stage.show();
    }
    
}
