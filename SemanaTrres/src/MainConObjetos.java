import java.util.Scanner;

public class MainConObjetos {

	public static void main(String[] args) {


		Persona p = new Persona();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Progama adivinador");
		System.out.println("Cual es tu nombre?");
		
		p.nombre =sc.next();
		
		System.out.println("Cual es tu edad?");
		
		p.edad = sc.nextInt();
		
		System.out.println("Y tu estatura en metros?");
		
		p.estatura = sc.nextDouble();
		
		System.out.println("Tu nombre es: "+p.nombre);
		System.out.println("Edad: "+p.edad);
		System.out.println("Estatura: "+p.estatura);

	}

}
