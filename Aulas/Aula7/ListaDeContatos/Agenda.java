import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
  public ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();
  public ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();
  public int numContatos = pessoasFisicas.size() + pessoasJuridicas.size();

  public ArrayList<PessoaFisica> ordenarPorCPF() {
    for (int i = 1; i < this.pessoasFisicas.size(); i++) {
      if (this.pessoasFisicas.get(i - 1).getCPF() > this.pessoasFisicas.get(i).getCPF()) {
        PessoaFisica aux = this.pessoasFisicas.get(i - 1);
        this.pessoasFisicas.set(i - 1, this.pessoasFisicas.get(i));
        this.pessoasFisicas.set(i, aux);
      }
    }
    return this.pessoasFisicas;
  }

  public ArrayList<PessoaJuridica> ordenarPorCNPJ() {
    for (int i = 1; i < this.pessoasJuridicas.size(); i++) {
      if (this.pessoasJuridicas.get(i - 1).getCNPJ() > this.pessoasJuridicas.get(i).getCNPJ()) {
        PessoaJuridica aux = this.pessoasJuridicas.get(i - 1);
        this.pessoasJuridicas.set(i - 1, this.pessoasJuridicas.get(i));
        this.pessoasJuridicas.set(i, aux);
      }
    }
    return this.pessoasJuridicas;
  }

  public void adicionarContato() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha uma opcao:\n 1 - Pessoa Fisica\n 2 - Pessoa Juridica");
    int entrada = scanner.nextInt();
    scanner.nextLine();

    if (entrada == 1) {
      PessoaFisica newPessoaFisica = new PessoaFisica();
      System.out.println("Insira o nome: ");
      newPessoaFisica.nome = scanner.nextLine();
      System.out.println("Insira o endereco: ");
      newPessoaFisica.endereco = scanner.nextLine();
      System.out.println("Insira o email: ");
      newPessoaFisica.email = scanner.nextLine();
      System.out.println("Insira o CPF: ");
      newPessoaFisica.cpf = scanner.nextLong();
      if (!cpfIsValid(newPessoaFisica.cpf)) {
        System.out.println("Esse contato já foi cadastrado.");
        waitForInput();
        return;
      }
      scanner.nextLine();
      System.out.println("Insira o estado civil: ");
      newPessoaFisica.estadoCivil = scanner.nextLine();
      System.out.println("Insira a data de nascimento (dd/mm/aaaa): ");
      newPessoaFisica.dataNascimento = scanner.nextLine();
      this.pessoasFisicas.add(newPessoaFisica);
      this.numContatos++;
    } else if (entrada == 2) {
      PessoaJuridica newPessoaJuridica = new PessoaJuridica();
      System.out.println("Insira o nome: ");
      newPessoaJuridica.nome = scanner.nextLine();
      System.out.println("Insira o endereco: ");
      newPessoaJuridica.endereco = scanner.nextLine();
      System.out.println("Insira o email: ");
      newPessoaJuridica.email = scanner.nextLine();
      System.out.println("Insira o CNPJ: ");
      newPessoaJuridica.cnpj = scanner.nextLong();
      if (!cnpjIsValid(newPessoaJuridica.cnpj)) {
        System.out.println("Esse contato já foi cadastrado.");
        waitForInput();
        return;
      }
      scanner.nextLine();
      System.out.println("Insira a inscricao estadual: ");
      newPessoaJuridica.inscricaoEstadual = scanner.nextLong();
      scanner.nextLine();
      System.out.println("Insira a razao social: ");
      newPessoaJuridica.razaoSocial = scanner.nextLine();
      this.pessoasJuridicas.add(newPessoaJuridica);
      this.numContatos++;
    } else {
      System.out.println("Entrada Inválida.");
      waitForInput();
      return;
    }
  }

  public void removerContato() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha uma opcao:\n 1 - Pessoa Fisica\n 2 - Pessoa Juridica");
    int entrada = scanner.nextInt();
    if (entrada == 1) {
      System.out.println("Insira o CPF: ");
      long cpf = scanner.nextLong();
      for (int i = 0; i < this.pessoasFisicas.size(); i++) {
        if (cpf == this.pessoasFisicas.get(i).getCPF()) {
          this.pessoasFisicas.remove(i);
        }
      }
    }
    if (entrada == 2) {
      System.out.println("Insira o CNPJ: ");
      long cnpj = scanner.nextLong();
      for (int i = 0; i < this.pessoasFisicas.size(); i++) {
        if (cnpj == this.pessoasJuridicas.get(i).getCNPJ()) {
          this.pessoasJuridicas.remove(i);
        }
      }
    }
  }

  public void mostrarContatos() {
    int count = 1;
    System.out.println("Lista de Contatos: ");
    System.out.println("-------------------------------------------------");

    for (int i = 0; i < this.pessoasFisicas.size(); i++) {
      System.out.println("Contato 0" + count + ":");
      System.out.println("");
      this.pessoasFisicas.get(i).mostrarInformacoes();
      count++;
    }
    System.out.println("");
    for (int i = 0; i < this.pessoasJuridicas.size(); i++) {
      System.out.println("Contato 0" + count + ":");
      System.out.println("");
      this.pessoasJuridicas.get(i).mostrarInformacoes();
      count++;
    }
    System.out.println("-------------------------------------------------");

    waitForInput();
  }

  public void pesquisarContato() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha uma opcao:\n 1 - Pessoa Fisica\n 2 - Pessoa Juridica");
    int entrada = scanner.nextInt();
    if (entrada == 1) {
      System.out.println("Digite o CPF:");
      long cpf = scanner.nextLong();
      for (int i = 0; i < this.pessoasFisicas.size(); i++) {
        if (cpf == this.pessoasFisicas.get(i).getCPF()) {
          pessoasFisicas.get(i).mostrarInformacoes();
          waitForInput();
          return;
        }
      }
      System.out.println("Contato não encontrado.");
      waitForInput();
      return;
    } else if (entrada == 2) {
      System.out.println("Digite o CNPJ:");
      long cnpj = scanner.nextLong();
      for (int i = 0; i < this.pessoasJuridicas.size(); i++) {
        if (cnpj == this.pessoasJuridicas.get(i).getCNPJ()) {
          pessoasFisicas.get(i).mostrarInformacoes();
          waitForInput();
          return;
        }
      }
      System.out.println("Contato não encontrado.");
      waitForInput();
      return;
    } else {
      System.out.println("Entrada inválida.");
      waitForInput();
    }
  }

  public boolean cpfIsValid(long cpf) {
    for (int i = 0; i < this.pessoasFisicas.size(); i++) {
      if (cpf == this.pessoasFisicas.get(i).getCPF()) {
        return false;
      }
    }
    return true;
  }

  public boolean cnpjIsValid(long cnpj) {
    for (int i = 0; i < this.pessoasJuridicas.size(); i++) {
      if (cnpj == this.pessoasJuridicas.get(i).getCNPJ()) {
        return false;
      }
    }
    return true;
  }

  public int waitForInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite 0 para continuar.");
    if (scanner.nextInt() == 0) {
      return 0;
    } else {
      return waitForInput();
    }
  }
}
