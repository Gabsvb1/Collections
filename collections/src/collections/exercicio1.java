package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 String cor;
		
		 
		 ArrayList<String>cores=new ArrayList<>();
		
		  
		  for(int contador = 0; contador <5; contador ++) {
				System.out.println("Digite uma cor:");
				cor = leia.nextLine();
				cores.add(cor);
				}
		  System.out.println("as cores escolhidas foram:");
		  
		  Iterator <String> iicores = cores.iterator();
		  while(iicores.hasNext()) {
			  System.out.println(iicores.next());
	
		  }
		  		
        cores.sort(null);
		  System.out.println("as cores ordenadas:");
		  
		  Iterator <String> icores = cores.iterator();
		  while(icores.hasNext()) {
			  System.out.println(icores.next());
	
		  }
	
	
		  
	}

}
