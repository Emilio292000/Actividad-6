import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> resultados = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese una operación matemática (ejemplo: 10 + 5) o 'salir' para terminar:");
            System.out.println("(Ingrese las variables con los espacios y la operacion correspondiente)");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                try {

                    String[] partes = entrada.split(" ");
                    double variable1 = Double.parseDouble(partes[0]);
                    String variable = partes[1];
                    double variable2 = Double.parseDouble(partes[2]);


                    double resultado = 0;
                    switch (variable) {
                        case "+":
                            resultado = variable1 + variable2;
                            break;
                        case "-":
                            resultado = variable1 - variable2;
                            break;
                        case "*":
                            resultado = variable1 * variable2;
                            break;
                        case "/":
                            if (variable2 == 0) {
                                throw new ArithmeticException("No se puede dividir entre cero.");
                            }
                            resultado = variable1 / variable2;
                            break;
                        default:
                            throw new IllegalArgumentException("Operador no válido.");
                    }

                    // Almacenar el resultado en el arreglo
                    resultados.add(resultado);
                    System.out.println("Resultado: " + resultado);

                } catch (NumberFormatException e) {
                    System.out.println("Error: Por favor, ingrese números válidos.");
                } catch (IllegalArgumentException | ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        // Mostrar todos los resultados almacenados
        System.out.println("Resultados almacenados:");
        for (Double res : resultados) {
            System.out.println(res);
        }
            /// hola
        scanner.close();
    }
}