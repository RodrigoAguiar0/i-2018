package br.ufg.inf.integracao;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        String nextLine;
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(args[0]);
        byte[] bytes;
        int numberOfLines = 0;
        int anterior = 0;

        System.out.println("Digite o nome do arquivo que deseja criar");
        String caracteres = scanner.nextLine();


        reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));
        FileOutputStream fos = new FileOutputStream(caracteres);

        //peguei as linhas que tem no arquivo, e escrevi nele mesmo
        while((nextLine = reader.readLine()) != null){
            bytes = nextLine.getBytes("UTF-8");
            numberOfLines++;
        }
        fos.write(toBytes(numberOfLines));
        reader.close();

        reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));

        //to apenas mapeando onde começam e terminam as linhas
        while((nextLine = reader.readLine()) != null) {
            bytes = nextLine.getBytes("UTF-8");
            fos.write(toBytes((numberOfLines  * 4 + 4) + anterior));
            anterior += bytes.length;
        }
        reader.close();

        reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));

        //escrevendo no arquivo
        while((nextLine = reader.readLine()) != null) {
            bytes = nextLine.getBytes("UTF-8");
            fos.write(bytes);
        }
        fos.write(0xff);
        fos.close();
        reader.close();
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
