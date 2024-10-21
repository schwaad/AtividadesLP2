import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite dois números:\n");
    float n1 = scanner.nextFloat();
    float n2 = scanner.nextFloat();
    switch (menu()) {
      case 1:
        System.out.println("Resultado: " + soma(n1, n2));
        break;
      case 2:
        System.out.println("Resultado: " + subtracao(n1, n2));
        break;
      case 3:
        System.out.println("Resultado: " + multiplicacao(n1, n2));
        break;
      case 4:
        System.out.println("Resultado: " + divisao(n1, n2));
        break;
      default:
        break;
    }
  }

  public static int menu() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha uma operação:\n");
    System.out.println("1 - Soma\n");
    System.out.println("2 - Subtração\n");
    System.out.println("3 - Multiplicação\n");
    System.out.println("4 - Divisão\n");
    int entrada = scanner.nextInt();
    if (entrada < 1 || entrada > 4) {
      System.out.println("Entrada inválida, tente novamente.\n");
      return menu();
    }
    return entrada;
  }

  public static float soma(float n1, float n2) {
    return n1 + n2;
  }

  public static float subtracao(float n1, float n2) {
    return n1 - n2;
  }

  public static float multiplicacao(float n1, float n2) {
    return n1 * n2;
  }

  public static float divisao(float n1, float n2) {
    return n1 / n2;
  }
}
