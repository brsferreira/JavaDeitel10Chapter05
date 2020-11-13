package deitel.capitulo5;

/*5.14  (Programa de juros compostos modificado) Modifique o aplicativo de juros compostos da Figura 5.6 para repetir os passos para taxas 
de juros de 5%, 6%, 7%, 8%, 9% e 10%. Utilize um loop for para variar a taxa de juros.*/

public class Exercicio5_14 {

	public static void main(String[] args) {
		
		double amount = 0;
		double principal = 1000.0;
		int ano;
		
		System.out.printf("%s%6s%20s %n", "Ano", "Taxa", "Amount on deposit");
		
		for(double rate = 0.05; rate <= 0.1; rate += 0.01) {// itera sobre a taxa de juros
			
			for(ano = 1; ano <= 10; ++ano) {// iteracao anual ate 10 anos de juros.
				amount = principal * Math.pow(1.0 + rate, ano);
			}
			
			System.out.printf("%dº  %.2f%,15.2f%n", ano-1 ,rate, amount);
		}
		
	}//main
}//class
