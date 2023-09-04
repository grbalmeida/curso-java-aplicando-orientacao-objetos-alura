import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void exibePoderosoChefao() {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.pegaMedia());
    }

    public static void exibeMatrix() {
        Filme favorito = new Filme();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Total de avaliações: " + favorito.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + favorito.pegaMedia());
    }

    public static void exibeLost() {
        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setIncluidoNoPlano(false);
        lost.setTemporadas(6);
        lost.setMinutosPorEpisodio(44);
        lost.setAtiva(false);
        lost.setEpisodiosPorTemporada(20);

        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
    }

    public static void exibeTempoAssistirFilmes() {
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        Filme titanic = new Filme();
        titanic.setNome("Titanic");
        titanic.setAnoDeLancamento(1998);
        titanic.setDiretor("James Cameron");
        titanic.setDuracaoEmMinutos(194);
        titanic.setIncluidoNoPlano(true);

        Filme theAvengers = new Filme();
        theAvengers.setNome("The Avengers");
        theAvengers.setAnoDeLancamento(2012);
        theAvengers.setDiretor("Joss Whedon");
        theAvengers.setDuracaoEmMinutos(142);
        theAvengers.setIncluidoNoPlano(true);

        Serie listaNegra = new Serie();
        listaNegra.setNome("The Blacklist");
        listaNegra.setAnoDeLancamento(2013);
        listaNegra.setTemporadas(9);
        listaNegra.setEpisodiosPorTemporada(20);
        listaNegra.setMinutosPorEpisodio(46);

        calculadora.inclui(titanic);
        // Adicionando duração em minutos de br.com.alura.screenmatch.modelos.Filme@1554909b
        calculadora.inclui(theAvengers);
        // Adicionando duração em minutos de br.com.alura.screenmatch.modelos.Filme@6bf256fa
        calculadora.inclui(listaNegra);
        // Adicionando duração em minutos de br.com.alura.screenmatch.modelos.Serie@6cd8737

        System.out.println(calculadora.getTempoTotal());
    }

    public static void exibeClassificacaoFilme() {
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Filme exterminadorDoFuturo = new Filme();
        exterminadorDoFuturo.setNome("The Terminator");
        exterminadorDoFuturo.setAnoDeLancamento(1985);
        exterminadorDoFuturo.setDuracaoEmMinutos(107);
        exterminadorDoFuturo.setDiretor("James Cameron");
        exterminadorDoFuturo.setIncluidoNoPlano(true);

        exterminadorDoFuturo.avalia(9);
        exterminadorDoFuturo.avalia(8);
        exterminadorDoFuturo.avalia(7);
        exterminadorDoFuturo.avalia(6.5);

        exterminadorDoFuturo.exibeFichaTecnica();
        System.out.println("Classificação: " + exterminadorDoFuturo.getClassificacao());

        filtro.filtra(exterminadorDoFuturo);
    }

    public static void exibeClassificacaoSerie() {

        Serie listaNegra = new Serie();
        listaNegra.setNome("Blacklist");

        Episodio episodio1 = new Episodio();
        episodio1.setNome("Gina Zanetakos");
        episodio1.setNumero(6);
        episodio1.setTotalVisualizacoes(1_500_000);
        episodio1.setSerie(listaNegra);

        Episodio episodio2 = new Episodio();
        episodio2.setNome("A Agência Cyprus");
        episodio2.setNumero(13);
        episodio2.setTotalVisualizacoes(1_300_000);
        episodio2.setSerie(listaNegra);

        Episodio episodio3 = new Episodio();
        episodio3.setNome("Episódio não lançado");
        episodio3.setNumero(1000);
        episodio3.setTotalVisualizacoes(0);
        episodio3.setSerie(listaNegra);

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(episodio1);
        filtro.filtra(episodio2);
        filtro.filtra(episodio3);
    }

    public static void listaDeFilmesComArrayList() {
        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        var dossiePelicano = new Filme();
        dossiePelicano.setNome("The Pelican Brief");
        dossiePelicano.setAnoDeLancamento(1994);
        dossiePelicano.setDuracaoEmMinutos(141);
        dossiePelicano.setDiretor("Alan J. Pakula");

        var somaDeTodosOsMedos = new Filme();
        somaDeTodosOsMedos.setNome("The Sum of All Fears");
        somaDeTodosOsMedos.setAnoDeLancamento(2002);
        somaDeTodosOsMedos.setDiretor("Phil Alden Robinson");
        somaDeTodosOsMedos.setDuracaoEmMinutos(124);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(somaDeTodosOsMedos);
        listaDeFilmes.add(dossiePelicano);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        // antes: toString do filme: br.com.alura.screenmatch.modelos.Filme@5ebec15
        // depois: toString do filme: Filme: Dogville (2003)

        System.out.println(listaDeFilmes);
        // antes: [br.com.alura.screenmatch.modelos.Filme@5ebec15, ...]
        // depois: [Filme: Dogville (2003), ...]
    }

    public static void construindoObjetosComValores() {
        Filme dogville = new Filme("Dogville");

        dogville.exibeFichaTecnica();
    }

    public static void main(String[] args) {
        // listaDeFilmesComArrayList();
        construindoObjetosComValores();
    }
}
