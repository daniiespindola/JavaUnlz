
public class Main3 {

	public static void main(String[] args) {

		
		Perro[] perritos= new Perro[3];
		
		perritos[0] = new Perro();
		
		perritos[0].nombre = "Jose";
		
		Perro nuevoPerro = new Perro();
		
		nuevoPerro.nombre = "Leo";
		
		perritos [1] =nuevoPerro;
		
		Perro nuevoNuevoPerro = new Perro();
		
		nuevoNuevoPerro.nombre = "Dudi";
		
		perritos[2] = nuevoNuevoPerro;
		
		
		//Mostrar:.
		
		for (int i = 0; i < perritos.length; i++) {
			Perro perroDeTurno = perritos[i];
			System.out.println(perroDeTurno.nombre);
		}
		

	}

}
