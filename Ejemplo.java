package Examen;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, suma, resta, prod, divEntera, resto, potEntera ;
		double  divReal,potencia ;
		System.out.println("introduce a y b");
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		suma=suma(a,b);
		resta=resta(a,b);
		prod=mult(a,b);
		divEntera=div(a,b);
		resto=resto(a,b);
		double f=factorial(a);
		divReal=divR(a,b);
		potencia=Math.pow(a, b);
		potEntera=(int)Math.pow(a, b);
		
		System.out.println("suma o no="+suma);
		System.out.println("restame o no="+resta);
		System.out.println("producto="+prod);
		System.out.println("cocientedivision entera="+divEntera+" y resto="+resto);
		System.out.println("cociente division real="+divReal);
		System.out.println("Potencia de a elevado a b="+potEntera);
		System.out.println("Potencia de a elevado a b="+potencia);
		System.out.println("Factorial de esta "+f);
		System.out.println("Prueba Final");
		/* wtf232323*/
	
	}
	static double factorial (int num) {
		double fact=1;
		for (int i=1;i<=num;i++)
			fact*=i;
		return fact;
	}
	static int suma (int a,int b) {
		int sum=0;
		sum=a+b;
		return sum;
	}
	static int resta (int a,int b) {
		int rest=0;
		rest=a-b;
		return rest;
	}
	static int mult (int a,int b) {
		int mult=0;
		mult=a*b;
		return mult;
	}
	static int div (int a,int b) {
		int div=0;
		div=a/b;
		return div;
	}
	static int resto (int a,int b) {
		int resto=0;
		resto=a%b;
		return resto;
	}
	static double divR (int a,int b) {
		double divR=0;
		divR=a/b;
		return divR;
	}
}
