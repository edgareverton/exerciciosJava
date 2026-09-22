class Animal {
	String nome;

	Animal(String nome){
		this.nome = nome;
	}
}

class Cachorro extends Animal{
	String raca;

	Cachorro(String nome, String raca){
		super(nome); // Chama o construtor da super classe Animal
		this.raca = raca;
	}
}
public class TesteSuperOne {
		public static void main(String[] args){
			Cachorro dog = new Cachorro("Lua", " Sharpei");
			System.out.println("O nome do animal é: " + dog.nome);
			System.out.println("A raça do animal é: " + dog.raca);

	}
}