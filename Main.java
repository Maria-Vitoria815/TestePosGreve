import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RegraNegocioFuncionario rnFuncionario = new RegraNegocioFuncionario();
        RegraNegocioEmpresa rnEmpresa = new RegraNegocioEmpresa();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Funcionario");
            System.out.println("2. Listar Funcionarios");
            System.out.println("3. Cadastrar Empresa");
            System.out.println("4. Listar Empresas");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Preencha as informações abaixo:");
                    System.out.println("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Nome: ");
                    String nomeFunc = scanner.nextLine();
                    System.out.println("RG: ");
                    String rg = scanner.nextLine();
                    System.out.println("Telefone: ");
                    String telefoneFuncionario = scanner.nextLine();
                    Funcionario funcionario = new Funcionario(cpf, nomeFunc, rg, telefoneFuncionario);
                    rnFuncionario.cadastrarFuncionario(funcionario);
                    break;
                case 2:
                    System.out.println("Funcionarios cadastrados:");
                    for (Funcionario f : rnFuncionario.listarFuncionario()) {
                        System.out.println(f);
                    }
                    break;
                case 3:
                    System.out.println("Preencha as informações abaixo:");
                    System.out.println("CNPJ: ");
                    String cnpj = scanner.nextLine();
                    System.out.println("Nome: ");
                    String nomeEmpresa = scanner.nextLine();
                    System.out.println("Telefone: ");
                    String telefoneEmpresa = scanner.nextLine();
                    Empresa empresa = new Empresa(cnpj, nomeEmpresa, telefoneEmpresa);
                    rnEmpresa.cadastrarEmpresa(empresa);
                    break;
                case 4:
                    System.out.println("Empresas cadastradas:");
                    for (Empresa e : rnEmpresa.listarEmpresa()) {
                        System.out.println(e);
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

}
