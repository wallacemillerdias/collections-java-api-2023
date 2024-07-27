package map;

import map.OperacoesBasicas.AgendaContatos;
import map.OperacoesBasicas.Dicionario;
import map.Ordenacao.AgendaEventos;
import map.Ordenacao.LivrariaOnline;
import map.Ordenacao.Livro;
import map.Pesquisa.ContagemPalavras;
import map.Pesquisa.EstoqueProdutos;

import java.time.LocalDate;
import java.time.Month;

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

        // Agenda de Eventos
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2020, 7, 11), "Evento1", "Atração1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 10), "Evento2", "Atração2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.MARCH, 13), "Evento3", "Atração4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 14), "Evento4", "Atração4");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

        // Livraria Online
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        livrariaOnline.removerLivro("1984");
    }
}
