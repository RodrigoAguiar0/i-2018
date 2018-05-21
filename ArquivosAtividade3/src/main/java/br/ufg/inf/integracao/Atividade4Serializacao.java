package br.ufg.inf.integracao;

import br.ufg.inf.integracao.RecursosAtividade4.Individuo;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Atividade4Serializacao {

    public static void serializaPaciente(Individuo individuo) throws IOException {

        XmlMapper objMapper = new XmlMapper();

        String data = objMapper.writeValueAsString(individuo);

        Files.write(Paths.get("pacienteXml.xml"), data.getBytes(), StandardOpenOption.APPEND);
    }
}
