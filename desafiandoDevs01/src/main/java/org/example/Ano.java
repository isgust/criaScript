package org.example;

public class Ano {
    private int ano;

    //Getters
    public int getAno(){
        return ano;
    }

    //Setters
    public void setAno(int ano){
        this.ano = ano;
    }

    public boolean divisivelPorQuatro(int ano){
        boolean condicao;
        condicao = (ano % 4 == 0);

        return condicao;
    }

    public boolean naoDivisivelPor100(int ano){
        boolean condicao2;
        condicao2 = (ano % 100 != 0);
        return condicao2;
    }

    public boolean divisivelPor400(int ano){
        boolean condicao3;
        condicao3 = (ano % 400 == 0);

        return condicao3;
    }

    public boolean bissexto(int ano){
        boolean condicaoGeral;
        condicaoGeral = (divisivelPorQuatro(ano) && naoDivisivelPor100(ano) || (divisivelPor400(ano)));

       return condicaoGeral;
    }
}
