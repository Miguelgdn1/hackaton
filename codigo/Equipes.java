package codigo;

import java.util.List;
import java.util.ArrayList;

public class Equipes {
    private Equipe instance;
    private List<List<Equipe>> equipes;

    // Construtor padrão
    public Equipes() {
        this.instance = null;
        this.equipes = new ArrayList<>();
    }
    
// Getters e Setters
    public Equipe getInstance() {
        if (instance == null) {
            instance = new Equipe();
        }
        return instance;
    }
    public void setInstance(Equipe instance) {
        this.instance = instance;
    }
    public List<List<Equipe>> getEquipes() {
        return equipes;
    }
    public void setEquipes(List<List<Equipe>> equipes) {
        this.equipes = equipes;
    }

    // Método para adicionar uma equipe à lista de equipes
    public void addEquipe(List<Equipe> equipe) {
        equipes.add(equipe);
    }
}
