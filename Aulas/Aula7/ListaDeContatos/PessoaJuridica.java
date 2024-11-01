public class PessoaJuridica extends Pessoa {
  public long cnpj;
  public long inscricaoEstadual;
  public String razaoSocial;

  public long getCNPJ() {
    return this.cnpj;
  }

  public void mostrarInformacoes() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Endereco: " + this.endereco);
    System.out.println("Email: " + this.email);
    System.out.println("CNPJ: " + this.cnpj);
    System.out.println("Inscricao Estadual: " + this.inscricaoEstadual);
    System.out.println("Razao Social: " + this.razaoSocial);
  }
}
