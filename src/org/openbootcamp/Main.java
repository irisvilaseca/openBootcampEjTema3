package org.openbootcamp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int resultadoSuma = sumar(3,4,5);
        Coche miCoche = new Coche();
        miCoche.añadirPuertas(1);
    }
    public static void sumar(int num1,int num2, int num3){
        int resultado=num1+num2+num3;
        System.out.println(resultado);
    }
    public static class Coche(){
        int puertas;
    }
    public static void añadirPuertas(int cantidad){
        this.puertas=+cantidad;
        System.out.println(miCoche.puertas);
    }
}
