package empresa.dados;
public class FuncionarioPacote {
	private String nome;
	private double salario;

	public  FuncionarioPacote(String nomeInit, Double salarioInit){
		nome = nomeInit;
		salario = salarioInit;
	}
	public String obterInfo(){
		return "Nome: " + nome + ", Salário: " + salario;
	}
}