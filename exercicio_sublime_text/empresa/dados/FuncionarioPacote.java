package empresa.dados;
public class FuncionarioPacote {
	private String nome;
	public double salario;

	public  FuncionarioPacote(String nomeInit, Double salarioInit){
		nome = nomeInit;
		salario = salarioInit;
	}
	public String obterInfo(){
		return "Nome: " + nome + ", Salário: " + salario;
	}
	public void aumentarSalario(double aumento) {
		salario += aumento;
		//aumento += 1000;
	}
	public void aumentarSalario(int porcentagem){
		salario += salario * porcentagem / 100.0;
	}
	
}