package ej01;

import java.util.Scanner;

public class CalculadoraConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora en Consola");
        
        while (true) {
            System.out.print("\nElige una operacion: \n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nOpcion: ");
            int opcion = scanner.nextInt();
            
            if (opcion == 5) {
                System.out.println("Saliendo de la calculadora...");
                break;
            }
            
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            
            double resultado = 0;
            
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        
        scanner.close();
    }
}
