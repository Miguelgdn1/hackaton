package codigo;

public  class Universidade extends Instituicao {
    // Atributos
    private String sigla;

    // Construtor
    public Universidade(String nome, String endereco, String telefone, String sigla, String reitor) {
        super(nome, endereco, telefone);
        this.sigla = sigla;
    }

    // Getters e Setters
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
