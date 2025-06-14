package codigo;
import java.util.List;

public class Apresentacoes {
    private Apresentacao instance;
    private List<Apresentacao> apresentacoes;

    // Construtor padrão
    public Apresentacoes() {
        this.instance = null;
        this.apresentacoes = new java.util.ArrayList<>();
    }

    // Getters e Setters
    public Apresentacao getInstance() {
        return instance;
    }

    public void setInstance(Apresentacao instance) {
        this.instance = instance;
    }

    public List<Apresentacao> getApresentacoes() {
        return apresentacoes;
    }

    public void setApresentacoes(List<Apresentacao> apresentacoes) {
        this.apresentacoes = apresentacoes;
    }

    public void addApresentacao(){
        apresentacoes.add(instance);
    }
}