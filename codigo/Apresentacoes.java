package codigo;
import java.util.List;

public class Apresentacoes {
    private Apresentacao instance;
    private List<Apresentacao> apresentacoes;


    public void addApresentacao(){
        apresentacoes.add(instance);
    }

    public Apresentacao getInstance() {
        return instance;
    }

    public List<Apresentacao> getApresentacoes() {
        return apresentacoes;
    }
}