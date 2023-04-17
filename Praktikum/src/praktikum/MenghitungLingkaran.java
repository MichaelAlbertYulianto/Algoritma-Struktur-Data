/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
public class MenghitungLingkaran extends Application{
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
        stage.setTitle("Menghitung Luas dan Keliling Lingkaran");
        
        Text judul = new Text("Menghitung Luas dan Keliling Lingkaran");
        judul.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        grid.add(judul, 0, 0, 2, 1);
        
        Label jari = new Label("Jari-jari:");
        grid.add(jari, 0, 1);
        
        Label keliling = new Label("Keliling:");
        grid.add(keliling, 0, 3);
        
        Label luas = new Label("Luas:");
        grid.add(luas, 0, 2);
        
        TextField fieldjari = new TextField();
        grid.add(fieldjari, 1, 1);
        
        TextField fieldkeliling = new TextField();
        grid.add(fieldkeliling, 1, 3);
        fieldkeliling.setEditable(false);
        
        TextField fieldluas = new TextField();
        grid.add(fieldluas, 1, 2);
        fieldluas.setEditable(false);
        
        Button proses = new Button("Proses");
        
        Button close = new Button("Close");
        
        HBox hb = new HBox(40);
        hb.getChildren().addAll(proses, close);
        grid.add(hb, 0, 4, 2,1);
        
        proses.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Double luas, keliling;
                keliling = Math.PI*2*Double.parseDouble(fieldjari.getText());
                fieldkeliling.setText(String.valueOf(keliling));
                luas = Math.PI*Double.parseDouble(fieldjari.getText())*Double.parseDouble(fieldjari.getText());
                fieldluas.setText(String.valueOf(luas));
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
        grid.add(mike, 1, 6);
        
        Text nim72220529 = new Text(": 72220529");
        grid.add(nim72220529, 1, 5);
        
        Scene scene = new Scene(grid, 450, 200);
        stage.setScene(scene);
        stage.show();
    }
    
}
