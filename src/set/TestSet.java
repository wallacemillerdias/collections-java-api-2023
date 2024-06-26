package set;

import set.OperacoesBasicas.ConjuntoConvidados;
import set.OperacoesBasicas.ConjuntoPalavrasUnicas;
import set.Pesquisa.AgendaContatos;
import set.Pesquisa.Contato;

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

        System.out.println(agendaContatos.pesquisarPorNome("Denise"));

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("jean", 999999999);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();

    }
}
