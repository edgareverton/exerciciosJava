class ExemploFinal {
	final int CODIGO_FIXO = 10;

	final void meuMetodo() {
	System.out.println("Este é um método final.");
	}
}

public class TestFinalKeyword {
	public static void main(String[] args){
		ExemploFinal testFinal = new ExemploFinal();
		testFinal.CODIGO_FIXO = 433;
		System.out.println("Valor da constante: " + testFinal.CODIGO_FIXO);
		testFinal.meuMetodo();
	}
}
