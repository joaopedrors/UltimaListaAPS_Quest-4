package Questão4;

public class Main {
    public static void main(String[] args) {

        Abstracao abstracoes;

        abstracoes = new AbstracaoRefinada(new ArquivoTXT());

        abstracoes.operacao();

        abstracoes = new AbstracaoRefinada(new ArquivoCSV());

        abstracoes.operacao();
    }
}
