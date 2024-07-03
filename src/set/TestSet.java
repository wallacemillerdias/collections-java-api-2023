package set;

import set.OperacoesBasicas.ConjuntoConvidados;
import set.OperacoesBasicas.ConjuntoPalavrasUnicas;
import set.Ordenacao.CadastroProdutos;
import set.Pesquisa.AgendaContatos;
import set.Pesquisa.Contato;
import set.Pesquisa.ListaTarefas;

public class TestSet {
    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro da lista");

        conjuntoConvidados.adicionarConvidado("Wallace", 22);
        conjuntoConvidados.adicionarConvidado("Miller", 23);
        conjuntoConvidados.adicionarConvidado("Denise", 24);
        conjuntoConvidados.adicionarConvidado("João", 25);
        conjuntoConvidados.adicionarConvidado("Wallace", 22);

        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro da lista");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(22);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro da lista após a remoção");

        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();

        // Conjunto Palavras Unicas
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("bola");
        conjuntoPalavras.adicionarPalavra("bala");
        conjuntoPalavras.adicionarPalavra("bola");
        conjuntoPalavras.adicionarPalavra("bolacha");

        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.removerPalavra("bola");
        conjuntoPalavras.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavras.verificarPalavra("bala"));

        // Agenda Contatos
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Wallace", 992447898);
        agendaContatos.adicionarContato("Wallace Miller", 998981055);
        agendaContatos.adicionarContato("João", 991223654);
        agendaContatos.adicionarContato("Denise", 999977444);
        agendaContatos.adicionarContato("Jean", 992447898);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Wallace"));

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("jean", 999999999);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();

        // Lista Tarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();

        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("Estudar Java");

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("Fazer exercícios físicos");

        listaTarefas.exibirTarefas();

        System.out.println("Tarefa concluída " + listaTarefas.obterTarefasConcluidas());
        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();

        // Cadastro produtos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(100, "Televisão", 3000, 1);
        cadastroProdutos.adicionarProduto(101, "Computador", 3500, 2);
        cadastroProdutos.adicionarProduto(102, "Geladeira", 4500, 2);
        cadastroProdutos.adicionarProduto(103, "Fogão", 2499, 2);
        cadastroProdutos.adicionarProduto(104, "Notebook", 5000, 2);

        System.out.println("Produtos por nome " + cadastroProdutos.exibirProdutosPorNome());

        System.out.println("Produtos por preço " + cadastroProdutos.exibirProdutosPorPreco());

    }
}
