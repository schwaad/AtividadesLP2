import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    // exercicio1();
    // exercicio2();
    // exercicio3();
    // exercicio4();
    // exercicio5();
    // exercicio6();
    // exercicio7();
    // exercicio8();
    // exercicio9();
    exercicio10();
  }

  public static void exercicio1() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o tamanho da base do retângulo: \n");
    float base = scanner.nextFloat();
    System.out.println("Digite a altura do retângulo: \n");
    float altura = scanner.nextFloat();
    float area = base * altura;
    float perimetro = 2 * base + 2 * altura;
    System.out.println("\nÁrea: " + area + "\n");
    System.out.println("Perímetro: " + perimetro + "\n");
  }

  public static void exercicio2() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o tamanho do lado do quadrado: \n");
    float lado = scanner.nextFloat();
    float area = lado * lado;
    float perimetro = lado * 4;
    System.out.println("\nÁrea: " + area + "\n");
    System.out.println("Perímetro: " + perimetro + "\n");
  }

  public static void exercicio3() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o raio da circunferência: \n");
    float raio = scanner.nextFloat();
    float circunferencia = raio * 6.28f;
    System.out.println("\nPerímetro da circunferência (pi = 3,14): " + circunferencia);
  }

  public static void exercicio4() {
    Scanner scanner = new Scanner(System.in);
    float lado;
    float perimetro = 0;
    for (int i = 0; i < 3; i++) {
      System.out.println("Digite o lado " + (i + 1) + " do triângulo\n");
      lado = scanner.nextFloat();
      perimetro += lado;
    }
    System.out.println("O perímetro do triângulo é: " + perimetro);
  }

  public static void exercicio5() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite dois números: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    System.out.println("Divisão: " + num1 / num2 + "\n");
    System.out.println("Resto: " + num1 % num2 + "\n");
  }

  public static void exercicio6() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua idade, em dias: \n");
    int idadeDias = scanner.nextInt();
    int idadeMeses = idadeDias / 30;
    int idadeAnos = idadeMeses / 12;
    System.out.println("Sua idade em:\n Dias: " + idadeDias + "\n Meses: " + idadeMeses + "\n Anos: " + idadeAnos);
  }

  public static void exercicio7() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a temperatura em F°:\n");
    float temperaturaF = scanner.nextFloat();
    float temperaturaC = (5 * temperaturaF - 160) / 9;
    System.out.println("\nTemperatura convertida para C°: " + temperaturaC);
  }

  public static void exercicio8() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o raio da base: \n");
    float raio = scanner.nextFloat();
    System.out.println("Digite a altura: \n");
    float altura = scanner.nextFloat();
    float area = raio * 3.14f * 2f * altura;
    System.out.println("Área da lata: " + area);
  }

  public static void exercicio9() {

    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();
    String binario = "";

    while (numero > 0) {
      binario = (numero % 2) + binario;
      numero /= 2;
    }
    System.out.println(binario.isEmpty() ? "0" : binario);
  }

  public static void exercicio10() {
    Scanner scanner = new Scanner(System.in);
    float nota;
    float somaBimestre = 0;
    float mediaBimestre = 0;
    float somaSemestre = 0;
    for (int i = 0; i < 2; i++) {
      somaBimestre = 0;
      for (int j = 0; j < 2; j++) {
        System.out.printf("Digite a nota " + (j + 1) + " do " + (i + 1) + "° semestre : \n");
        nota = scanner.nextInt();
        somaBimestre += nota;
        mediaBimestre = somaBimestre / 2;
      }
      somaSemestre += mediaBimestre;
    }
    System.out.println("A sua média semestral é: " + (somaSemestre / 2));
  }

  public static void exercicio11() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a velocidade em km/h:\n");
    float velocidade = scanner.nextFloat();
    System.out.println("Velocidade em m/s: " + velocidade * 3.6);
  }

  public static void exercicio12() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a resistência do primeiro resistor: \n");
    int r1 = scanner.nextInt();
    System.out.println("Digite a resistência do segundo resistor (em paralelo com o primeiro): \n");
    int r2 = scanner.nextInt();
    System.out.println("Digite a resistência do terceiro resistor: \n");
    int r3 = scanner.nextInt();
    int resistenciaTotal = (r1 * r2) / (r1 + r2) + r3;
    System.out.println("Resistência Total: " + resistenciaTotal);
  }

  public static void exercicio13() {
    Scanner scanner = new Scanner(System.in);

    int tempo = scanner.nextInt();
    System.out.println("Digite a velocidade: ");
    int velocidade = scanner.nextInt();

    int distancia = tempo * velocidade;
    double litrosGastos = (double) distancia / 12;

    System.out.println("Litros Gastos: " + litrosGastos);
  }

  public static void exercicio14() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite as duas variáveis:");
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    n1 = n1 - n2;
    n2 = n2 + n1;
    n1 = n2 - n1;
    System.out.println("Primeiro número: " + n1 + "Segundo número: " + n2);
  }

  public static void exercicio15() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite, respectivamente, o comprimento, a largura e a altura\n");
    double comprimento = scanner.nextDouble();
    double largura = scanner.nextDouble();
    double altura = scanner.nextDouble();

    double volume = comprimento * largura * altura;

    System.out.println(volume);
  }
}
