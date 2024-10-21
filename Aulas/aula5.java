import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Cliente meuCliente = new Cliente("José Ivo", "00000000000");
    ContaBancaria minhaConta = new ContaBancaria(meuCliente, 0);
    System.out.println("Digite a opção que deseja:\n 1 - Depositar\n 2 - Sacar\n 3 - Mostrar Informações\n 0 - Sair");
    int entrada = scanner.nextInt();
    while (entrada != 0) {
      switch (entrada) {
        case 1:
          System.out.println("Digite o deposito: ");
          minhaConta.depositar(scanner.nextDouble());
          System.out
              .println("Digite a opção que deseja:\n 1 - Depositar\n 2 - Sacar\n 3 - Mostrar Informações\n 0 - Sair");
          entrada = scanner.nextInt();
          break;
        case 2:
          System.out.println("Digite o saque: ");
          minhaConta.sacar(scanner.nextDouble());
          System.out
              .println("Digite a opção que deseja:\n 1 - Depositar\n 2 - Sacar\n 3 - Mostrar Informações\n 0 - Sair");
          entrada = scanner.nextInt();
          break;
        case 3:
          System.out.println("Informações:\n");
          System.out.println("Nome do Cliente: " + meuCliente.getNome());
          System.out.println("CPF do Cliente: " + meuCliente.getCpf());
          System.out.println("Saldo da conta: " + minhaConta.getSaldo());
          System.out
              .println("Digite a opção que deseja:\n 1 - Depositar\n 2 - Sacar\n 3 - Mostrar Informações\n 0 - Sair");
          entrada = scanner.nextInt();
          break;
        case 0:
          return;
        default:
          System.out.println("Erro. Opção Inválida.");
          System.out
              .println("Digite a opção que deseja:\n 1 - Depositar\n 2 - Sacar\n 3 - Mostrar Informações\n 0 - Sair");
          entrada = scanner.nextInt();
          break;
      }
    }
  }
}

class Cliente {
  private String nome;
  private String cpf;

  public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome() {
    return this.nome;
  }

  public String getCpf() {
    return this.cpf;
  }

}

class ContaBancaria {
  private double saldo;
  private Cliente cliente;

  public ContaBancaria(Cliente cliente, double saldo) {
    this.cliente = cliente;
    this.saldo = saldo;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public double depositar(double deposito) {
    this.saldo += deposito;
    return this.saldo;
  }

  public double sacar(double saque) {
    if (saque > this.saldo) {
      System.out.println("Saldo insuficiente.");
      return this.saldo;
    }
    this.saldo -= saque;
    return this.saldo;
  }

}
