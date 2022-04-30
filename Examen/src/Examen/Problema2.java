package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Examen.Main.MenuPrincipal;

public class Problema2 {
    static Scanner teclado = new Scanner(System.in);
    int num;

    public Problema2(){
        Piramide();
    }

    public void Piramide(){
        System.out.print("Ingrese un numero: ");
        num = teclado.nextInt();
        System.out.println();
        if(num%2!=0){
            for(int numBlancos = num-1,numAsteriscos=1; numBlancos>=0; numBlancos--, numAsteriscos += 2){
                //Espacios en blanco
                if(numAsteriscos!=num+2){
                    for(int i=1;i<=numBlancos;i++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=numAsteriscos;j++){
                        System.out.print("*");
                    }
                }else {
                    break;
                }
                System.out.println();
            }
            System.out.println();
            submenu();
        }else {
            System.out.println("Debe ingresar un numero Impar");
            Piramide();
        }
        System.out.println();
    }

    public void submenu(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (salir==false) {
            System.out.println("***********************************************");
            System.out.println("1. Ingresar un Nuevo Numero");
            System.out.println("2. Regresar al menu");
            System.out.println("***********************************************");

            try {
                System.out.print("Escribe una de las opciones: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        Piramide();
                        break;
                    case 2:
                        MenuPrincipal();
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 2");
                }
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
