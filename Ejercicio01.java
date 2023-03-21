package Examen;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int n, anterior, suma=0;
		boolean ordenado=true;
		Scanner input=new Scanner(System.in);
		System.out.println("Introduce un nº, 0 es fin");
		n=input.nextInt();
		anterior=n;
		while (n!=0)
		{
			suma+=n;
			if (anterior>n)
				ordenado=false;
			else 
				ordenado=true;
			anterior=n;
		}
		if (ordenado)
			System.out.println ("la serie esta ordenada");
			System.out.println ("Commit 04asdasd");
		else 
			System.out.println ("la serie noasddddddddddddddddddddddddd esta ordenada");
		
System.out.println ("la suma es: "+suma);
		
		input.close();
	}

}

