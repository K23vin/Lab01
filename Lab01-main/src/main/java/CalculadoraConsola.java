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
        System.out.println("\tSuma - Resta - Multiplicacion - Division.");
        System.out.println("\tFunciones trigonometicas: Sin - Cos - Tan");
        System.out.println("\tPotencia - Raiz enecima - IVA");
        System.out.println("\tEscribe salir para terminar opercacion");

        while (continuar) {
            System.out.println(resultado);
            System.out.println("");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                continuar = false;
                System.out.println("Cerrando calculadora. Resultado final: " + resultado);
                break;
            }

            
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


