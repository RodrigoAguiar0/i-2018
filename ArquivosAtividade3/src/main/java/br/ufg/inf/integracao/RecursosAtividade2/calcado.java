package br.ufg.inf.integracao.RecursosAtividade2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "calcados")
public class calcado {

    String marca;
    float preco;

    public calcado(String marca, float preco) {
        super();
        this.marca = marca;
        this.preco = preco;
    }

    public calcado(){
        super();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
