public class Switch {
	public static void main(String[] args){
		int day = 10;
		switch(day){
			case 1 -> System.out.println("Segunda");
			case 2 -> System.out.println("Terça");
			case 3 -> System.out.println("Quarta");
			case 4 -> System.out.println("Quinta");
			case 5 -> System.out.println("Sexta");

			default -> System.out.println("Desconhecido");
		}
	}
}