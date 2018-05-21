package br.ufg.inf.integracao.RecursosAtividade2;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Arrays;

@JsonPropertyOrder ({"cor", "marca", "preco"})
@JacksonXmlRootElement(localName = "sapato")
public class Sapato extends calcado {
    int[] cor;

    public Sapato(int[] cor, String marca, float preco) {
        super(marca, preco);
        this.cor = cor;
    }

    public Sapato(){
        super();
    }

    public int[] getCor() {
        return cor;
    }

    public void setCor(int[] cor) {
        this.cor = cor;
    }

    @Override
    public String toString(){
        return "\n\n Sapato: \n" +
                "Cor: " + Arrays.toString(cor) + "\n" +
                "Marca: " + getMarca() + " \n" +
                "Preco: R$" + getPreco() + " \n";
    }
}
