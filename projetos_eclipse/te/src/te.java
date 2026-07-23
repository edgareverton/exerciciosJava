import java.util.Scanner;

public class te {
	public static void main(String[] args) {
		
		//armazena os dados digitados nas variáveis
		Scanner sc = new Scanner(System.in);
		
		String s1;
		String s2;
		String s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou.");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

	}

}
