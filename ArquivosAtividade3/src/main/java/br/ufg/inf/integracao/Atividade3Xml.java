package br.ufg.inf.integracao;

import br.ufg.inf.integracao.RecursosAtividade3.Endereco;
import br.ufg.inf.integracao.RecursosAtividade3.Estudante;
import br.ufg.inf.integracao.RecursosAtividade3.Turma;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Atividade3Xml {

    public static void main(String[] args) {
        Turma turma = new Turma();

        Endereco[] enderecos = new Endereco[]{
                new Endereco("9877897987", "Rua na sua casa", 1124, "Casa vermelha"),
                new Endereco("321231362", "Rua na sua vizinha", 4564, "Casa amarela"),
        };

        Estudante[] estudantes = new Estudante[] {
                new Estudante("Leo", enderecos[0]),
                new Estudante("Luiz da rua", enderecos[0]),
                new Estudante("Seu jose", enderecos[1])
        };

        turma.setEstudantes(estudantes);
        turma.setDisciplina("Integracao");

        try {
            serializaTurma(turma);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    public static void serializaTurma(Turma turma) throws IOException, XMLStreamException {

        XmlMapper objMapper = new XmlMapper();

        String data = objMapper.writeValueAsString(turma);

        Files.write(Paths.get("turmaXML.xml"), data.getBytes(), StandardOpenOption.APPEND);
    }

}
