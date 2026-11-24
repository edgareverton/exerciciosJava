interface SerVivo {
	
	void respirar(); // método abstrato
}

interface Animal extends SerVivo{
	public static final String DESCRICAO = "Animal é um ser vivo importante!";
	void fazerSom(); // método abstrato
}

// Classe cachorro que implementa a interface animal {
	class Cachorro implements Animal {
		public void respirar(){}
		public void fazerSom() {
			System.out.println("O cachoro faz: Au Au!");
		}
	}

// Classe Gato que implementa a interface Animal
	class Gato implements Animal {
		public void respirar(){}
		public void fazerSom() {
			System.out.println("O Gato faz: Miau Miau");
		}	
	}


public class TesteInterfaces {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.fazerSom();

		Gato gato = new Gato();
		gato.fazerSom();

		System.out.println("Descrição da interface: " + Animal.DESCRICAO);

	}
}
