package lista1;

import java.util.Scanner;

public class MediaAritimetrica_Aleatoria{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int quantidade;
		float resultado = 0f;
		float total = 0f;
				
		System.out.println("Insira a quantidade de numeros inteiros: ");
		quantidade = sc.nextInt();
		
		int[] notas = new int[quantidade];
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = (int)(Math.random()*100);

		total = (float) (total + notas[i]);
		
		resultado = total / quantidade;

			} 
		System.out.printf("A media aritrimetrica dos numeros aleatorios -> %.2f \n", resultado);
		 		
			}
			
		
	}


	
