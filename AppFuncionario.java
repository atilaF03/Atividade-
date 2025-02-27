import java.util.ArrayList;
import java.util.Scanner;

public class AppFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> list = new ArrayList<>();
        int escolha = 0;
        String nome, cargo;
        double salario;

        while (escolha != 3) {
            System.out.println("::::::Menu::::::");
            System.out.println("1-Cadastrar novo funcionario");
            System.out.println("2- listar funcionarios");
            System.out.println("3 encerrar programa ");
            escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha) {
                case 1:
                    System.out.println("insira o nome do Novo funcionario:");
                    nome = sc.nextLine();
                    System.out.println("cargo na empresa");
                    cargo = sc.nextLine();
                    System.out.println("Salario:");
                    salario = sc.nextDouble();
                    list.add(new Funcionario(nome, cargo, salario));

                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("não tem funcionarios cadastrados");
                    } else {
                        for (Funcionario c : list) {
                            System.out.println("=====================");
                            System.out.println("o nome do funcionario é: " + c.getNome());
                            System.out.println("o cargo do funcionario é " + c.getCargo());
                            System.out.printf("o salario do funcionario é %.2f\n", c.getSalario());
                            System.out.println("=====================");

                        }

                    }
                    break;
                    case 3:
                    System.out.println("programa encerrado");
                    escolha =3;
                default:
                    break;
            }

        }
        sc.close();
    }
}
