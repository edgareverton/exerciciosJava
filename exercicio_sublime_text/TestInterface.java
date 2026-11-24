interface Animal{
	void fazerSom();
}
class Cachorro implements Animal {
	public void fazerSom() {
		System.out.println("O Cachorro faz Au Au!");
	}
}
class Gato implements Animal {
	public void fazerSom() {
		System.out.println("O gato faz Miau Miau!");
	}
}

public class TestInterface {
	public static void main(String[] args){
	
	Cachorro cachorro = new Cachorro();
	cachorro.fazerSom();

	Gato gato = new Gato();
	gato.fazerSom();
	}
}