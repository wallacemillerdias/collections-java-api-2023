package map;

import map.OperacoesBasicas.AgendaContatos;
import map.OperacoesBasicas.Dicionario;
import map.Pesquisa.ContagemPalavras;
import map.Pesquisa.EstoqueProdutos;

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

        // Estoque de Produtos
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(100L, "Computador", 3, 100.0);
        estoque.adicionarProduto(200L, "Notebook", 2, 200.0);
        estoque.adicionarProduto(300L, "Monitor", 1, 800.0);
        estoque.adicionarProduto(400L, "Teclado", 6, 200.0);
        estoque.adicionarProduto(500L, "Mac", 1, 1200.0);

        estoque.exibirProdutos();

        System.out.println("O valor total do estoque : R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais barato : R$ " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto mais caro : R$ " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto maior quantidade : R$ " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

        // Contagem de Palavras
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 6);
        contagemPalavras.adicionarPalavra("PHP", 4);
        contagemPalavras.adicionarPalavra("HTML", 2);
        contagemPalavras.adicionarPalavra("JavaScript", 1);

        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        System.out.println("Palavras mais frequentes " + contagemPalavras.encontrarPalavraMaisFrequente());

        contagemPalavras.removerPalavra("JavaScript");
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");
    }
}
