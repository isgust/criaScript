// Desafio: Implementar a lógica para determinar se um ano é bissexto
package org.example;
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Ano ano = new Ano();
        System.out.println("Insira um ano:");
        int valorAno = leitor.nextInt();

        ano.setAno(valorAno); //Setando valor ao obejto

        if (ano.bissexto(ano.getAno())){
            System.out.println(ano.getAno() + " é ano bissexto!");
        }else{
            System.out.println(ano.getAno() + " não é ano bissexto!");
        }

    }
}
