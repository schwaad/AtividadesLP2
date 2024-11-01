import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Retangulo retangulo = new Retangulo();
    // retangulo.mostrarInfo();
    // retangulo.setAltura();
    // retangulo.setLargura();
    // retangulo.mostrarInfo();
    TrianguloRetangulo trianguloRet = new TrianguloRetangulo();
    trianguloRet.mostrarInfo();
    trianguloRet.setCatetoBase();
    trianguloRet.setCatetoAltura();
    trianguloRet.hipotenusa();
    trianguloRet.mostrarInfo();
    System.out.println("Área: " + trianguloRet.area());
    System.out.println("Perimetro: " + trianguloRet.perimetro());
  }
}

public class Retangulo {
  private float altura;
  private float largura;

  public Retangulo() {
    this.altura = 0;
    this.largura = 0;
  }

  public float setAltura() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a altura: ");
    float altura = scanner.nextFloat();
    this.altura = altura;
    return this.altura;
  }

  public float setLargura() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a largura: ");
    float largura = scanner.nextFloat();
    this.largura = largura;
    return this.largura;
  }

  public void mostrarInfo() {
    System.out.println("Altura: " + this.altura + " Largura: " + this.largura);
  }

  public float area() {
    return this.largura * this.altura;
  }

  public float perimetro() {
    return this.largura * 2 + this.altura * 2;
  }
}

public class TrianguloRetangulo {
  private double catetoBase;
  private double catetoAltura;
  private double hipotenusa;

  public TrianguloRetangulo() {
    this.catetoBase = 0;
    this.catetoAltura = 0;
    this.hipotenusa = 0;
  }

  public double setCatetoBase() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o cateto base");
    float catetoBase = scanner.nextFloat();
    this.catetoBase = catetoBase;
    return this.catetoBase;
  }

  public double setCatetoAltura() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o cateto altura");
    float catetoAltura = scanner.nextFloat();
    this.catetoAltura = catetoAltura;
    return this.catetoAltura;
  }

  public double hipotenusa() {
    this.hipotenusa = Math.sqrt(this.catetoAltura * this.catetoAltura + this.catetoBase * this.catetoBase);
    return this.hipotenusa;
  }

  public double area() {
    return (this.catetoAltura * this.catetoBase) / 2;
  }

  public double perimetro() {
    return this.catetoAltura + this.catetoBase + this.hipotenusa;
  }

  public void mostrarInfo() {
    System.out.println(
        "Cateto Base: " + this.catetoBase + " Cateto Altura: " + this.catetoAltura + " Hipotenusa: " + this.hipotenusa);
  }
}
