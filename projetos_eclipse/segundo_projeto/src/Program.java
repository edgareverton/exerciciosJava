import java.util.Locale;


public class Program {	
	
	public static void main(String[] args) {
		/*double v = 12.34343534;
		System.out.printf("%.2f%n", v);
		System.out.printf("%.4f%n", v);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", v);
		System.out.println("O resultado é:" + v);
		System.out.printf("O resultado em metros é %.2f ", v );
		*/
		
		String nome ="Edgar";
		int idade = 29;
		double renda = 10.000;
		System.out.printf("O nome é %s e a idade é %d e a renda é %.3f", nome, idade, renda);
	}
}