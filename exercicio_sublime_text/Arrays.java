public class Arrays {
	public static void main(String[] args) {
		int[] meuArray;
		meuArray = new int[3];

		meuArray[0] = 3;
		meuArray[1] = 8;
		meuArray[2] = 2;

		meuArray = new int[]{5,8,2};

		// System.out.println(meuArray[0]);

		
		System.out.println(meuArray[0]);
		System.out.println(meuArray[1]);
		System.out.println(meuArray[2]);

		meuArray[0] = 10;

		System.out.println("Valor de 0 alterado para 10" + meuArray[0]);

		for (int i = 0; i < meuArray.length; i++){
			System.out.println(meuArray[i]);
		}


	}
}