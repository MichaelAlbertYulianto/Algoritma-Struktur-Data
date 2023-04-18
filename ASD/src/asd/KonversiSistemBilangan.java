package Asd;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KonversiSistemBilangan extends Application {
    
    public static void main (String[] args){
     launch (args);
    }
    
    Text judul = new Text("Konversi Sistem Bilangan ");
    Text nama = new Text("72220577-Mario Aditya Kurnianto");
    
    GridPane gp = new GridPane();
    
    Label masuk = new Label("Masukkan Decimal : ");
    Label kon = new Label("Konversi : ");
    Label keluar = new Label("Hasil : ");
    
    TextField fmasuk = new TextField();
    TextField fkeluar = new TextField();
    
    Button cls = new Button("Close");
    Button pro = new Button("Proses");
    
    ComboBox cb = new ComboBox();
    
    String temp,out;
    int count,a,b,c,d,j;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
    judul.setFont(Font.font("Bold",20));
    judul.setFill(Paint.valueOf("blue"));
    nama.setFill(Paint.valueOf("orange"));
    GridPane.setHalignment(judul, HPos.CENTER);
    GridPane.setHalignment(nama, HPos.CENTER);
   
     
    gp.add(judul,0,0,3,1);
    gp.add(nama,0,1,3,1);
    
    gp.add(masuk,0,2);
    gp.add(keluar,0,4);
    
    gp.add(kon,0,3);
    gp.add(cb,1,3);
    
    
    gp.add(fmasuk,1,2,2,1);
    gp.add(fkeluar,1,4,2,1);
    fmasuk.setMaxWidth(120);
    fkeluar.setMaxWidth(120);
    
    gp.add(pro,0,5);
    gp.add(cls,1,5);
    
    cb.getItems().addAll("Binary","Octal","Hexadecimal");
    cb.setValue("Binary");
    
    pro.setOnAction((event) -> {
        
        temp = String.valueOf(cb.getValue());
                
        int trash = Integer.parseInt(fmasuk.getText());
        
        if(temp=="Binary"){
        
        }
        else if(temp=="Octal"){}
        else{}
        
            switch (temp){
                case "Binary":
                    a=trash%2;
                    count = trash/2;
                    b=count%2;
                    count /=2;
                    c=count%2;
                    count /=2;
                    d=count%2;
                    count /=2;
                    
                    out =String.valueOf(count+""+d+""+c+""+b+""+a);
                    break;
                case "Octal":
                    a=trash%8;
                    count = trash/8;
                    b=count%8;
                    count /=8;
                    c=count%8;
                    
                    out =String.valueOf(count+""+c+""+b+""+a);
                    break;
                default:
                    while (trash!=0){
                        a=trash%16;
                        if(trash<10){out=String.valueOf(a+trash);}
                        else{
                            if(out=="10"){temp="A";}
                            else if(out=="11"){temp="B";}
                            else if(out=="12"){temp="C";}
                            else if(out=="13"){temp="D";}
                            else if(out=="14"){temp="E";}
                            else if(out=="15"){temp="F";}
                            else {
                            for(j=0;j<=9;j++){j=0;}
                            temp = String.valueOf(j);
                            }
                            
                            out=String.valueOf(temp+""+a+55);}
                        
                        trash /= 16;
                    }
                    out=out;
                    break;
                
            }
            
        
        fkeluar.setText(out);
        
    });
    
    cls.setOnAction((event) -> {
    System.exit(0);
    });
    
    gp.setGridLinesVisible(false); //show grid line

    gp.setAlignment(Pos.BASELINE_CENTER);
    gp.setVgap(10);
    gp.setHgap(10);

    Scene sc = new Scene(gp,400,200);
    stage.setScene(sc);

    stage.setTitle(judul.getText());
    stage.show();

    }
    
}