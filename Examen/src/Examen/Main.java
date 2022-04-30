package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuPrincipal();
    }

    public static void MenuPrincipal(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (salir==false) {
            System.out.println("*************** MENU PRINCIPAL ***************");
            System.out.println("1. PROBLEMA 1");
            System.out.println("2. PROBLEMA 2");
            System.out.println("3. PROBLEMA 3");
            System.out.println("4. SALIR");
            System.out.println("***********************************************");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        Problema1 nu = new Problema1();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        Problema2 nu1 = new Problema2();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
