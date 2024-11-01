public class Main {
  public static void main(String[] args) {
    Carro carro = new Carro("Ford", "Ka");
    carro.acelerar();
    Moto moto = new Moto("Honda", "CB500");
    moto.acelerar();
  }
}

public abstract class Veiculo {
  public String marca;
  public String modelo;

  public void exibirInformacoes() {
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
  }
}

public class Carro extends Veiculo {
  public Carro(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public void acelerar() {
    System.out.println("Vrum vrum");
  }
}

public class Moto extends Veiculo {
  public Moto(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public void acelerar() {
    System.out.println("Ran dan dan");
  }
}
