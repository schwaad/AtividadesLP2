import java.util.Scanner;

public class Main {
  public static void menu() {
    clearScreen();
    System.out.println("\nBem vindo a sua Agenda!\n");
    System.out.println("-------------------------------------------------");
    System.out.println("Insira a opcao que deseja: ");
    System.out.println("1 - Adicionar novo Contato");
    System.out.println("2 - Remover um Contato");
    System.out.println("3 - Pesquisar um Contato");
    System.out.println("4 - Mostrar todos os Contatos");
    System.out.println("0 - Sair");
  }

  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    agenda.ordenarPorCPF();
    agenda.ordenarPorCNPJ();
    Scanner scanner = new Scanner(System.in);
    menu();
    int entrada = scanner.nextInt();
    while (entrada != 0) {
      switch (entrada) {
        case 1:
          agenda.adicionarContato();
          scanner.nextLine();
          agenda.ordenarPorCPF();
          agenda.ordenarPorCNPJ();
          menu();
          entrada = scanner.nextInt();
          break;
        case 2:
          agenda.removerContato();
          menu();
          entrada = scanner.nextInt();
          break;
        case 3:
          agenda.pesquisarContato();
          menu();
          entrada = scanner.nextInt();
          break;
        case 4:
          agenda.mostrarContatos();
          menu();
          entrada = scanner.nextInt();
          break;
        case 0:
          System.out.println("Saindo.");
          scanner.close();
          return;
        default:
          System.out.println("Entrada inválida.");
          menu();
          entrada = scanner.nextInt();
          break;
      }
    }
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

}
