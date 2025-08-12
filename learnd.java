package learnd;

import java.util.Scanner;


public class Aprendendo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double coinValue = 0.0045;
		System.out.print("quantidade de moedas do game =");
		
		
		int dinheiro= scanner.nextInt();
		
		double valorConvertido = coinValue * dinheiro;
		
		System.out.print( valorConvertido );
		
		scanner.close();
	}
	 
}
