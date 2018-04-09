package br.ufg.inf.integracao;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        String nextLine;
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(args[0]);
        byte[] bytes;

        System.out.println("Digite os caracteres que deseja incluir no arquivo");
        String caracteres = scanner.nextLine();

        reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));
        FileOutputStream fos = new FileOutputStream(caracteres);
        while((nextLine = reader.readLine()) != null){
            bytes = nextLine.getBytes("UTF-8");
            fos.write(toBytes(bytes.length));
            fos.write(bytes);
        }
        fos.close();
    }

    private static byte[] toBytes(int i){

        byte[] result = new byte[4];

        result[0] = (byte) (i >> 24);
        result[1] = (byte) (i >> 16);
        result[2] = (byte) (i >> 8);
        result[3] = (byte) (i);

        return result;
    }
}
