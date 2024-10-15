package CursoNelio;

import java.util.Scanner;

public class Condição {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int A = sc.nextInt();
		System.out.println("Digite um numero");
		int B = sc.nextInt();
		int multi = A  * B;
		if(A % B == 0|| B%A == 0) { //so pode ser zero pq so nao vai sobrar nada quando for multiplo. 
			System.out.println("são multiplos");
		}else {//pensei na logica certa so pequei na hora de não pensar que o restante da div deve ser igual a zero para ser multiplo.
			System.out.println("Não multiplos!");
		}
	}
}