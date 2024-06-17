import list.OperacoesBasicas.CarrinhoDeCompras;
import list.OperacoesBasicas.ListaTarefa;


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

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }
}


