package codigo;
import java.util.Map;

public class Banca implements IAvaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;

    public Banca(Projeto projetoAvaliado, Map<Jurado, Integer> jurados) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = jurados;
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }
    public void setProjetoAvaliado(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }
    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }
    public void setJurados(Map<Jurado, Integer> jurados) {
        this.jurados = jurados;
    }

    @Override
    public double avaliar() {
        double notaFinal = 0.0;
        for (Map.Entry<Jurado, Integer> entry : jurados.entrySet()) {
            Jurado jurado = entry.getKey();
            int nota = entry.getValue();
            notaFinal += jurado.avaliar(projetoAvaliado) * nota;
        }
        return notaFinal;
    }

    @Override
    public void calcularNotaFinal() {
        // Implementação do método para calcular a nota final
        double notaFinal = avaliar();
        projetoAvaliado.setNotaFinal(notaFinal);
    }
}
