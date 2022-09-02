package lista1;

import java.util.Scanner;

public class Aleatorio_Impares{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int quantidade;
		float resultado = 0f;
				
		System.out.println("Insira a quantidade de numeros inteiros: ");
		quantidade = sc.nextInt();
		
		int[] notas = new int[quantidade];
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = (int)(Math.random()*100);
		System.out.println("Numero inteiro  -> "  + notas[i]);
			
			} 
		
		for(int indice= 0; indice < notas.length ; indice++){
			if(notas[indice] % 2 == 0) {
				System.out.printf("Indice %d -> False: %d \n",indice +1, notas[indice]);
				
			} else {
				System.out.printf("Indice %d -> True: %d \n",indice+1 , notas[indice]);
			}
			 
			
			}
			
		}
		
				
	}
	
	
	
