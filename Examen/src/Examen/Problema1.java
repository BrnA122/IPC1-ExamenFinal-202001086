package Examen;

import java.util.Scanner;

public class Problema1 {

    static Scanner teclado = new Scanner(System.in);
    int num1, num2;
    public Problema1() {
        Comparacion();
    }

    public void Comparacion(){
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = teclado.nextInt();

        if(num1>num2){
            System.out.println("El numero " + num1 + " es mayor a "+ num2);
        }else {
            System.out.println("El numero " + num2 + " es mayor a "+ num1);
        }
    }
}
