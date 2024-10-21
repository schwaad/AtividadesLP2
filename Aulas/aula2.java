import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    // exercicio1();
    // exercicio2();
    // exercicio3();
    // exercicio4();
    // exercicio5();
    // exercicio6();
    // exercicio7();
    // exercicio8();
  }

  // Exercicio 01: Recebe o peso e a altura do usuário e imprime seu IMC, junto
  // com a categoria
  public static void exercicio1() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu peso:\n");
    float peso = scanner.nextFloat();
    System.out.println("Digite sua altura:\n");
    float altura = scanner.nextFloat();
    float imc = peso / (altura * altura);
    if (imc < 18.5) {
      System.out.println("Seu imc é " + imc + " e você está com baixo peso");
    } else if (imc >= 18.5 && imc < 25) {
      System.out.println("Seu imc é " + imc + " e você está com o peso normal");
    } else if (imc >= 25 && imc < 30) {
      System.out.println("Seu imc é " + imc + " e você está com sobrepeso");
    } else if (imc >= 30 && imc < 35) {
      System.out.println("Seu imc é " + imc + " e você está com obesidade grau I");
    } else if (imc >= 35 && imc < 40) {
      System.out.println("Seu imc é " + imc + " e você está com obesidade grau II");
    } else {
      System.out.println("Seu imc é " + imc + " e você está com obesidade grau III");
    }
  }

  // Exercício 02: Recebe 3 lados de um triângulo e diz se ele é isóceles,
  // equilátero ou escaleno
  public static void exercicio2() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite os três lados de um triângulo:\n");
    float lado1 = scanner.nextFloat();
    float lado2 = scanner.nextFloat();
    float lado3 = scanner.nextFloat();
    if (lado1 == lado2 && lado2 == lado3) {
      System.out.println("O triângulo é equilátero.");
    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
      System.out.println("O triângulo é isóceles.");
    } else {
      System.out.println("O triângulo é escaleno.");
    }
  }

  // Exercício 03: Recebe dois números e realiza uma operação entre eles
  public static void exercicio3() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite dois números:\n");
    float n1 = scanner.nextFloat();
    float n2 = scanner.nextFloat();
    System.out.println("Escolha uma operação:\n");
    System.out.println("1 - Soma\n");
    System.out.println("2 - Subtração\n");
    System.out.println("3 - Multiplicação\n");
    System.out.println("4 - Divisão\n");
    System.out.println("5 - Exponenciação\n");
    int entrada = scanner.nextInt();
    switch (entrada) {
      case 1:
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        break;
      case 2:
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        break;
      case 3:
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        break;
      case 4:
        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        break;
      case 5:
        System.out.println(n1 + " ^ " + n2 + " = " + (Math.pow(n1, n2)));
        break;
      default:
        System.out.println("Entrada inválida.\n");
        break;
    }
  }

  // Exercício 04: Sorteia um número entre 1 e 10 e vê se o número que o usuário
  // digitou foi sorteado
  public static void exercicio4() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número para ser sorteado (entre 1 e 10):\n");
    int numUsuario = scanner.nextInt();
    int numSorteado = (int) (Math.random() * 10);
    if (numUsuario == numSorteado) {
      System.out.println("Número sorteado: " + numSorteado + " \nSeu número foi sorteado, parabeńs!");
    } else {
      System.out.println("Número sorteado: " + numSorteado + " \nNão foi dessa vez...");
    }
  }

  // Exercício 05: Recebe um número e diz se ele é par ou ímpar até receber 0
  public static void exercicio5() {
    Scanner scanner = new Scanner(System.in);
    int n1 = 1;
    while (n1 != 0) {
      System.out.println("Digite um número:\n");
      n1 = scanner.nextInt();
      if (n1 % 2 == 0 && n1 != 0) {
        System.out.println("É par!\n");
      } else if (n1 % 2 != 0) {
        System.out.println("É ímpar!\n");
      }
    }
  }

  // Exercício 06: Cinco numeros e a media entre eles com while
  public static void exercicio6() {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    float entrada;
    float soma = 0;
    float media;
    while (count < 5) {
      System.out.println("Digite o " + (count + 1) + "° número");
      entrada = scanner.nextFloat();
      soma += entrada;
      count++;
    }
    media = soma / (count);
    System.out.println("Média:" + media);
  }

  // Exercício 07: Imprime todos os números primos de 1 a 1000
  public static void exercicio7() {
    Scanner scanner = new Scanner(System.in);
    int count;
    for (int i = 0; i < 1000; i++) {
      count = 0;
      for (int j = 2; j < i; j++) {
        if (i % j != 0) {
          count++;
        }
      }
      if (count == i - 2) {
        System.out.println(i);
      }
    }
  }

  // Exercício 08: Imprime todos os números de 1 a 100 exceto os múltiplos de 5
  public static void exercicio8() {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i < 100; i++) {
      if (i % 5 == 0) {
        continue;
      } else {
        System.out.println(i);
      }
    }
  }
}
