package br.ufg.inf.integracao.RecursosAtividade3;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({"nome", "endereco"})
@JacksonXmlRootElement(localName = "estudante")

public class Estudante {
    private String nome;
    private Endereco endereco;

    public Estudante(String nome, Endereco endereco) {
        super();
        this.nome = nome;
        this.endereco = endereco;
    }

    public Estudante() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Estudante\n" +
                "Nome: " + nome + " \n" +
                "Endereco: " + endereco.toString() + " \n";
    }
}