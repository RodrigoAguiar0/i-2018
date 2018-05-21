package br.ufg.inf.integracao;

import br.ufg.inf.integracao.RecursosAtividade4.Individuo;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe com o intuito de realizar a atividade número 4 do tópico 3 da matéria Integração de Aplicações, com a função
 * de desserializar um objeto de xml para objeto Java
 * @author Rodrigo Aguiar
 * @version 1.0
 */
public class Atividade4Desserializacao {

    /**
     * Responsável por chamar a função de desserializaç~ão e receber os argumentos com o arquivo a ser desserializado
     * @param args Arquivo xml a ser desserializado
     */
    public static void main(String[] args) {
        try {
            desserializaPaciente(args);
        } catch (IOException e) {
            System.out.println("Erro gerado porque o argumento recebido não é válido");
            e.printStackTrace();
        }
    }

    /**
     * Responsável por desserializar o arquivo
     * @param args Arquivo a ser desserializado
     * @throws IOException Ocorre caso não seja possível ler o arquivo gerado
     */
    public static void desserializaPaciente(String[] args) throws IOException {

        //Criação dos leitores responsáveis pela desserialização
        Path arquivoXML = Paths.get(args[0]);
        BufferedReader br = Files.newBufferedReader(arquivoXML, Charset.forName("UTF-8"));
        XmlMapper objectMapper = new XmlMapper();
        StringBuilder stringBuilder = new StringBuilder();
        String data;

        //Criação da string com os dados
        while ((data = br.readLine()) != null){
            stringBuilder.append(data);
        }

        //Criação do objeto serializado com as informações adquiridas através do arquivo
        Individuo individuo = objectMapper.readValue(stringBuilder.toString().getBytes(), Individuo.class);

        System.out.println("Indivíduo desserializado");
        System.out.println(individuo.toString());
    }
}
