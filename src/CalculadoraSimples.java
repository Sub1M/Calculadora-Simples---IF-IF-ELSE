import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pede o primeiro número
        System.out.print("Informe o primeiro número: ");
        double num1 = entrada.nextDouble();

        // Pede o segundo número
        System.out.print("Informe o segundo número: ");
        double num2 = entrada.nextDouble();

        // Pede a operação
        System.out.print("Informe a operação (+, -, *, /): ");
        String op = entrada.next();

        double resultado = 0;

        // Faz o cálculo com if/else
        if (op.equals("+")) {
            resultado = num1 + num2;
        } else if (op.equals("-")) {
            resultado = num1 - num2;
        } else if (op.equals("*")) {
            resultado = num1 * num2;
        } else if (op.equals("/")) {
            resultado = num1 / num2;
        } else {
            System.out.println("Operação inválida!");
            entrada.close();
            return; // encerra o programa
        }

        // Mostra o resultado
        System.out.printf("%.2f %s %.2f = %.2f\n", num1, op, num2, resultado);

        entrada.close();
    }
}
