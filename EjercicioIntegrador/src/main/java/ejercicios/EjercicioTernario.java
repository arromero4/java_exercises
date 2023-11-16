package ejercicios;

import java.util.Scanner;

public class EjercicioTernario {
    public static void main(String[] args){
        double promedio;
        String condicionFinal;

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el promedio general del alumno: ");
        promedio = teclado.nextDouble();

        condicionFinal = promedio >= 6 ? "Aprobado" : "Reprobado";
        System.out.println("La condicion final del alumno es: " + condicionFinal);

    }
}
