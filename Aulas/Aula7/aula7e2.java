public class Main {
  public static void main(String[] args) {
    ContaCorrente corrente = new ContaCorrente(1000);
    ContaPoupanca poupanca = new ContaPoupanca(1000);
    System.out.println("Taxa: 0.25 | Tempo: 6");
    System.out.println("Juros da conta corrente: " + corrente.calcularJuros(0.25, 6));
    System.out.println("Juros da conta poupanca: " + poupanca.calcularJuros(0.25, 6));
  }
}

public abstract class Conta {
  public double saldo;
  public String Cliente;

  public abstract double calcularJuros(double taxa, int meses);
}

public class ContaCorrente extends Conta {
  public ContaCorrente(double saldo) {
    this.saldo = saldo;
  }

  public double calcularJuros(double taxa, int meses) {
    return (double) this.saldo * taxa * meses;
  }
}

public class ContaPoupanca extends Conta {
  public ContaPoupanca(double saldo) {
    this.saldo = saldo;
  }

  public double calcularJuros(double taxa, int meses) {
    return (double) this.saldo * Math.pow(1 + taxa, meses);
  }
}
