public class TestStatic{
	public void exibirValor(int a) {
		System.out.println("O valor do inteiro é: " + a);
	}

	public static void exibirValor(String str){
		System.out.println("A string é: " + str);
	}

	public static void main(String[] args) {
		TestStatic ts = new TestStatic();
		ts.exibirValor("oi");
	}
}