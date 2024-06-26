package set;

import set.OperacoesBasicas.ConjuntoConvidados;

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
    }
}
