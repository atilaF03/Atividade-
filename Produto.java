public class Produto {
private String Nome;
private double  preco, quantidade;



public Produto(String nome, double preco, double quantidade) {
    Nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}



public String getNome() {
    return Nome;
}



public void setNome(String nome) {
    Nome = nome;
}



public double getPreco() {
    return preco;
}



public void setPreco(double preco) {
    this.preco = preco;
}



public double getQuantidade() {
    return quantidade;
}



public void setQuantidade(double quantidade) {
    this.quantidade = quantidade;
}





}
