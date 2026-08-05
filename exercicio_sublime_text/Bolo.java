public class Bolo{
	int quantidadeAcucar;

	public static void main(String[] args){

		Bolo boloDeChocolate = new Bolo();
		boloDeChocolate.quantidadeAcucar = 200;

		Bolo boloDeBaunilha = new Bolo();
		boloDeBaunilha.quantidadeAcucar = 150;

		System.out.println("A quantidade de açucar no bolo de chocolate é: "
		 + boloDeChocolate.quantidadeAcucar);

	    System.out.println("A quantidade de açucar no bolo de baunilha é: " 
		  + boloDeBaunilha.quantidadeAcucar);


	}
}