import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

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

    public static void main(String[] args) {
        // exibePoderosoChefao();
        // exibeMatrix();
        // exibeLost();
        exibeTempoAssistirFilmes();
    }
}
