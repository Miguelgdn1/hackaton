package codigo;
public class Sala {
    private String nome;

    public Sala(String nome, int capacidade, String localizacao) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
