package br.ufg.inf.integracao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Atividade3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
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

        String bytesUTF = new String(bytes, "UTF-8");

        System.out.println(bytesUTF);
    }
}
