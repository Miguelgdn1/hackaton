package codigo;
public class Pessoa {
    private Instituicao instituicao;

    public Pessoa(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
    public Instituicao getInstituicao() {
        return instituicao;
    }
    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
}
