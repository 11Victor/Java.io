package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		
        InputStream fis = new FileInputStream("lorem.txt");
        
        //Transforma bytes em caracteres
        Reader isr = new InputStreamReader(fis);
        
        //Unir os caracteres em uma linha e interpretá-los, linha a linha
        BufferedReader br = new BufferedReader(isr);
        
        
        String linha = br.readLine();
        
        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
		
		
	}

}
