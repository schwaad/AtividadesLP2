public class PessoaFisica extends Pessoa {
  public long cpf;
  public String estadoCivil;
  public String dataNascimento;

  public void mostrarInformacoes() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Endereco: " + this.endereco);
    System.out.println("Email: " + this.email);
    System.out.println("CPF: " + this.cpf);
    System.out.println("Estado Civil: " + this.estadoCivil);
    System.out.println("Data de Nascimento: " + this.dataNascimento);
  }

  public long getCPF() {
    return this.cpf;
  }
}
