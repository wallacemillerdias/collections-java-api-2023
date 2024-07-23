package map;

import map.OperacoesBasicas.AgendaContatos;
import map.OperacoesBasicas.Dicionario;

public class TestMap {
    public static void main(String[] args) {
        // Agenda Contatos
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Wallace", 123456);
        agendaContatos.adicionarContato("Ana", 22222);
        agendaContatos.adicionarContato("João", 101010);
        agendaContatos.adicionarContato("Miller", 331144);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Miller");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Ana");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Wallace";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);

        // Dicionário
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Java", "Linguagem de programação orientada a objetos");
        dicionario.adicionarPalavra("TypeScript", "Linguagem de programação orientada a objetos");
        dicionario.adicionarPalavra("", "Linguagem de programação orientada a objetos");
    }
}
