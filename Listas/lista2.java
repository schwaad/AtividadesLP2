import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // exercicio1();
    // exercicio2();
    // exercicio3();
    // exercicio4();
    // exercicio5();
    // exercicio6();
    exercicio8();
  }

  public static void exercicio1() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite as 3 notas:\n");
    float nota1 = scanner.nextFloat();
    float nota2 = scanner.nextFloat();
    float nota3 = scanner.nextFloat();
    float media = (nota1 + nota2 + nota3) / 3;
    String situacao = "Aprovado";
    if ((nota1 < 4 || nota2 < 4 || nota3 < 4) || (media >= 4 && media < 6)) {
      situacao = "Recuperação";
    }
    if (media < 4) {
      situacao = "Reprovado";
    }

    System.out.println(situacao);
  }

  public static void exercicio2() {
    Scanner scanner = new Scanner(System.in);
    char[] vogais = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
    char caractere = scanner.next().charAt(0);
    for (int i = 0; i < 10; i++) {
      if (vogais[i] == caractere) {
        System.out.println("Vogal");
        return;
      }
    }
    if (Character.isDigit(caractere)) {
      System.out.println("Número");
      return;
    }
    if (Character.isLetter(caractere)) {
      System.out.println("Consoante");
      return;
    }
    System.out.println("Símbolo");
  }

  public static void exercicio3() {
    Scanner scanner = new Scanner(System.in);
    int ano = scanner.nextInt();
    if (ano % 4 == 0 && ano % 100 != 0) {
      System.out.println("Ano bissexto");
    } else {
      System.out.println("Ano não bissexto");
    }
  }

  public static void exercicio4() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a senha:\n");
    int senha = scanner.nextInt();
    while (senha != 1234) {
      System.out.println("ACESSO NEGADO.");
      senha = scanner.nextInt();
    }
    System.out.println("ACESSO PERMITIDO.");
  }

  public static void exercicio5() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.println(+i + " x " + j + " = " + i * j);
      }
    }
  }

  // Note que esse é o exercício 7
  public static int fatorial(int number) {
    for (int i = number - 1; i > 0; i--) {
      number = number * i;
    }
    return number;
  }

  public static void exercicio6() {
    Scanner scanner = new Scanner(System.in);
    int entrada = scanner.nextInt();
    int euler = 1;
    for (int i = 0; i < entrada; i++) {
      euler += 1 / (fatorial(i));
    }
  }

  public static void exercicio8() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número par:");
    int entrada = scanner.nextInt();
    if (entrada % 2 != 0) {
      System.out.println("Precisa ser um número par.");
      return;
    }
    int i = 1;
    while (i <= entrada) {
      if (entrada % i == 0) {
        System.out.println(i);
      }
      i++;

    }
  }
}
