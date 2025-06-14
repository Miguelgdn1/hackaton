package codigo;
public class Pessoa {
    private Instituicao instituicao;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Pessoa(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
    public Pessoa(Instituicao instituicao, String nome, String cpf, String email, String telefone) {
        this.instituicao = instituicao;
        this.nome = nome;
        this.cpf = "";
        this.email = "";
        this.telefone = "";
    }
    public Instituicao getInstituicao() {
        return instituicao;
    }
    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
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
}
