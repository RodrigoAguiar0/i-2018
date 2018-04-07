package br.ufg.inf.integracao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Atividade2 {

    public static void main(String[] args) {
        String bytesString;
        Path path = Paths.get(args[0]);
        byte[] bytes = new byte[0];
        StringBuilder bytesHexa = new StringBuilder();
        try {
            bytes = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < bytes.length; i++) {
            bytesHexa.append(String.format("%02X ", bytes[i]));
        }

        bytesString = bytesHexa.toString();

        if(bytesString.substring(0, 5).equals("FF D8") &&
                bytesString.substring(bytesString.length() - 6, bytesString.length() -1).equals("FF D9"))
            System.out.println("É JPEG");
        else
            System.out.printf("Não é JPEG");
    }
}
