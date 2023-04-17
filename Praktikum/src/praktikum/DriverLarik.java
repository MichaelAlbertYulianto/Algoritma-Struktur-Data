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
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author mikel
 */
public class DriverLarik extends Application{
    public static void main(String[] args) {
        launch(args);
    }
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
        
        Scene sc = new Scene(grid, 300, 200);
        stage.setScene(sc);
        stage.show();
    }
    
}
