import java.util.Scanner;

public class Permuta {
  public static void main(String[] args) {
    int[] VNum = new int[10];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      System.out.printf("Digite o %d numero: ", i + 1);
      VNum[i] = scanner.nextInt();
    }

    PermutarVetor(VNum);
    MostrarVetor(VNum);

    scanner.close();
  }

  public static void MostrarVetor(int[] VNum) {
    System.out.println("A ordem crescente eh:");
    for (int i = 0; i < 10; i++) {
      System.out.print(VNum[i] + " ");
    }
    System.out.println(); // Para pular a linha ao final
  }

  public static int[] PermutarVetor(int[] VNum) {
    int troca;
    for (int i = 0; i < 10; i++) {
      for (int j = i; j < 10; j++) {
        if (VNum[i] > VNum[j]) {
          troca = VNum[i];
          VNum[i] = VNum[j];
          VNum[j] = troca;
        }
      }
    }
    return VNum;
  }
}
