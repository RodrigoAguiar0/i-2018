package br.ufg.inf.integracao;

import br.ufg.inf.integracao.RecursosAtividade3.Turma;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe com o intuito de realizar a atividade número 3 do tópico 3 da matéria Integração de Aplicações, com a função
 * de ler um arquivo recebido como parâmetro no formato XMl e converter para um objeto, desserializando-o
 * @author Rodrigo Aguiar
 * @version 1.0
 */
public class Atividade3Obj {

    /**
     * Responsável pela chamada do método de desserialização
     * @param args Arquivo em formato xml a ser desserializado
     * @throws IOException Caso não seja possível ler o arquivo no formato encontrado.
     */
    public static void main(String[] args) throws IOException {
        desserializaTurma(args[0]);
    }

    /**
     * Responsável por retornar o arquivo xml para um objeto.
     * @param arquivo Arquivo recebido como parâmetro para ser desserializado
     * @throws IOException Caso não seja possível ler o arquivo, a excessão é gerada
     */
    public static void desserializaTurma(String arquivo) throws IOException {
        //Aqui, os recursos são alocados e instanciados para a leitura
        Path arquivoXML = Paths.get(arquivo);
        BufferedReader br = Files.newBufferedReader(arquivoXML);
        XmlMapper objectMapper = new XmlMapper();
        StringBuilder builder = new StringBuilder();
        String data;

        //Aqui a String é construída com o arquivo a ser descerializado
        while ((data = br.readLine()) != null) {
            builder.append(data);
        }

        //O objeto turma recebe os valores adquiridos pelo arquivo xml
        Turma turma = objectMapper.readValue(builder.toString().getBytes(), Turma.class);

        System.out.println("Esta é a Turma desserializada: \n\n");
        System.out.println(turma.toString());
    }
}
