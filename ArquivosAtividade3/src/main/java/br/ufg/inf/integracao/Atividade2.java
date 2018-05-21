package br.ufg.inf.integracao;

import br.ufg.inf.integracao.RecursosAtividade2.calcado;
import br.ufg.inf.integracao.RecursosAtividade2.Sapato;
import br.ufg.inf.integracao.RecursosAtividade2.Tenis;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import org.codehaus.stax2.XMLInputFactory2;
import org.codehaus.stax2.XMLStreamReader2;

import javax.xml.stream.XMLStreamException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe com o intuito de realizar a atividade número 2 do tópico 3 da matéria Integração de Aplicações, com a função
 * de listar os calçados que existem no xml.
 * @author Rodrigo Aguiar
 * @version 1.0
 */
public class Atividade2 {

    /**
     * Responsável por receber o xml, e conventer em objetos, além de apresentar
     * @param args Arquivo Xml no padrão necessário para a conversão, no formato .xml
     * @throws XMLStreamException Caso o arquivo não esteja no formato necessário para a conversão
     * @throws IOException Caso não seja possível ler o arquivo por problemas no reader
     */
    public static void main(String[] args) throws XMLStreamException, IOException {

        //Aqui, são criados os readers responsáveis por ler o xml
        XMLInputFactory2 f = (XMLInputFactory2) XMLInputFactory2.newFactory();
        XMLStreamReader2 sr = (XMLStreamReader2) f.createXMLStreamReader(new FileInputStream(args[0]));
        XmlMapper objectMapper = new XmlMapper();

        //O objeto é limpo para a leitura
        calcado c = null;

        //São puladas as duas primeiras linhas de tags, para que a leitura seja diretamente no conteúdo interior
        sr.next();
        sr.next();

        //O arquivo é lido até que se acabe o conteúdo nele
        while (!sr.isEndElement()) {

            try {
                if (sr.getLocalName().equals("tenis")) {
                    c = objectMapper.readValue(sr, Tenis.class);
                } else {
                    c = objectMapper.readValue(sr, Sapato.class);
                }
            } catch (UnrecognizedPropertyException e) {
                System.out.println("Propriedade não previamente mapeada");
            }

            //Listagem do objeto
            System.out.println(c.toString());

            sr.next();
        }

        System.out.println("\n fim do conteúdo \n");
    }
}