import java.util.InputMismatchException;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro para calcular o fatorial: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Erro: O número informado não pode ser negativo.");
            } else {
                System.out.println("Escolha o método de cálculo: \n1 - Iterativo\n2 - Recursivo");
                int escolha = scanner.nextInt();

                long fatorial;
                if (escolha == 1) {
                    fatorial = calcularFatorialIterativo(numero);
                } else if (escolha == 2) {
                    fatorial = calcularFatorialRecursivo(numero);
                } else {
                    System.out.println("Opção inválida. Usando o método iterativo por padrão.");
                    fatorial = calcularFatorialIterativo(numero);
                }

                System.out.println("O fatorial de " + numero + " é: " + fatorial);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
        } finally {
            scanner.close();
        }
    }

    public static long calcularFatorialIterativo(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static long calcularFatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorialRecursivo(n - 1);
    }
}