class ExemploFinal {
	final int CODIGO_FIXO = 10;

	final void meuMetodo() {
	System.out.println("Este é um método final.");
	}
}

public class TestFinalKeyword {
	public static void main(String[] args){
		ExemploFinal testFinal = new ExemploFinal();
	
		testFinal.meuMetodo();
	}
}
