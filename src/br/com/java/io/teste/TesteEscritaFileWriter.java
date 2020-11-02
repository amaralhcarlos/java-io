package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		//OutputStream fos = new FileOutputStream("ispum.txt");
		//Writer osw = new OutputStreamWriter(fos);
		//BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("ipsumFileWriter.txt"));
		
		bw.write("Teste de escrita em arquivo");
		bw.newLine();
		bw.write("Criada uma nova linha de novo");
		
		bw.close();
	}
}
