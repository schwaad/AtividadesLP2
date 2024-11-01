public class Main {
  public static void main(String[] args) {
    Retangulo retangulo = new Retangulo(5, 5);
    Circulo circulo = new Circulo(2);
    System.out.println("Área do retângulo: " + retangulo.calcularArea());
    System.out.println("Área do círculo: " + circulo.calcularArea());
  }
}

public abstract class Forma {
  public abstract double calcularArea();
}

public class Retangulo extends Forma {
  private double altura;
  private double largura;

  public Retangulo(double altura, double largura) {
    this.altura = altura;
    this.largura = largura;
  }

  public double calcularArea() {
    return this.altura * this.largura;
  }
}

public class Circulo extends Forma {
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  public double calcularArea() {
    return this.raio * this.raio * Math.PI;
  }
}
