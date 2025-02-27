
import java.util.ArrayList;
import java.util.Scanner;

public class AppCliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> list = new ArrayList();
        int op = 0;
        while (op != 4) {
            System.out.println("====================");
            System.out.println("1-cadastrar cliente");
            System.out.println("2-consultar cliente");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Insira um nome ");
                    String nome = sc.next();
                    System.out.println("Insira um email");
                    String email = sc.next();
                    System.out.println("insira um telefone");
                    String telefone = sc.next();
                    list.add(new Cliente(nome, email, telefone));

                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("a lista esta vazia ");
                    } else {
                        for (Cliente c : list) {
                            System.out.println(" o nome do cliente é: " + c.getNome());
                            System.out.println(" o email  do cliente é: " + c.getEmail());
                            System.out.println(" o telefone do cliente é: " + c.getTelefone());
                        }

                    }

                    break;
                default:
                    break;
            }

        }

        sc.close();
    }

}