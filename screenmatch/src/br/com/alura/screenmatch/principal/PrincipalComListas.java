package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void tiposDiferentesDeObjetosNaLista() {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println("Nome: " + item.getNome());

            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }

    public static void ordenandoListaDeStrings() {
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Brad Pitt");
        buscaPorArtista.add("Will Ferrell");
        buscaPorArtista.add("Vin Diesel");
        buscaPorArtista.add("Tom Hardy");
        buscaPorArtista.add("Margot Robbie");
        buscaPorArtista.add("Emily Blunt");
        buscaPorArtista.add("Anya-Taylor Joy");
        buscaPorArtista.add("Jamie Lee Curtis");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
    }

    public static void ordenandoListaDeTitulos() {
        Filme vingadores = new Filme("Os Vingadores", 2012);
        Filme reiLeao = new Filme("O rei Leão", 2019);
        Filme jurassicWorld = new Filme("Jurassic World: O mundo dos dinossauros", 2015);
        Filme homemAranha = new Filme("Homem-Aranha: Sem volta para casa", 2021);
        Filme starWars = new Filme("Star Wars: O despertar da força", 2015);
        Filme titanic = new Filme("Titanic", 1997);
        Filme avatar = new Filme("Avatar: o caminho da água", 2022);
        Filme vingadoresUltimato = new Filme("Vingadores: Ultimato", 2019);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(vingadores);
        titulos.add(reiLeao);
        titulos.add(jurassicWorld);
        titulos.add(homemAranha);
        titulos.add(starWars);
        titulos.add(titanic);
        titulos.add(avatar);
        titulos.add(vingadoresUltimato);
        titulos.add(lost);

        System.out.println(titulos);
        // [Filme: Os Vingadores (2012), Filme: O rei leão (2019), ...]
        System.out.println("Lista de títulos ordenados");
        Collections.sort(titulos);
        System.out.println(titulos);
        // [Filme: Avatar: o caminho da água (2022), Filme: Homem-Aranha: Sem volta para casa (2021), ...]

        titulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(titulos);
    }

    public static void utilizandoInterfaceList() {
        List<Titulo> titulos = new LinkedList<>();
        Filme coracaoSelvagem = new Filme("Coração Selvagem", 1990);
        Filme panico = new Filme("Pânico", 1996);
        Filme romeuJulieta = new Filme("Romeu e Julieta", 1996);

        titulos.add(coracaoSelvagem);
        titulos.add(panico);
        titulos.add(romeuJulieta);

        titulos.forEach(System.out::println);
    }

    public static void main(String[] args) {
        // ordenandoListaDeStrings();
        // ordenandoListaDeTitulos();
        utilizandoInterfaceList();
    }
}
