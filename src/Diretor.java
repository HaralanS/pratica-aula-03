public class Diretor {
    public String nome;
    private int idade;
    private int tempoDeCasa;
    private int tempoDoCargo;
    private double salario;

    public Diretor (){
        this.nome = nome;
        this.idade = idade;
        this.tempoDeCasa = tempoDeCasa;
        this.tempoDoCargo = tempoDoCargo;
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getTempoDoCargo() {
        return tempoDoCargo;
    }

    public void setTempoDoCargo(int tempoDoCargo) {
        this.tempoDoCargo = tempoDoCargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
