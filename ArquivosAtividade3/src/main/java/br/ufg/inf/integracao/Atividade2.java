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

public class Atividade2 {

    public static void main(String[] args) throws XMLStreamException, IOException {
        Path arquivoXML = Paths.get(args[0]);
        BufferedReader br = Files.newBufferedReader(arquivoXML, Charset.forName("UTF-8"));
        StringBuilder builder = new StringBuilder();

        XMLInputFactory2 f = (XMLInputFactory2) XMLInputFactory2.newFactory();
        XMLStreamReader2 sr = (XMLStreamReader2) f.createXMLStreamReader(new FileInputStream(args[0]));
        XmlMapper objectMapper = new XmlMapper();

        calcado c = null;

        sr.next();
        sr.next();

        while (!sr.isEndElement()) {

            try {
                if (sr.getLocalName().equals("tenis")) {
                    c = objectMapper.readValue(sr, Tenis.class);
                } else {
                    c = objectMapper.readValue(sr, Sapato.class);
                }
            } catch (UnrecognizedPropertyException e) {
                System.out.println("Uma propriedade desconhecida foi encontrada. É provável que este arquivo contenha algum objeto"
                        + "não mapeado, portanto, não é utilizável nesta função.");
            }

            System.out.println(c.toString());

            sr.next();
        }

        System.out.println("\n fim do conteúdo \n");
    }
}