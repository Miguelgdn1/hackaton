package codigo;
public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private double notaFinal;

    public Projeto(Profissional orientador, Equipe equipe) {
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = 0.0; // Inicializa a nota final como 0
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
}
