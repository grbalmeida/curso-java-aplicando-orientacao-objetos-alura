package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

public class OutrasFormasPercorrerListas {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jacqueline");
        nomes.add("Paulo");
        nomes.add("Suellen");
        nomes.add("Emily");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("---------------------------");

        nomes.forEach(nome -> System.out.println(nome));

        System.out.println("---------------------------");

        // Method Reference
        nomes.forEach(System.out::println);
    }
}
