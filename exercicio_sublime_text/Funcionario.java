public class Funcionario{
	String nome;
	String cargo;
	int idade;
	public static void main(String[] args){

		Funcionario funcionario = new Funcionario();

		funcionario.nome = "Edgar Everton";
		funcionario.cargo = "Gerente";
		funcionario.idade = 29;

		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Idade: " + funcionario.idade);
	}
}