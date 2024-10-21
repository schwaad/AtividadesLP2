import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    // exercicio1();
    // exercicio2();
    // exercicio3();
    // exercicio4();
    // exercicio5();
    exercicio6();
  }

  public static void exercicio1() {
    Scanner scanner = new Scanner(System.in);
    int[] vetorInt = new int[10];
    int entrada;
    int maior = 0;
    System.out.println("Digite 10 números:");
    for (int i = 0; i < 10; i++) {
      entrada = scanner.nextInt();
      vetorInt[i] = entrada;
      if (i == 0) {
        maior = entrada;
      } else {
        if (entrada >= maior) {
          maior = entrada;
        }
      }
    }
    System.out.println("O maior número digitado foi: " + maior);
  }

  public static void exercicio2() {
    Scanner scanner = new Scanner(System.in);
    int[] vetorInt = new int[10];
    int entrada;
    int maior = 0;
    System.out.println("Digite 10 números: ");
    for (int i = 0; i < 10; i++) {
      entrada = scanner.nextInt();
      vetorInt[i] = entrada;
      if (i == 0) {
        maior = entrada;
      } else {
        if (vetorInt[i - 1] > vetorInt[i]) {
          int aux;
          aux = vetorInt[i];
          vetorInt[i] = vetorInt[i - 1];
          vetorInt[i - 1] = aux;
        }
      }
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(vetorInt[i] + " ");
    }
  }

  public static void exercicio3() {
    Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf("Insira o elemento M[%d][%d]: ", i + 1, j + 1);
        matriz[i][j] = scanner.nextInt();
      }
    }
    System.out.println("Matriz criada:\n");

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public static void exercicio4() {
    Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    int soma = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf("Insira o elemento M[%d][%d]: ", i + 1, j + 1);
        matriz[i][j] = scanner.nextInt();
        soma += matriz[i][j];
      }
    }
    System.out.println("Matriz criada:\n");

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("Soma de todos os elementos: " + soma);
  }

  public static void exercicio5() {
    Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          matriz[i][j] = 1;
        } else if (i > j) {
          matriz[i][j] = 2;
        } else if (i < j) {
          matriz[i][j] = 3;
        }
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public static void exercicio6() {
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
