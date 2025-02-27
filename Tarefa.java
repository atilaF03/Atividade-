public class Tarefa {
    private String descricao;
    private boolean status; // true para concluído, false para pendente

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.status = false; // Inicialmente, a tarefa é pendente
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return status;
    }

    public void concluir() {
        this.status = true; // Marca a tarefa como concluída
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao + ", Status: " + (status ? "Concluída" : "Pendente");}
}
