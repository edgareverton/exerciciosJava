import empresa.dados.FuncionarioPacote;
public class FolhaDePagamento {
	public static void main(String[] args) {

		FuncionarioPacote funcionarioPacote = new FuncionarioPacote("Edgar", 7.500);
		System.out.println(funcionarioPacote.obterInfo());
	}
}