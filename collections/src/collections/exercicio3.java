package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 int numbers;
		Set<Integer> setnumeros= new HashSet<Integer>();
		
		
		
		for(int contador = 0; contador <10; contador ++) {
			System.out.println("Digite um número inteiro sem repetir o número:");
			numbers = leia.nextInt();
			setnumeros.add(numbers);
			}
		
		Iterator <Integer> inumeros = setnumeros.iterator();
		  while(inumeros.hasNext()) {
			  System.out.println(inumeros.next());

	}

}}
  