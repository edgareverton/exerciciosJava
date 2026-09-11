import empresa.dados.FuncionarioPacote;
public class FolhaDePagamento {
	public static void main(String[] args) {

		FuncionarioPacote funcionarioPacote = new FuncionarioPacote("Edgar", 7000.00);
		System.out.println(funcionarioPacote.obterInfo());

		funcionarioPacote.aumentarSalario(1000.00);
		System.out.println(funcionarioPacote.obterInfo());
	}
}