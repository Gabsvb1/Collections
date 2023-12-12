package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dados;		
		 Scanner leia = new Scanner(System.in);
	
		ArrayList<Integer> numeros=new ArrayList<>();
		
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		 System.out.println("escolha um número inteiro?");
		  dados=leia.nextInt();
		  
				  
		  if (numeros.indexOf(dados)!= -1 )
				System.out.println("\nO elemento foi Encontrado e está na Posição: " + numeros.indexOf(dados));
			else
				System.out.println("\nElemento não encontrado!");
		  
		
	}

}
