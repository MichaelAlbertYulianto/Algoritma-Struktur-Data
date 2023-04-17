/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

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
 * @author M S I
 */
public class DriverMahasiswa extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Text txtJudul = new Text("Data Mahasiswa");
    Label lblNim = new Label("Nim");
    TextField txtNim = new TextField();
    Label lblNama = new Label("Nama");
    TextField txtNama = new TextField();
    Label lblKota = new Label("Kota");
    TextField txtKota = new TextField();
    Label lblSemua = new Label("Daftar Mahasiswa :");
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
        txtNim.setMaxWidth(80);
        txtDaftar.setMinHeight(300);
        cbUrut.getItems().addAll("Nim", "Nama", "Kota");
        cbUrut.setValue("Nim");
        cbOrder.getItems().addAll("Ascending", "Descending");
        cbOrder.setValue("Ascending");
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 500, 600);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(3);
        grid.setHgap(10);
        grid.setGridLinesVisible(false);
        grid.add(txtJudul, 0, 0, 2, 1);
        grid.add(lblNim, 0, 1);
        grid.add(txtNim, 1, 1);
        grid.add(lblNama, 0, 2);
        grid.add(txtNama, 1, 2);
        grid.add(lblKota, 0, 3);
        grid.add(txtKota, 1, 3);
        grid.add(hb1, 1, 4);
        grid.add(lblUrut, 0, 5);
        grid.add(cbUrut, 1, 5);
        grid.add(lblOrder, 0, 6);
        grid.add(hb3, 1, 6);
        grid.add(lblSemua, 0, 7);
        grid.add(txtDaftar, 0, 8, 2, 1);
        grid.add(hb2, 0, 9, 2, 1);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Data Mahasiswa");
        primaryStage.show();
        
        DaftarMahasiswa dm = new DaftarMahasiswa(50);
        dm.ambilData();
        txtDaftar.setText(dm.getAll());
        
        btnTambah.setOnAction((e) -> {
            
            String nama, nim, kota;
            nama = txtNama.getText();
            nim = txtNim.getText();
            kota = txtKota.getText();
            dm.tambah(nim, nama, kota);
            txtDaftar.setText(dm.getAll());
            txtNama.setText("");
            txtNim.setText("");
            txtKota.setText("");
            dm.saveData();
        });
        
        btnProses.setOnAction((e) -> {
           if(cbUrut.getValue().equals("Nim")){
               dm.bubbleNim(String.valueOf(cbOrder.getValue()));
               txtDaftar.setText(dm.getAll());
           }
           else if(cbUrut.getValue().equals("Nama")){
               dm.bubbleNama(String.valueOf(cbOrder.getValue()));
               txtDaftar.setText((dm.getAll()));
           }
           else if(cbUrut.getValue().equals("Kota")){
               dm.bubbleKota(String.valueOf(cbOrder.getValue()));
               txtDaftar.setText(dm.getAll());
           }
           
        });
        
        btnTutup.setOnAction((e) -> {
            System.exit(0);
        });
    }
}
