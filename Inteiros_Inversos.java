package lista1;

import java.util.Scanner;

public class Inteiros_Inversos {

	public static void main(String[] args) {
		 
		
		
		int quantidade;
        try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Insira o numero de numeros inteiros: ");
			quantidade = entrada.nextInt();
			
			int[] notas = new int[quantidade];
			
			for(int indice=0 ; indice < notas.length ; indice++){
			    System.out.print("\nEntre com o número " + (indice+1) + ": ");
			    notas[indice] = entrada.nextInt();
			}
			
			
			
		
			for(int indice= notas.length -1; indice >= 0 ; indice--){
				
			 
			System.out.printf("Indice %d -> Valor armazenado: %d\n",indice+1, notas[indice]);
			}
	
	
        }
        }
}
