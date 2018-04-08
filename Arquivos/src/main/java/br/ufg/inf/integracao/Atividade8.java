package br.ufg.inf.integracao;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        String nextLine;
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get(args[0]);
        int linha;
        byte[] bytes = new byte[0];
        bytes = Files.readAllBytes(path);

        System.out.println("Digite o número da linha que deseja apresentar");
        linha = Integer.parseInt(scanner.nextLine());

        int numeroDeLinhas = (bytes[0] << 24)&0xff000000|
                (bytes[1] << 16)&0x00ff0000|
                (bytes[2] << 8)&0x0000ff00|
                (bytes[3] << 0)&0x000000ff;

        if(linha > numeroDeLinhas){
            System.out.println("Essa linha não existe");
        }else{
            linha *= 4;
            int linhaReal = (bytes[linha] << 24)&0xff000000|
                    (bytes[linha + 1] << 16)&0x00ff0000|
                    (bytes[linha + 2] << 8)&0x0000ff00|
                    (bytes[linha + 3] << 0)&0x000000ff;
            int fimDados = (bytes[linha] << 24)&0xff000000|
                    (bytes[linha + 1] << 16)&0x00ff0000|
                    (bytes[linha + 2] << 8)&0x0000ff00|
                    (bytes[linha + 3] << 0)&0x000000ff;

            System.out.println(new String(Arrays.copyOfRange(bytes, linhaReal, linhaReal + fimDados), "UTF-8"));
        }
    }
}

