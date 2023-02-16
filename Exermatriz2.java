package Aulajava6;

import java.util.Scanner;

public class Exermatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [][]tabela = new int [3][3];
int coluna;
int linha;
int somaPrimaria = 0;
int somaSecundaria;

Scanner leia= new Scanner (System.in);
// LEITURA DOS MEUS DADOS
for (linha=0;linha<3;linha ++) {
	for(coluna=0;coluna<3;coluna++) {
		System.out.println("\nDigite os valores : ");
		tabela [linha][coluna]=leia.nextInt();
		
	}
}
// MOSTRANDO OS DADOS DIGITADOS 
for (linha=0;linha<3;linha ++) {
	for(coluna=0;coluna<3;coluna++) {
		System.out.print(tabela[linha][coluna]);
}
	System.out.print("\n");
	
}	
// FAZER A SOMA DA DIAGONAL PRINCIPAL
for (linha=0;linha<3;linha ++) {
	for(coluna=0;coluna<3;coluna++) {
		if (linha == coluna) {
			somaPrimaria += tabela[linha][coluna];
		}
     }
	
}
System.out.println("\nA soma diagonal é: "+somaPrimaria);
		
	}

}
