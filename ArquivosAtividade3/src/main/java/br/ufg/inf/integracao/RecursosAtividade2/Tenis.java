package br.ufg.inf.integracao.RecursosAtividade2;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({"esporte", "marca", "preco"})
@JacksonXmlRootElement(localName = "tenis")
public class Tenis extends calcado {
    String esporte;

    public Tenis(String esporte, String marca, int preco) {
        super(marca, preco);
        this.esporte = esporte;
    }

    public Tenis(){
        super();
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    @Override
    public String toString() {
        return "\n\n Tenis \n" +
                "Esporte: " + esporte + " \n" +
                "Marca: " + getMarca() + " \n" +
                "Preco: R$" + getPreco() + " \n";
    }
}
