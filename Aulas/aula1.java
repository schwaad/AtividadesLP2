import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    // exercicio1();
    // exercicio2();
    // exercicio3();
    // exercicio4();
    // exercicio5();
    // exercicio6();
    exercicio7();
  }

  // Desenvolva um algoritmo em Java que possa declarar e exibir 03 varíaveis do
  // tipo inteiro.
  public static void exercicio1() {
    int n1 = 1;
    int n2 = 2;
    int n3 = -42;
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
    return;
  }

  // Com base no algoritmo anterior, modifique o algoritmo para que o usuário
  // digite as varíaveis declaradas
  public static void exercicio2() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primerio número:\n");
    int n1 = scanner.nextInt();
    System.out.println("Digite o segundo número:\n");
    int n2 = scanner.nextInt();
    System.out.println("Digite o terceiro número:\n");
    int n3 = scanner.nextInt();
    System.out.println("Primeiro número: " + n1);
    System.out.println("Segundo número: " + n2);
    System.out.println("Terceiro número: " + n3);
    return;
  }

  // Desenvolva um algoritmo que receba 3 números inteiros do usuário e possa
  // realizar a permuta entre duas variáveis, utilizando de todas as operações
  // necessárias.
  public static void exercicio3() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primerio número:\n");
    int n1 = scanner.nextInt();
    System.out.println("Digite o segundo número:\n");
    int n2 = scanner.nextInt();
    System.out.println("Digite o terceiro número:\n");
    int n3 = scanner.nextInt();
    int aux1 = n1;
    int aux2 = n2;
    n1 = n3;
    n2 = aux1;
    n3 = aux2;
    System.out.println("Primeiro número trocado com o terceiro: " + n1);
    System.out.println("Segundo número trocado com o primeiro: " + n2);
    System.out.println("Terceiro número trocado com o segundo: " + n3);
  }

  // Baseado no algoritmo anterior, desenvolva um aloritmo em Java que possa
  // declarar apenas duas variáveis do tipo inteirio e possa executar os
  // procedimentos de permuta de variáveis
  public static void exercicio4() {
    Scanner scanner = new Scanner(System.in);
    int n1 = 7;
    int n2 = 5;
    n1 = n1 - n2;
    n2 = n2 + n1;
    n1 = n2 - n1;
    System.out.println("Primeiro número: " + n1 + "Segundo número: " + n2);
  }

  // Recebe 3 inteiros e calcula a média
  public static void exercicio5() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primerio número:\n");
    float n1 = scanner.nextFloat();
    System.out.println("Digite o segundo número:\n");
    float n2 = scanner.nextFloat();
    System.out.println("Digite o terceiro número:\n");
    float n3 = scanner.nextFloat();
    float media = (n1 + n2 + n3) / 3;
    System.out.println("Média: " + media);
  }

  // Recebe um inteiro e retorna seu sucessor e seu antecessor
  public static void exercicio6() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int n1 = scanner.nextInt();
    System.out.println("Sucessor: " + (n1 + 1) + " Antecessor: " + (n1 - 1));
  }

  // Calcula a resistencia equivalente de um circuito com R1 e R2 em paralelo e R3
  // em sequência
  public static void exercicio7() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a resistência do primeiro resistor: \n");
    int r1 = scanner.nextInt();
    System.out.println("Digite a resistência do segundo resistor (em paralelo com o primeiro): \n");
    int r2 = scanner.nextInt();
    System.out.println("Digite a resistência do terceiro resistor: \n");
    int r3 = scanner.nextInt();
    int resistenciaTotal = (r1 * r2) / (r1 + r2) + r3;
    System.out.println("Resistência Total: " + resistenciaTotal);
  }
}
