import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void antes() {
    System.out.println("Memória antes:");
    int MB = 1024 * 1024;
    Runtime runtime = Runtime.getRuntime();
    System.out.println((runtime.totalMemory()) / MB + "MB");
  }

  public static void depois() {
    Runtime.getRuntime().runFinalization();
    Runtime.getRuntime().gc();
    System.out.println("Memória depois:");
    int MB = 1024 * 1024;
    Runtime runtime = Runtime.getRuntime();
    System.out.println((runtime.totalMemory()) / MB + "MB");
  }

  public static void mostrarLista(int count, ArrayList<String> listaNomes) {
    System.out.println("Lista de Nomes: ");
    for (int i = 0; i < count; i++) {
      System.out.println(listaNomes.get(i));
    }
  }

  public static void main(String[] args) {
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    antes();
    ArrayList<String> listaNomes = new ArrayList<>();
    String entrada = scanner.nextLine();
    listaNomes.add(entrada);
    while (!entrada.contains("sair")) {
      entrada = scanner.nextLine();
      listaNomes.add(entrada);
      count++;
    }
    mostrarLista(count, listaNomes);
    depois();
    scanner.close();
  }
}
