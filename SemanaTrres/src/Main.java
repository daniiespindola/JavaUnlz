import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Progama adivinador");
		System.out.println("Cual es tu nombre?");
		
		String nombre =sc.next();
		
		System.out.println("Cual es tu edad?");
		
		int edad = sc.nextInt();
		
		System.out.println("Y tu estatura en metros?");
		
		double metros = sc.nextDouble();
		
		System.out.println("Tu nombre es: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Estatura: "+metros);

	}

}
