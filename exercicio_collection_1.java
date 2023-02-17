package Aulajava6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio_collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ler;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores= new ArrayList<String>();
		
		for (int i=0;i<=4;i++) {
			
		System.out.println("\nDigite a Cor: ");	
		ler=leia.nextLine();
		cores.add(ler);
}
		System.out.println("\n"+cores);	
		Collections.sort(cores);	
		System.out.println("\nAqui são as cores por ordem alfabetica : ");
		System.out.println("\n"+cores);
		
		}

	}