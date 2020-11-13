package deitel.capitulo5;

/*5.12  (Calculando o produto de números inteiros ímpares) 
 * Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15.*/


//https://www.youtube.com/watch?v=eULT5UpQ3ao&index=2&list=RDkmqSNXdGHAI
//https://www.youtube.com/watch?v=D1NmvqiqWVk&index=4&list=RDkmqSNXdGHAI

public class Exercicio5_12 {

	public static void main(String[] args) {

		int soma = 0;
		for(int i = 1; i <= 15; i+=2) {
			
			System.out.print(i + " ");
			soma += i;
		}
		
		System.out.println("\nSoma = " + soma);
		
	}//main
}//class
