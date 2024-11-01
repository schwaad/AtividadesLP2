public class ColetorLixo {
  public static void obterMemoriaUsada() {
    int MB = 1024 * 1024;
    Runtime runtime = Runtime.getRuntime();
    System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB + "MB");
  }

  public static void main(String[] args) {
    Contato[] contatos = new Contato[1000000];
    Contato contato;
    for (int i = 0; i < contatos.length; i++) {
      contato = new Contato("Contato" + i, "1234-5678" + i, "contato" + i + "@email.com");
      contatos[i] = contato;
    }
    System.out.println("Contatos criados");
    obterMemoriaUsada();
    contatos = null;
    Runtime.getRuntime().runFinalization();
    Runtime.getRuntime().gc();
    System.out.println("Contatos removidos da memória");
    obterMemoriaUsada();
  }
}
