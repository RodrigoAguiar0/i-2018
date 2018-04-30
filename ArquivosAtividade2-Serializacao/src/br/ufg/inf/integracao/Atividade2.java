package br.ufg.inf.integracao;

import java.io.*;

public class Atividade2 implements Serializable {

    public static void main(String[] args){
        Tamagochi tamagochi = new Tamagochi(5, 6, 10);
        String filename = "file.ser";

        //Aqui se inicia a serialização e salvamento em um arquivo
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(tamagochi);
            out.close();
            file.close();
            System.out.println("Objeto serializado");
        }
        catch(IOException ex)
        {
            System.out.println("IOException");
        }


        Tamagochi tamagochi1 = null;

        // Aqui começa a descerialização e inserção no tamagochi1
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            tamagochi1 = (Tamagochi) in.readObject();

            in.close();
            file.close();

            System.out.println("Objeto descerializado ");
            System.out.println("Fome = " + tamagochi1.getFome());
            System.out.println("Felicidade = " + tamagochi1.getFelicidade());
            System.out.println("Saúde = " + tamagochi1.getSaude());
        }

        catch(IOException ex)
        {
            System.out.println("IOException");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException");
        }

    }

}
