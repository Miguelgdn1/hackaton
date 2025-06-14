package codigo;
import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private IAvaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

    public void avaliar(){
        if (banca != null) {
            banca.avaliar();
        } else {
            System.out.println("Banca não definida para a apresentação.");
        }
    }
}
