package br.ufg.inf.integracao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) throws IOException {
        BufferedWriter writer;
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(args[0]);
        byte[] bytes;

        System.out.println("Digite os caracteres que deseja incluir no arquivo");
        String caracteres = scanner.nextLine();

        bytes = caracteres.getBytes();

        String bytesUTF = new String(bytes, "UTF-8");

        writer = new BufferedWriter(new FileWriter(String.valueOf(path)));
        writer.write(bytesUTF);

        writer.close();
    }
}
