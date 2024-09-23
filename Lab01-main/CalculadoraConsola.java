package ej01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculadoraConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0.0;
        boolean continuar = true;
        boolean esPrimeraOperacion = true;

        System.out.println("===Calculadora de Consola===");
        System.out.println("Opciones.");
        System.out.println("\t- Suma (+) Resta (-) Multiplicacion (*) Division (/)");
        System.out.println("\t- Funciones trigonometricas: Sin - Cos - Tan");
        System.out.println("\t- Potencia (^) - Raiz enecima (rNo) - IVA (ivaNo)");
        System.out.println("\t- Escribe salir para terminar operacion o ac para limpiar el resultado");

        while (continuar) {
            System.out.println("Resultado actual: " + resultado);
            
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equalsIgnoreCase("salir")) {
                continuar = false;
                System.out.println("Cerrando calculadora. Resultado final: " + resultado);
                break;
            }
             if (input.equalsIgnoreCase("ac")) {
                resultado = 0.0;
                esPrimeraOperacion = true;
                continue;
            }
            

            // Detectar operaciones con IVA
            if (input.startsWith("iva")) {
                double iva = Double.parseDouble(input.substring(3)) / 100.0;
                if (esPrimeraOperacion) {
                    resultado = iva;
                    esPrimeraOperacion = false;
                } else {
                    resultado *= (1 + iva);
                }
                continue;
            }

            // Detectar funciones trigonométricas
            if (input.equals("sin")) {
                resultado = Math.sin(Math.toRadians(resultado));
                continue;
            }

            if (input.equals("cos")) {
                resultado = Math.cos(Math.toRadians(resultado));
                continue;
            }

            if (input.equals("tan")) {
                resultado = Math.tan(Math.toRadians(resultado));
                continue;
            }

            // Detectar operaciones básicas y avanzadas
            Pattern patternCompleto = Pattern.compile("(\\d+(\\.\\d+)?)([+\\-*/^r])(\\d+(\\.\\d+)?)");
            Pattern patternAcumulado = Pattern.compile("([+\\-*/^r])(\\d+(\\.\\d+)?)");

            Matcher matcherCompleto = patternCompleto.matcher(input);
            Matcher matcherAcumulado = patternAcumulado.matcher(input);

            if (esPrimeraOperacion && matcherCompleto.matches()) {
                double num1 = Double.parseDouble(matcherCompleto.group(1));
                String operator = matcherCompleto.group(3);
                double num2 = Double.parseDouble(matcherCompleto.group(4));

                switch (operator) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Error: División por cero.");
                        }
                        break;
                    case "^":
                        resultado = Math.pow(num1, num2);
                        break;
                    case "r":
                        if (num2 != 0) {
                            resultado = Math.pow(num1, 1.0 / num2);
                        } else {
                            System.out.println("Error: Índice de raíz no puede ser cero.");
                        }
                        break;
                    default:
                        System.out.println("Operador no reconocido.");
                }
                esPrimeraOperacion = false;

            } else if (!esPrimeraOperacion && matcherAcumulado.matches()) {
                
                if (matcherAcumulado.group(1) != null && matcherAcumulado.group(2) != null) {
                    String operator = matcherAcumulado.group(1);
                    double num = Double.parseDouble(matcherAcumulado.group(2));
                    
                    switch (operator) {
                        case "+":
                            resultado += num;
                            break;
                        case "-":
                            resultado -= num;
                            break;
                        case "*":
                            resultado *= num;
                            break;
                        case "/":
                            if (num != 0) {
                                resultado /= num;
                            } else {
                                System.out.println("Error: División por cero.");
                            }
                            break;
                        case "^":
                            if (num > 0){
                                resultado = Math.pow(resultado, num);
                            }
                            else if(num < 0){
                                System.out.println("Error: Las potencias no pueden ser negativas.");
                            }
                            else {
                                resultado = 1;
                            }
                           
                            break;
                        case "r":
                            if (num != 0) {
                                resultado = Math.pow(resultado, 1.0 / num);
                            } else {
                                System.out.println("Error: Índice de raíz no puede ser cero.");
                            }
                            break;
                      
                        default:
                            System.out.println("Operador no reconocido.");
                    }
                    
                } else {
                    System.out.println("Operación no válida. Por favor, ingresa una operación en el formato correcto.");
                }
            }
        }
        
    }
}




