import java.util.ArrayList;
import java.util.Scanner;

public class AppProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> list = new ArrayList<>();
        int escolha = 0;
        String nomeProduto;
        double preco, quantidade;
        while (escolha != 3) {

            System.out.println("====================");
            System.out.println("1-cadastrar Produto");
            System.out.println("2-consultar Produto");
            System.out.println("3 encerrar programinha");
            System.out.println("====================");

            escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha) {
                case 1:
                    System.out.println("insira o nome do produto:");
                    nomeProduto = sc.nextLine();
                    System.out.println("insira o valordo produto:");
                    preco = sc.nextDouble();
                    System.out.println("insira a quantidade do produto:");
                    quantidade = sc.nextDouble();
                    list.add(new Produto(nomeProduto, preco, quantidade));

                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("nenhum produto cadastrado");
                    } else {
                        for (Produto produto : list) {
                            System.out.println("o produto é: " + produto.getNome());
                            System.out.println("o preço produto é: " + produto.getPreco());
                            System.out.println("a quantidade produto é: " + produto.getQuantidade());
                        }

                    }
                    break;
                case 3:
                    escolha = 3;
                default:
                    break;
            }

        }

        sc.close();
    }
}
