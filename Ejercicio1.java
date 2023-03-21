package Examen;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int n, anterior, suma=0;
		boolean ordenado=true;
		Scanner input=new Scanner(System.in);
		n=0;
		System.out.println("Introduce un nº, 0 es fin");
		while (n!=0)
		{
			n=input.nextInt();
			anterior=n;
			suma+=n;
			if (anterior>n)
				ordenado=false;
			else 
				ordenado=true;
			anterior=n;
		}
		if (ordenado)
			System.out.println ("la serie esta ordenada");
		else 
			System.out.println ("la serie no esta ordenada");
			System.out.println ("Commit 13");
		
		System.out.println ("la suma es: "+suma);
		
		input.close();
	}

}
