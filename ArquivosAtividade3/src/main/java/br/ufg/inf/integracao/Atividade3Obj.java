package br.ufg.inf.integracao;

import br.ufg.inf.integracao.RecursosAtividade3.Turma;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Atividade3Obj {

    public static void main(String[] args) throws IOException {
        desserializaTurma(args[0]);
    }

    public static void desserializaTurma(String arquivo) throws IOException {
        Path arquivoXML = Paths.get(arquivo);
        BufferedReader br = Files.newBufferedReader(arquivoXML);
        XmlMapper objectMapper = new XmlMapper();
        StringBuilder builder = new StringBuilder();
        String data;

        while ((data = br.readLine()) != null) {
            builder.append(data);
        }

        Turma turma = objectMapper.readValue(builder.toString().getBytes(), Turma.class);

        System.out.println("Esta é a Turma desserializada: \n\n");
        System.out.println(turma.toString());
    }
}
