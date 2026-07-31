public class Teste{
	public static void main(String[] args){
		int nivel = 6;
		switch(nivel) {
		case 1 -> System.out.println("Muito insatisfeito");
		case 2 -> System.out.println("Insatisfeiro");
		case 3 -> System.out.println("Mais ou Menos");
		case 4 -> System.out.println("Satisfeito");
		case 5 -> System.out.println("Muito Satisfeito");


		default -> System.out.println("Desconhecido");
		}
		
		
	}
}