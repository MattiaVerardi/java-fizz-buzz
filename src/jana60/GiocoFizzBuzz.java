package jana60;

import java.util.Scanner;

public class GiocoFizzBuzz {

	public static void main(String[] args) {

		/*
		 * Scrivi un programma che stampi i numeri da 1 a 100, ma per i multipli di 3
		 * stampi Fizz al posto del numero e per i multipli di 5 stampi Buzz. Per i
		 * numeri che sono sia multipli di 3 che di 5 stampi FizzBuzz.
		 */

//		for (int i = 1; i <= 100; i++) {
//			if ((i % 3 == 0) && (i % 5 == 0)) {
//				System.out.println("FizzBuzz");
//			} else if ((i % 3) == 0) {
//				System.out.println("Fizz");
//			} else if ((i % 5) == 0) {
//				System.out.println("Buzz");
//			} else {
//				System.out.println(i);
//			}
//		}

		/*
		 * BONUS: Invece che definire a priori di stampare i numeri da 1 a 100,
		 * chiediamo all’utente di dirci fino a quale numero dobbiamo giocare, purché
		 * quel numero sia maggiore di 1 e minore di 200. Devo continuare a chiedere
		 * all’utente il numero fino a che non ne inserisce uno valido, senza
		 * interrompere l’esecuzione del programma.
		 */

		int numero = 0;
		boolean continua = true;

		Scanner scan = new Scanner(System.in);

		while (continua) {
			System.out.print("Dimmi un numero da compreso tra 1 e 200: ");
			numero = scan.nextInt();
			
			if (numero >= 1 && numero <= 200) {
				continua = false;
			}
		}
		
		
		
		for (int i = 1; i <= numero; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else {
				if ((i % 3) == 0) {
					System.out.println("Fizz");
				} else if ((i % 5) == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		}

		scan.close();
	}

}
