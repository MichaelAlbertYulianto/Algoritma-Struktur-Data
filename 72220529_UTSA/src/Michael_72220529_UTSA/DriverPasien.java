/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Michael_72220529_UTSA;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author mikel
 */
public class DriverPasien extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    Text txtJudul = new Text("Data Pasien");
    Label lblKp = new Label("Kode Pasien");
    TextField txtKp = new TextField();
    Label lblNama = new Label("Nama Pasien");
    TextField txtNama = new TextField();
    Label lblAlamat = new Label("Alamat");
    TextField txtAlamat = new TextField();
    Label lblKeluhan = new Label("Keluhan");
    TextField txtKeluhan = new TextField();
    Label lblSemua = new Label("Daftar Pasien :");
    TextArea txtDaftar = new TextArea();
    Button btnTambah = new Button("Tambah");
    Label lblUrut = new Label("Urut berdasarkan");
    ComboBox cbUrut = new ComboBox();
    Label lblOrder = new Label("Jenis Urutan");
    ComboBox cbOrder = new ComboBox();
    Button btnProses = new Button("Proses Bubble Sort");
    Button btnTutup = new Button("Tutup");
    HBox hb1 = new HBox();
    HBox hb2 = new HBox();
    HBox hb3 = new HBox();

    @Override
    public void start(Stage primaryStage) throws Exception {
        txtJudul.setFont(Font.font("Arial", 28));
        hb1.getChildren().add(btnTambah);
        hb1.setAlignment(Pos.BASELINE_RIGHT);
        hb2.getChildren().add(btnTutup);
        hb2.setAlignment(Pos.BOTTOM_RIGHT);
        hb3.getChildren().addAll(cbOrder, btnProses);
        hb3.setSpacing(5);
        txtKp.setMaxWidth(80);
        txtDaftar.setMinHeight(300);
        cbUrut.getItems().addAll("Kode Pasien", "Nama", "Alamat", "Keluhan");
        cbUrut.setValue("Kode Pasien");
        cbOrder.getItems().addAll("Ascending", "Descending");
        cbOrder.setValue("Ascending");
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 500, 600);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(3);
        grid.setHgap(10);
        grid.setGridLinesVisible(false);
        grid.add(txtJudul, 0, 0, 2, 1);
        grid.add(lblKp, 0, 1);
        grid.add(txtKp, 1, 1);
        grid.add(lblNama, 0, 2);
        grid.add(txtNama, 1, 2);
        grid.add(lblAlamat, 0, 3);
        grid.add(txtAlamat, 1, 3);
        grid.add(lblKeluhan, 0, 4);
        grid.add(txtKeluhan, 1, 4);
        grid.add(hb1, 1, 5);
        grid.add(lblUrut, 0, 6);
        grid.add(cbUrut, 1, 6);
        grid.add(lblOrder, 0, 7);
        grid.add(hb3, 1, 7);
        grid.add(lblSemua, 0, 8);
        grid.add(txtDaftar, 0, 9, 2, 1);
        txtDaftar.setEditable(false);
        grid.add(hb2, 0, 10, 2, 1);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Data Mahasiswa");
        primaryStage.show();
        
        DaftarPasien dp = new DaftarPasien(50);
        dp.ambilData();
        txtDaftar.setText(dp.getAll());
        
        btnTambah.setOnAction((e) -> {
            
            String nama, kp, alamat, keluhan;
            nama = txtNama.getText();
            kp = txtKp.getText();
            alamat = txtAlamat.getText();
            keluhan = txtKeluhan.getText();
            dp.tambah(kp, nama, alamat,keluhan);
            txtDaftar.setText(dp.getAll());
            txtNama.setText("");
            txtKp.setText("");
            txtAlamat.setText("");
            txtKeluhan.setText("");
            dp.saveData();
        });
        
        btnProses.setOnAction((e) -> {
           if(cbUrut.getValue().equals("Kode Pasien")){
               dp.bubbleKp(String.valueOf(cbOrder.getValue()));
               txtDaftar.setText(dp.getAll());
           }
           else if(cbUrut.getValue().equals("Nama")){
               dp.bubbleNama(String.valueOf(cbOrder.getValue()));
               txtDaftar.setText((dp.getAll()));
           }
           else if(cbUrut.getValue().equals("Alamat")){
               dp.bubbleAlamat(String.valueOf(cbOrder.getValue()));
               txtDaftar.setText(dp.getAll());
           }
           else if(cbUrut.getValue().equals("Keluhan")){
               dp.bubbleKeluhan(String.valueOf(cbOrder.getValue()));
               txtDaftar.setText(dp.getAll());
           }
           
        });
        
        btnTutup.setOnAction((e) -> {
            System.exit(0);
        });

    }
    
}
