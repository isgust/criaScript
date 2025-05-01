package org.example;

public class Equacao {
    private double a;
    private double b;
    private double c;

    //Getters
    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC() {
        return c;
    }

    //Setters

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }


    //Metodo de resolução da equação
    public double[] resolverEquacao(double a, double b, double c){
        double delta = b*b -4*a*c;
        double[] raizes;
        if (delta > 0) {
            double bhaskaraA = (-b + Math.sqrt(delta)) / 2 * a;
            double bhasKaraB = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("As raizes são " + bhaskaraA + " e " + bhasKaraB);
            raizes = new double[] {bhaskaraA, bhasKaraB};
        } else if (delta == 0) {
            double bhaskaraA = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("As raiz é " + bhaskaraA);
            System.out.println("As raizes são iguais!");
            raizes = new double[] {bhaskaraA};
        }else{
            System.out.println("Não possui raízes reais");
            raizes = new double[0];
        }

        return raizes;
    }
}
