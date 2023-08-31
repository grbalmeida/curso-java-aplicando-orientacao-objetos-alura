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

    public static void main(String[] args) {
        // exibePoderosoChefao();
        // exibeMatrix();
        exibeLost();
    }
}
