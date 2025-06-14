package codigo;
public class Jurado extends Profissional {
    // Atributos
    private String nome;
    private String cpf;
    private String email;
    private String telefone;  

    // Construtor
    public Jurado(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public Jurado(String nome) {
        super(nome, "", "", "");
        this.nome = nome;
    }
// Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public double avaliar(Projeto projetoAvaliado) {
        if (projetoAvaliado == null) {
            throw new IllegalArgumentException("Projeto avaliado não pode ser nulo.");
        }
        // Gera uma nota aleatória entre 0 e 10 para este jurado
        double nota = Math.random() * 10.0;
        // Opcional: você pode adicionar essa nota ao projeto, se desejar
        // projetoAvaliado.adicionarNota(nota);
        return nota;
    }
}
