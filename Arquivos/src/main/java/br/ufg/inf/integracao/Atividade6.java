package br.ufg.inf.integracao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Atividade6 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(args[0]);
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i = 0;
        int qtdBytes;

        while(i < bytes.length){
            qtdBytes = toInt(bytes, i);
            String mensagem = new String(Arrays.copyOfRange(bytes, i, qtdBytes + i), "UTF-8");
            i += 4;
            System.out.println(mensagem);
            i += qtdBytes;
        }
    }

    private static int toInt(byte[] data, int i){
        int result =
            (data[i] << 24)&0xff000000|
            (data[i] << 16)&0x00ff000|
            (data[i] << 8)&0x0000ff00|
            (data[i] << 0)&0x000000ff;
        return result;
    }
}
