public class Main {
  public static void main(String[] args) {

  }
}

public abstract class Forma {
  public String cor;
  public boolean filled;

  public abstract double area();

  public abstract double perimetro();

}

public class Circulo extends Forma {
  private double raio;

  public double area() {
    return 2 * Math.PI * raio * raio;
  }

  public double perimetro() {
    return raio * raio * Math.PI;
  }
}

public class Retangulo extends Forma {
  public double altura;
  public double largura;

  public double area() {
    return altura * largura;
  }

  public double perimetro() {
    return 2 * altura + 2 * largura;
  }
}

// A classe quadrado não precisa existir, visto que existe a classe retângulo,
// mas o exercício solicita que criem três classes.
public class Quadrado extends Forma {
  public double lado;

  public double area() {
    return lado * lado;
  }

  public double perimetro() {
    return 4 * lado;
  }
}
