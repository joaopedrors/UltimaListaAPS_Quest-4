package Questão4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTXT implements Implementador{
    public void operacaoConcreta() {
        try {
            // É criado um arquivo do tipo TXT
            File file = new File("teste.txt");

            // Se o arquivo nao existir, aqui é gerado um 
            if (!file.exists()) {
                file.createNewFile();
            }

            // Preparação pra excrever no arquivo 
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            // Ler o arquivo
            FileReader ler = new FileReader("teste.txt");
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}