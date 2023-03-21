package Examen;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n, cont,  suma=0;
		boolean primo=true;
		System.out.println ("Introduce un nº");
		n=input.nextInt();
		if (n<=0)
			System.out.println ("No hay primos");
		else {
			int num=2;
			cont=1;
			System.out.println ("los "+n+" primeros primos son: ");
			while (cont<=n) {
				for (int i=2;  i<=num/2 && primo; i++ ) {
					if (num%i==0)
						primo=false; 
				}	
				if (primo) {
					System.out.println ("El "+num);
					cont++;
					suma+=num;
				}	
				num++;
				primo=true;
			}
			System.out.println ("La suma de  los primos es "+suma);
			System.out.println ("Commit 23");}		
	
}
}
