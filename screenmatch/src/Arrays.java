import br.com.alura.screenmatch.modelos.Filme;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        Filme[] filmes = new Filme[2];

        Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("Dogville", 2003);

        filmes[0] = filme1;
        filmes[1] = filme2;

        for (int i = 0; i < filmes.length; i++) {
            System.out.println("Nome do filme: " + filmes[i].getNome());
            System.out.println("Ano de lançamento do filme: " + filmes[i].getAnoDeLancamento());
            System.out.println("-----------------------------------");
        }
    }
}
