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

/**
 * Classe com o intuito de realizar a atividade número 3 do tópico 3 da matéria Integração de Aplicações, com a função
 * de criar um objeto e convertê-lo para um arquivo xml, serializando-o
 * @author Rodrigo Aguiar
 * @version 1.0
 */
public class Atividade3Xml {


    /**
     * Responsável pela criaçao do objeto a ser serializado
     * @param args
     */
    public static void main(String[] args) {
        Turma turma = new Turma();

        //Criação dos endereços que serão usandos para o objeto turma
        Endereco[] enderecos = new Endereco[]{
                new Endereco("9877897987", "Rua na sua casa", 1124, "Casa vermelha"),
                new Endereco("321231362", "Rua na sua vizinha", 4564, "Casa amarela"),
        };

        //Criação dos estudantes que serão usandos para o objeto turma
        Estudante[] estudantes = new Estudante[] {
                new Estudante("Leo", enderecos[0]),
                new Estudante("Luiz da rua", enderecos[0]),
                new Estudante("Seu jose", enderecos[1])
        };

        //Criação da turma com os componentes criados
        turma.setEstudantes(estudantes);
        turma.setDisciplina("Integracao");

        //Serialização com o parâmetro turma
        try {
            serializaTurma(turma);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    /**
     * Responsável por serializar o objeto recebido para o formato xml
     * @param turma Objeto a ser serializado
     * @throws IOException Ocorre caso o argumento recebido não possa ser lido
     * @throws XMLStreamException Ocorre caso não seja possível escrever um arquivo xml
     */
    public static void serializaTurma(Turma turma) throws IOException, XMLStreamException {

        XmlMapper objMapper = new XmlMapper();

        String data = objMapper.writeValueAsString(turma);

        Files.write(Paths.get("turmaXML.xml"), data.getBytes(), StandardOpenOption.APPEND);
    }

}
