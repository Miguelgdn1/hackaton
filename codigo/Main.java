package codigo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Criar equipes com 5 alunos cada
        List<Estudante> equipe1 = Arrays.asList(
            new Estudante("Ana Silva"), new Estudante("Bruno Costa"), new Estudante("Carla Souza"),
            new Estudante("Diego Martins"), new Estudante("Eduarda Lima")
        );

        List<Estudante> equipe2 = Arrays.asList(
            new Estudante("Felipe Rocha"), new Estudante("Gabriela Alves"), new Estudante("Henrique Pinto"),
            new Estudante("Isabela Duarte"), new Estudante("João Mendes")
        );

        // Adicionar projetos para cada equipe
        Projeto projeto1 = new Projeto("SmartRecycle - Sistema Inteligente de Reciclagem");
        Projeto projeto2 = new Projeto("HealthConnect - Plataforma de Saúde Integrada");

        // Criar bancas avaliadoras (4 jurados por projeto)
        List<Jurado> banca1 = Arrays.asList(
            new Jurado("Mariana Torres"), new Jurado("Ricardo Gomes"),
            new Jurado("Patrícia Fernandes"), new Jurado("Lucas Almeida")
        );

        List<Jurado> banca2 = Arrays.asList(
            new Jurado("Sofia Ribeiro"), new Jurado("Thiago Carvalho"),
            new Jurado("Camila Barros"), new Jurado("André Oliveira")
        );

        Map<Jurado, Double> notasProjeto1 = new HashMap<>();
        Map<Jurado, Double> notasProjeto2 = new HashMap<>();

        // Cada jurado avalia o projeto UMA VEZ e armazena a nota
        for (Jurado jurado : banca1) {
            notasProjeto1.put(jurado, jurado.avaliar(projeto1));
        }
        for (Jurado jurado : banca2) {
            notasProjeto2.put(jurado, jurado.avaliar(projeto2));
        }

        projeto1.setNotaFinal(
        Math.round(notasProjeto1.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0)
        ));
        projeto2.setNotaFinal(
        Math.round(notasProjeto2.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0)
        ));
        // Listar projetos com nota final >= 7
        List<Projeto> projetos = Arrays.asList(projeto1, projeto2);
        List<Projeto> projetosAprovados = projetos.stream()
            .filter(projeto -> projeto.getNotaFinal() >= 7)
            .collect(Collectors.toList());

        if (projetosAprovados.isEmpty()) {
            System.out.println("Nenhum projeto foi aprovado.");
        } else {
            System.out.println("Projetos com nota final >= 7:");
            for (Projeto projeto : projetosAprovados) {
            System.out.println(projeto.getNome() + " - Nota Final: " + projeto.getNotaFinal());
            }
        }

        // Exemplo de uso da equipe1 para evitar o aviso de variável não utilizada
        System.out.println("Alunos da Equipe 1:");
        for (Estudante estudante : equipe1) {
            System.out.println(estudante.getNome());
        }

        // Exemplo de uso da equipe2 para evitar o aviso de variável não utilizada
        System.out.println("Alunos da Equipe 2:");
        for (Estudante estudante : equipe2) {
            System.out.println(estudante.getNome());
        }

        // Listar a nota das equipes
        System.out.println("Nota da Equipe 1: " + projeto1.getNotaFinal());
        System.out.println("Nota da Equipe 2: " + projeto2.getNotaFinal());
    }
}