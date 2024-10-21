import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // exercicio1();
    // exercicio2();
    // exercicio3();
    // exercicio4();
    // exercicio5();
    // exercicio6();
    // exercicio7();
    // exercicio8();
    // exercicio9();
    exercicio10();
  }

  public static void exercicio1() {
    Scanner scanner = new Scanner(System.in);
    int n;
    int entrada;
    System.out.println("Digite o tamanho do vetor:");
    n = scanner.nextInt();
    int[] ns = new int[n];
    System.out.println("Digite o vetor:");
    for (int i = n - 1; i >= 0; i--) {
      entrada = scanner.nextInt();
      ns[i] = entrada;
    }
    System.out.println("Sequencia invertida: ");
    for (int i = 0; i < n; i++) {
      System.out.println(ns[i]);
    }
  }

  public static void exercicio2() {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[10];

    for (int i = 0; i < 10; i++) {
      numeros[i] = scanner.nextInt();
    }

    for (int i = 0; i < numeros.length - 1; i++) {
      for (int j = 0; j < numeros.length - 1 - i; j++) {
        if (numeros[j] < numeros[j + 1]) {
          int temp = numeros[j];
          numeros[j] = numeros[j + 1];
          numeros[j + 1] = temp;
        }
      }
    }

    for (int numero : numeros) {
      System.out.println(numero);
    }

    scanner.close();
  }

  public static void exercicio3() {
    Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[5][5];
    int maiorValor = Integer.MIN_VALUE;
    int linhaMaior = 0, colunaMaior = 0;

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        matriz[i][j] = scanner.nextInt();
        if (matriz[i][j] > maiorValor) {
          maiorValor = matriz[i][j];
          linhaMaior = i;
          colunaMaior = j;
        }
      }
    }

    System.out.println("Maior valor: " + maiorValor);
    System.out.println("Posição: Linha " + linhaMaior + ", Coluna " + colunaMaior);

    scanner.close();
  }

  public static void exercicio4() {
    Scanner scanner = new Scanner(System.in);
    int[][] matrizA = new int[2][3];
    int[][] matrizB = new int[3][2];
    int[][] resultado = new int[2][2];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        matrizA[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        matrizB[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 3; k++) {
          resultado[i][j] += matrizA[i][k] * matrizB[k][j];
        }
      }
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(resultado[i][j] + " ");
      }
      System.out.println();
    }

    scanner.close();
  }

  public static void exercicio5() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] triangulo = new int[n][n];

    for (int i = 0; i < n; i++) {
      triangulo[i][0] = 1;
      for (int j = 1; j <= i; j++) {
        triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(triangulo[i][j] + " ");
      }
      System.out.println();
    }

    scanner.close();
  }

  public static void exercicio6() {
    int[][] matriz = new int[5][5];

    for (int i = 0; i < 5; i++) {
      matriz[i][i] = 1;
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void exercicio7() {
    Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    int soma = 0;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        matriz[i][j] = scanner.nextInt();
        if (i < j) {
          soma += matriz[i][j];
        }
      }
    }

    System.out.println("Soma dos elementos acima da diagonal principal: " + soma);

    scanner.close();
  }

  public static void exercicio8() {
    Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    int soma = 0;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        matriz[i][j] = scanner.nextInt();
        if (i > j) {
          soma += matriz[i][j];
        }
      }
    }

    System.out.println("Soma dos elementos abaixo da diagonal principal: " + soma);

    scanner.close();
  }

  public static void exercicio9() {
    Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    int soma = 0;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        matriz[i][j] = scanner.nextInt();
        if (i == j) {
          soma += matriz[i][j];
        }
      }
    }

    System.out.println("Soma dos elementos abaixo da diagonal principal: " + soma);

    scanner.close();
  }

  public static void exercicio10() {
    Scanner scanner = new Scanner(System.in);
    char[][] tabuleiro = new char[8][8];
    int linhaTorre;
    int colunaTorre;
    System.out.println("Digite a linha onde a torre se encontra: \n");
    linhaTorre = scanner.nextInt();
    System.out.println("Digite a coluna onde a torre se encontra: \n");
    colunaTorre = scanner.nextInt();
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (i == linhaTorre || j == colunaTorre) {
          tabuleiro[i][j] = 'x';
        } else {
          tabuleiro[i][j] = '-';
        }
      }
    }
    System.out.println("Movimentos possíveis da torre:\n");
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.print(tabuleiro[i][j] + " ");
      }
      System.out.println("");
    }

  }

}
