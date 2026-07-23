import java.util.Scanner;

public class If_else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		
		if (hora < 12) {
			
			System.out.println("Bom dia! a hora é: " + hora);
		}
		if (hora > 12 && hora < 18) {
					
					System.out.println("Boa tarde! a hora é: " + hora);
				}
		if(hora >= 18) {
			System.out.println("Boa noite! A hora é: " + hora);
		}
				sc.close();
	}
}
