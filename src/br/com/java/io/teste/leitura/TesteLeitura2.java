package br.com.java.io.teste.leitura;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

//		String linha = scanner.nextLine();
//        System.out.println(linha);

		/*
		 * O Scanner possui o m�todo "hasNextLine", que devolve false quando n�o existe
		 * mais nenhum conte�do a ser lido. Ent�o, enquanto ainda houver conte�do, ou
		 * seja, enquanto o m�todo hasNextLine retornar true, leia a linha e imprima-a
		 */
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f%n", tipoConta, agencia, numero,
					titular, saldo);

			linhaScanner.close();
		}

		scanner.close();

	}

}
