package br.ufg.inf.integracao;

import java.io.Serializable;

public class Tamagochi implements Serializable {
    private int fome;
    private int saude;
    private int felicidade;

    public Tamagochi(int fome, int saude, int felicidade) {
        this.fome = fome;
        this.saude = saude;
        this.felicidade = felicidade;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }
}
