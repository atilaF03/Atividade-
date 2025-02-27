import java.util.ArrayList;
import java.util.Scanner;

public class TarefaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();

        String continuar;
        
        do {
            System.out.print("Digite a descrição da tarefa: ");
            String descricao = scanner.nextLine();
            Tarefa tarefa = new Tarefa(descricao);
            listaTarefas.add(tarefa);

            System.out.print("A tarefa foi concluída? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                tarefa.concluir(); // tarefa concluída
            }

            System.out.print("Deseja adicionar mais uma tarefa? (Sim/Não): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("sim"));
        
        //  a lista de tarefas
        System.out.println("\n--- Lista de Tarefas ---");
        for (Tarefa t : listaTarefas) {
            System.out.println(t); // Chama o método toString() da classe Tarefa
        }

        scanner.close(); // Fecha o scanner
        }
}