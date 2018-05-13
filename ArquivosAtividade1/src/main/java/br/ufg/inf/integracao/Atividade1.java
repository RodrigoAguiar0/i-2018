package br.ufg.inf.integracao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe com o intuito de realizar a atividade número 1 do tópico 1 da matéria Integração de Aplicações, com a função
 * de ler um arquivo recebido como parâmetro e apresentar seus 4 primeiros bytes em formato hexadecimal.
 * @author Rodrigo Aguiar
 * @version 1.0
 */
public class Atividade1 {

    /**
     * Responsável pela leitura e apresentação do arquivo recebido.
     * @param args Arquivo a ser lido com o intuito de exibir os primeiros 4 bytes em formato hexadecimal.
     */
    public static void main(String[] args) {
        Path path;

        // Recebe o path do arquivo recebido e confere se ele não é nulo
        try{
            path = Paths.get(args[0]);
        } catch (Exception e){
            System.out.println("Um arquivo não foi inserido como parâmetro");
            return;
        }
        byte[] bytes;

        try {
            bytes = Files.readAllBytes(path);
        } catch (IOException e) {
            System.out.println("O arquivo não existe. O erro gerado abaixo apresenta mais informações. Contate o " +
                    "autor do código");
            return;
        }

        //Captura os primeros 4 bytes e apresenta na saída padrão
        String bytesHexa = capturarBytes(bytes);
        System.out.println(bytesHexa);
    }

    /**
     * Responsável por ler os primeiros 4 bytes do arquivo e apresentar na saída padrão.
     * @param bytes Arquivo em bytes.
     */
    public static String capturarBytes(byte[] bytes){
        StringBuilder bytesHexa = new StringBuilder();
        for (int i = 0; i < Math.min(4, bytes.length); i++) {
            bytesHexa.append(String.format("%02X ", bytes[i]));
        }
        return bytesHexa.toString();
    }
}
