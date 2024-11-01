public class Main {

  public static void main(String[] args) {
    Carro carro1 = new Carro();
    Carro carro2 = new Carro();
    Carro carro3 = new Carro();
    carro1.setMarca("Volkswagen");
    carro1.setModelo("Scirocco");
    carro1.setAno(2020);
    carro2.setMarca("Porsche");
    carro2.setModelo("911");
    carro2.setAno(2020);
    carro3.setMarca("Nissan");
    carro3.setModelo("Sentra");
    carro3.setAno(2015);
    System.out.println(
        "Carro 1:\n Marca: " + carro1.getMarca() + "\n Modelo: " + carro1.getModelo() + "\n Ano: " + carro1.getAno());
    System.out.println(
        "Carro 2:\n Marca: " + carro2.getMarca() + "\n Modelo: " + carro2.getModelo() + "\n Ano: " + carro2.getAno());
    System.out.println(
        "Carro 3:\n Marca: " + carro3.getMarca() + "\n Modelo: " + carro3.getModelo() + "\n Ano: " + carro3.getAno());
  }
}
