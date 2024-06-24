import list.OperacoesBasicas.CarrinhoDeCompras;
import list.OperacoesBasicas.ListaTarefa;
import list.Ordenacao.OrdenacaoPessoas;
import list.Pesquisa.CatalogoLivros;
import list.Pesquisa.SomaNumeros;


public class Main {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Estudar Programação.");
        listaTarefa.adicionarTarefa("Terminar o Bootcamp da DIO.");
        listaTarefa.adicionarTarefa("Arrumar um Estágio na DIO.");
        listaTarefa.adicionarTarefa("Sair da zona de conforto. \n");

        System.out.println("Você tem: " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Sair da zona de conforto.");

        System.out.println("Agora suas tarefas são: " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista");

        listaTarefa.obterDescricoesTarefas();

        //Carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("carro", 1500, 2);
        carrinhoDeCompras.adicionarItem("bike", 1400, 2);
        carrinhoDeCompras.adicionarItem("tv", 1300, 2);
        carrinhoDeCompras.adicionarItem("pc", 1200, 2);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("pc");

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal() + "\n");

        // Catálogo de Livros
        CatalogoLivros CatalogoLivros = new CatalogoLivros();

        CatalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        CatalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        CatalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        CatalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        CatalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1994);

        System.out.println(CatalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(CatalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(CatalogoLivros.pesquisarPorTitulo("Título Inexistente"));

        // Soma Números
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());

        // Ordenação Pessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Wallace", 37, 1.70);
        ordenacaoPessoas.adicionarPessoa("Jean", 36, 1.68);
        ordenacaoPessoas.adicionarPessoa("Denise", 30, 1.65);
        ordenacaoPessoas.adicionarPessoa("João", 10, 1.30);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}


