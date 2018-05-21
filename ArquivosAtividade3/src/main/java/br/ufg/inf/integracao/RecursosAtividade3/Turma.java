package br.ufg.inf.integracao.RecursosAtividade3;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Arrays;

@JsonPropertyOrder({"disciplina", "estudantes"})
@JacksonXmlRootElement(localName = "turma")
public class Turma {
    private String disciplina;
    private Estudante[] estudantes;

    public Turma(String disciplina, Estudante[] estudantes) {
        super();
        this.disciplina = disciplina;
        this.estudantes = estudantes;
    }

    public Turma() {
        super();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    @Override
    public String toString(){
        return"Turma|: \n" +
                "Disciplina: " + disciplina + "\n" +
                "Estudantes: " + Arrays.toString(estudantes);
    }
}
