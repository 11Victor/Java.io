package br.com.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        // //Escrita
        // Cliente cliente = new Cliente();
        // cliente.setNome("Victor Valencio");
        // cliente.setProfissao("Desenvolvedor Java Jr.");
        // cliente.setCpf("494.135.018-90");
        
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        // oos.writeObject(cliente);
        // oos.close();

        //Leitura
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getCpf());

    }     
    


}
