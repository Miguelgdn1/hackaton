package codigo;

import java.util.List;
import java.util.ArrayList;

public class Apresentacoes {
    private Apresentacao instance;
    private List<Projeto> projetos;

    // Construtor padrão
    public Apresentacoes() {
        this.instance = null;
        projetos = new ArrayList<>();
    }

    // Getters e Setters
    public Apresentacao getInstance() {
        if (instance == null) {
            instance = new Apresentacao();
        }
        return instance;
    }

    public void setInstance(Apresentacao instance) {
        this.instance = instance;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    public void addProjeto(Projeto projeto){
        projetos.add(projeto);
    }
}