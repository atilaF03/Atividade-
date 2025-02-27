public class Funcionario {
   private String Nome ,cargo;
    private double salario;
    public Funcionario(String nome, String cargo, double salario) {
        Nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    
}
