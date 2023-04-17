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
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author M S I
 */
public class SegiTiga extends Application{
    public static void main(String[]args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Menghitung Luas SegiTiga");
        GridPane grid = new GridPane();
        grid.setGridLinesVisible(false);
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 20, 20, 20));
        Text scenetitle = new Text("Menghitung Luas Segitiga");
        scenetitle.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label lblalas = new Label("Alas:");
        grid.add(lblalas, 0, 2);
        
        TextField FieldAlas = new TextField();
        grid.add(FieldAlas, 1, 2);
        
        Label lbltinggi = new Label("Tinggi:");
        grid.add(lbltinggi, 0, 3);
        
        TextField FieldTinggi = new TextField();
        grid.add(FieldTinggi, 1,3);
        
        Label lblluas = new Label("Luas:");
        grid.add(lblluas, 0, 4);
        
        TextField Fieldluas  = new TextField();
        grid.add(Fieldluas, 1,4);
        Fieldluas.setEditable(false);
         
        Button btnHitung = new Button("Proses");
        Button btnClose = new Button("Close");
        HBox hb = new HBox(40);
        
        hb.setAlignment(Pos.CENTER_LEFT);
        hb.getChildren().addAll(btnHitung, btnClose);
        grid.add(hb, 0, 5, 2, 1);
        btnHitung.setOnAction((e) -> {
            Double luas;
            luas = (Double.parseDouble(FieldAlas.getText())* Double.parseDouble(FieldTinggi.getText()))/2;
            Fieldluas.setText(String.valueOf(luas));
            FieldAlas.setText("");
            FieldTinggi.setText("");
        });
        btnClose.setOnAction((e) -> {
            System.exit(0);
        });
        Text nama = new Text("Nama ");
        grid.add(nama, 0, 6);
        
        Text mike = new Text(": Michael Albert Yulianto");
        grid.add(mike, 1, 6);
        
        Text nim = new Text("NIM ");
        grid.add(nim, 0, 7);
        
        Text nim72220529 = new Text(": 72220529");
        grid.add(nim72220529, 1, 7);
        
        Scene scene = new Scene(grid, 400, 250);
        stage.setScene (scene);
        stage.show();
    }
}
