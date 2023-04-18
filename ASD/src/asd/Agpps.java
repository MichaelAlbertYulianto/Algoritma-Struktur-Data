/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asd;

/**
 *
 * @author M S I
 */
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Agpps extends Application{
    public static void main(String[] args) {
         launch(args);
    }
    Statistik st = new Statistik(99);
    
    Text judul = new Text("Program perhitungan statistik");
    
    Label masuk = new Label   ("Masukkan data : ");
    Label hasil = new Label  ("Hasil perhitungan :");
    Label semua = new Label   ("Semua data");
    Label banyak = new Label   ("Banyak data");
    Label jumlah = new Label   ("Jumlah");
    Label rata = new Label   ("Rata-rata");
    Label min = new Label   ("Minimum");
    Label max = new Label   ("Maximum");
    Label genap = new Label   ("Genap");
    Label ganjil = new Label   ("Ganjil");
    Label buah = new Label   ("buah");
    Label buahh = new Label   ("buah");

    Label nama = new Label  ("72220577-Mario Aditya Kurnianto");

    TextField fmasuk = new TextField(); 
    
    TextField fsemua = new TextField(); 
    TextField fbanyak = new TextField(); 
    
    TextField fjumlah = new TextField(); 
    TextField frata = new TextField(); 
    
    TextField fmin = new TextField(); 
    TextField fmax = new TextField(); 
    
    GridPane gp = new GridPane();
    
    Button pro = new Button("Proses");
    Button cls = new Button("Close");

    HBox hb = new HBox(10);    
    
    @Override
    public void start(Stage stage) throws Exception {
    judul.setFont(Font.font("Bold", 25));
    judul.setFill(Paint.valueOf("blue"));
    judul.setTextAlignment(TextAlignment.CENTER);
    nama.setTextFill(Paint.valueOf("green"));
    
    gp.add(judul, 0, 0,5,1);
    
    gp.add(masuk, 0, 1); 
    gp.add(hasil, 0, 2);
    gp.add(semua, 0, 3);
    gp.add(banyak, 0, 4);
    gp.add(jumlah, 0, 5);
    gp.add(rata, 0, 6);
    gp.add(min, 2, 5);
    gp.add(max, 2, 6);
    
    gp.add(nama, 0, 7,2,1);
    
    gp.add(fmasuk, 1, 1);
    gp.add(fsemua, 1, 3,4,1);
    gp.add(fbanyak, 1, 4);
    gp.add(fjumlah, 1, 5);
    gp.add(frata, 1, 6);
    gp.add(fmin, 3, 5);
    gp.add(fmax, 3, 6);
    
    gp.add(pro, 2, 1);
    gp.add(cls, 4, 7);
   
    fmasuk.setMaxWidth(60);
    fbanyak.setMaxWidth(60);
    fjumlah.setMaxWidth(60);
    frata.setMaxWidth(60);
    fmin.setMaxWidth(60);
    fmax.setMaxWidth(60);

    
    pro.setOnAction((event) -> {
     
    st.addData(Double.parseDouble(fmasuk.getText()));
    
    fsemua.setText(String.valueOf(st.ambilData()));
    fbanyak.setText(String.valueOf(st.banyakdata()));
    fjumlah.setText(String.valueOf(st.sum()));
    frata.setText(String.valueOf(st.avg()));
    fmin.setText(String.valueOf(st.minimum()));
    fmax.setText(String.valueOf(st.maksimum()));
        
    });
    
    cls.setOnAction((event) -> {
    System.exit(0);
    });
    
    gp.setGridLinesVisible(false); //show grid line

    gp.setAlignment(Pos.BASELINE_CENTER);
    gp.setVgap(10);
    gp.setHgap(10);

    Scene sc = new Scene(gp,650,600);
    stage.setScene(sc);

    stage.setTitle("Program perhitungan statistik");
    stage.show();
    }
}