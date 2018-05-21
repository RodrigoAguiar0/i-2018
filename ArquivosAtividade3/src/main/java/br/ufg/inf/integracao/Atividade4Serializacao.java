package br.ufg.inf.integracao;

import br.ufg.inf.integracao.RecursosAtividade4.*;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;

public class Atividade4Serializacao {

    public static void main(String[] args) throws IOException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1997,07,11);
        Comunicacao comunicacao = new Comunicacao("Telefone", "Primaria", "Nao fala bem", "Restrito");
        Representacao representacao = new Representacao("Nao se aplica", "Nao se aplica");
        Nacionalidade nacionalidade = new Nacionalidade("Goias", "Goiania", "Brasil", calendar);
        Data data = new Data(calendar, "Exata");
        LinhaDeEndereco linhaDeEndereco = new LinhaDeEndereco("Primeira ordem", 1);
        CTPS ctps = new CTPS("Primeira serie", "Passa bem");
        Certidao certidao = new Certidao("Nascimento", "Mato grosso", "Primeiro livro", "Terceira folha", "Segundo termo");
        TituloEleitoral tituloEleitoral = new TituloEleitoral("Terceira sessao", "Setor bueno");
        Nome nome = new Nome(001, "Paciente", "Rafael", "Paludo", "Conde de Sinop", "Sr", "Possivel");
        Identificador identificador = new Identificador(001, "Doutor", "Medica", "SSPMT", calendar, "Unico");
        Utilizacao utilizacao = new Utilizacao("Constante", calendar, calendar, identificador);
        Vinculo vinculo = new Vinculo("Externo", calendar, calendar, identificador);
        DadoDemografico dadoDemografico = new DadoDemografico("Nao quer falar", "Sr Paludo", "Sra Paluda", "Vai bem", "Amarelo", "Nada a declarar", "Foi so eu mesmo", "Segundo", "TI", data, nacionalidade);
        Endereco endereco = new Endereco(001, "Setor Coimbra", "Goias", 37, "Goias", "74535070", "062999999999", "Brasil", "Pais");
        Nome[] nomes = new Nome[]{
                nome
        };

        Identificador[] identificadores = new Identificador[]{
                identificador
        };
        Individuo individuo = new Individuo(001, nomes, identificadores);

        serializaPaciente(individuo);
        System.out.println("Paciente serializado");
    }

    public static void serializaPaciente(Individuo individuo) throws IOException {

        XmlMapper objMapper = new XmlMapper();

        String data = objMapper.writeValueAsString(individuo);

        Files.write(Paths.get("pacienteXML.xml"), data.getBytes(), StandardOpenOption.APPEND);
    }
}
