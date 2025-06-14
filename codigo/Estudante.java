package codigo;
public class Estudante extends Pessoa {
    //atributos
    private String matricula;
    private String curso;    
    private Instituicao instituicao;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;       
    //construtor
    public Estudante(Instituicao instituicao, String matricula, String curso, String nome) {
        super(instituicao);
        this.matricula = matricula;
        this.curso = curso;
        this.instituicao = instituicao;
        this.nome = nome;
        this.cpf = "";
        this.email = "";
        this.telefone = "";
    }
    public Estudante(String nome){
        super(null);
        this.nome = nome;
    }
    //get e set matricula
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    //get e set curso
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    //get e set instituicao
    @Override
    public Instituicao getInstituicao() {
        return instituicao;
    }
    @Override
    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
    //get e set nome
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    //get e set cpf
    @Override
    public String getCpf() {
        return cpf;
    }
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //get e set email
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    //get e set telefone
    @Override
    public String getTelefone() {
        return telefone;
    }
    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
    