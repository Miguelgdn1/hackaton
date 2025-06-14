package codigo;
import java.util.List;
public class Equipe {
    private List<Estudante> membros;
    private String nome;

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
        
    }


}
