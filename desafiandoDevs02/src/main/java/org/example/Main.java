package org.example;
import java.util.Scanner;

// Função que retorne o resultado de uma equação do segundo grau

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Equacao equacao = new Equacao();
        double[] raizes;

        System.out.println("Insira o valor de a: ");
        double a = leitor.nextDouble();

        System.out.println("Insira o valor de b: ");
        double b = leitor.nextDouble();

        System.out.println("Insira o valor de c: ");
        double c = leitor.nextDouble();

        raizes = equacao.resolverEquacao(a, b, c);


    }
}