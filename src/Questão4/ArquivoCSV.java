package Questão4;


import java.io.File;
import java.io.FileWriter;

public class ArquivoCSV implements Implementador{
    private static final String CSV = "testecsv.csv";
    public void operacaoConcreta() {
        
        try {
            FileWriter fw = new FileWriter(new File(CSV));     
        }catch (Exception e) {
            e.printStackTrace();
        } 
    }
}