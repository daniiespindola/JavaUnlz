import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {

		
		char[] caracteres = new char[3];

		caracteres[0]='x';
		caracteres[1]='w'; 
		caracteres[2]='k';

		
		for (int i = 0; i < caracteres.length; i++) {
			char caracterDeTurno =caracteres[i];
			System.out.println(caracterDeTurno);
		}
	}

}
