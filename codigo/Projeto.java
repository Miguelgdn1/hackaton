package codigo;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private double notaFinal;
    private String nome;
    private List<Double> notas = new ArrayList<>();

    public Projeto(Profissional orientador, Equipe equipe, String nome) {
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = 0.0;
        this.nome = nome;
    }

    public Projeto(String nome) {
        this.nome = nome;
    }
    //get e set notaFinal
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    //get e set orientador
    public Profissional getOrientador() {
        return orientador;
    }
    public void setOrientador(Profissional orientador) {
        this.orientador = orientador;
    }
    //get e set equipe
    public Equipe getEquipe() {
        return equipe;
    }
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    //get e set nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //get e set notas
    public List<Double> getNotas() {
        return notas;
    }
    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }
}
