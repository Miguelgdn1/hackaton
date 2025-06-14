package codigo;
import java.util.List;
public class Equipe {
    private List<Estudante> membros;
    private String nome;

    public Equipe(String nome, List<Estudante> membros){
        this.nome = nome;
        this.membros = membros;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void addMembro(Estudante estudante){
        membros.add(estudante);
    }

    public List<Estudante> getMembro(){
        return membros;
    }

    public void setMembros(List<Estudante> membros){
        this.membros = membros;
    }
}
