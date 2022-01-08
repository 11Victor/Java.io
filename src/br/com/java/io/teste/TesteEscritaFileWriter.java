package br.com.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

//      BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//      bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//      bw.newLine();
//      bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
//      bw.close();

		FileWriter fw = new FileWriter("lorem2.txt");

		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		fw.write(System.lineSeparator());
		fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
		
		fw.close();
	}

}
