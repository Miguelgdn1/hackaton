package codigo;

import java.util.List;

public class Equipes {
    private Equipe instance;
    private List<Equipe> equipes;

    // Construtor padrão
    public Equipes() {
        this.instance = null;
        this.equipes = new java.util.ArrayList<>();
    }
    
// Getters e Setters
    public Equipe getInstance() {
        return instance;
    }
    public void setInstance(Equipe instance) {
        this.instance = instance;
    }
    public List<Equipe> getEquipes() {
        return equipes;
    }
    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    // Método para adicionar uma equipe à lista de equipes
    public void addEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void removeEquipe(Equipe equipe) {
        equipes.remove(equipe);
    }
}
