package lista1;

import java.util.Scanner;

public class Aleatorios_Inversos{

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
		
		for(int indice= notas.length -1; indice >= 0 ; indice--){
			
			 
			System.out.printf("Indice %d -> Valor armazenado: %d \n",indice +1, notas[indice]);
			}
			
		}
		
				
	}
	
	
	
