package Aulajava6;

import java.util.Scanner;

public class exervetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//              (0,1,2,3,4,5,6,7,8,9)
int [] numero = {2,5,1,3,4,9,7,8,10,6};
int encontrar;
int x;

Scanner leia = new Scanner(System.in);

System.out.println("\nDigite o número que você deseja encontrar: ");
encontrar=leia.nextInt();

 for (x=0;x<numero.length;x++){
	 if (numero[x]==encontrar) {
		 System.out.println("\nO numero "+encontrar+ " está localizado na posição : "+numero[x]);		 
	 }
	 else  {
		 System.out.println("\n Numero não encontrado : ");
		 
	 }
 }

 

		 

		
		
		
		
		
	}

}
