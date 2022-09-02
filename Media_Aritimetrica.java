package lista1;

import java.util.Scanner;

public class Media_Aritimetrica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int quantidade;
		float resultado = 0f;
		float total = 0f;	
		
		System.out.println("Insira o numero de notas: ");
		quantidade = sc.nextInt();
		
		float[] notas = new float[quantidade];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Insira a nota numero ");
			notas[i] = sc.nextFloat();
			
						total = (float) (total + notas[i]);
			
			resultado = total / quantidade;
						
			}
		System.out.printf("A media Aritrimetrica da turma de IPI e: %.2f",resultado);
			
		
	}
	
	
	
}
