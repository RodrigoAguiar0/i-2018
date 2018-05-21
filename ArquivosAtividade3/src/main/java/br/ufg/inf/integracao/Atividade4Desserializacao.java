package br.ufg.inf.integracao;

import br.ufg.inf.integracao.RecursosAtividade4.Individuo;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Atividade4Desserializacao {

    public static void main(String[] args) {
        try {
            desserializaPaciente(args);
        } catch (IOException e) {
            System.out.println("Erro gerado porque o argumento recebido não é válido");
            e.printStackTrace();
        }
    }

    public static void desserializaPaciente(String[] args) throws IOException {
        Path arquivoXML = Paths.get(args[0]);
        BufferedReader br = Files.newBufferedReader(arquivoXML, Charset.forName("UTF-8"));
        XmlMapper objectMapper = new XmlMapper();
        StringBuilder stringBuilder = new StringBuilder();
        String data;

        while ((data = br.readLine()) != null){
            stringBuilder.append(data);
        }

        Individuo individuo = objectMapper.readValue(stringBuilder.toString().getBytes(), Individuo.class);

        System.out.println(individuo.toString());
    }
}
