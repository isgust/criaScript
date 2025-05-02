package org.example;
//Uma função com duas matrizes e dê como resultado a soma delas
public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        int[][] matrizA = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matrizB = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] resultado = matriz.somaMatriz(matrizA, matrizB);

        if (resultado != null){
            System.out.println("Matriz Soma");
            for (int i=0; i<resultado.length; i++){
                for (int j =0; j< resultado[i].length; j++){
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println(); //Para mudar a linha da matriz
            }
        }

    }
}