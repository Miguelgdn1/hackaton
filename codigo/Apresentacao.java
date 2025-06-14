package codigo;
import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private IAvaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

    public Apresentacao(Projeto projeto, IAvaliavel banca, Sala local, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }
    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    public IAvaliavel getBanca() {
        return banca;
    }
    public void setBanca(IAvaliavel banca) {
        this.banca = banca;
    }
    public Sala getLocal() {
        return local;
    }
    public void setLocal(Sala local) {
        this.local = local;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    /**
     * Método para avaliar a apresentação.
     * Chama o método avaliar da banca, se definida.
     */
    public void avaliar(){
        if (banca != null) {
            banca.avaliar();
        } else {
            System.out.println("Banca não definida para a apresentação.");
        }
    }
}
