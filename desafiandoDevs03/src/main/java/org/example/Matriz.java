package org.example;

public class Matriz {
    private int[][] matrizA;
    private int[][] matrizB;

    //Getters
    public int[][] getMatrizA(){
        return matrizA;
    }

    public int[][] getMatrizB(){
        return matrizB;
    }

    //Setters
    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public void setMatrizB(int[][] matrizB, int[][] b) {
        this.matrizB = matrizB;
    }

    public int[][] somaMatriz(int[][] matrizA, int[][] matrizB){
        // Primeiro, vamos verificar se as dimensões das matrizes são compatíveis para a soma
        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            System.out.println("Erro: As dimensões das matrizes não são compatíveis para a soma.");
            return null;
        }

        // Cria uma nova matriz para armazenar o resultado da soma
        int[][] matrizResultante = new int[matrizA.length][matrizA[0].length];

        // Realiza a soma elemento por elemento
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizResultante[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return matrizResultante;
    }
}
