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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Paint;

/**
 *
 * @author M S I
 */
public class DeretFibonacci extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        stage.setTitle("Program Deret Fibonacci");
        Text jdl = new Text("Deret Fibonacci");        
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
        
        Label msk = new Label("Masukkan panjang deret :");
        grid.add(msk, 0, 2, 2, 1);
        
        TextField data = new TextField();
        grid.add(data, 2, 2);
        data.setMaxWidth(80);
        
        Button prs = new Button("Proses");
        grid.add(prs, 3 ,2);
        
        Label hsl = new Label("Hasil :");
        grid.add(hsl, 0, 4);
        
        TextArea thsl = new TextArea("");
        grid.add(thsl, 1, 4, 4, 1);
        
        Button cls = new Button("Close");
        grid.add(cls, 3, 5);
        GridPane.setHalignment(cls, HPos.RIGHT);
        
        prs.setOnAction((e) -> {
            int input = Integer.parseInt(data.getText()), i, fib1 = 0, fib2 = 1, fib3;
            String hasil = "";
            if(input == 1){
                hasil = String.valueOf(fib1);
                thsl.setText(hasil);
            }
            if(input == 2){
                hasil = String.valueOf(fib1) + "  " + String.valueOf(fib2);
                thsl.setText(hasil);
            }
            if(input>2){
                hasil = String.valueOf(fib1) + "  " + String.valueOf(fib2) + "  ";
                for(i = 3 ; i <=input ; i++){
                    fib3 = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = fib3;
                    hasil = hasil + String.valueOf(fib3) + "  ";
                }
                thsl.setText(hasil);
            }
        });
        
        cls.setOnAction((e) -> {
            System.exit(0);
        });
        thsl.setPrefSize(5, 5);
        thsl.setEditable(false);
        thsl.setWrapText(true);
        thsl.setStyle("-fx-background-color: WHITE ;"+ "-fx-text-fill: BLACK;"+ "-fx-font-size: 12pt;");
        Scene sc = new Scene(grid, 400, 300);
        stage.setScene(sc);
        stage.show();
    }
    
}
