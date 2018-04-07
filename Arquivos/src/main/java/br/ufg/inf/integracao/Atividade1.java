package br.ufg.inf.integracao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Atividade1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(args[0]);
        byte[] bytes = new byte[0];
        StringBuilder bytesHexa = new StringBuilder();
        try {
            bytes = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < Math.min(4, bytes.length); i++) {
            bytesHexa.append(String.format("%02X ", bytes[i]));
        }
        System.out.println(bytesHexa.toString());
    }
}
