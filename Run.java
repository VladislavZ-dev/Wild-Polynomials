import java.util.Scanner;

/**
 * 
 * @author Vladislav Zavgorodnii fc59783
 *
 */
public class Run {

	public static void main(String[] args) {
		
		String input = "2 -8x2 3x0 2x1 -8x6 -1x0 34x2 -1x0 8x6 4x0 -27x5";
		Scanner sc = new Scanner(input).useDelimiter("x|\\s");
		
		sc.nextDouble();
		int counter = 0;
		while (sc.hasNextDouble()) {
        sc.nextDouble();
        sc.nextDouble();
			counter++;
		}
		sc.close();
		
		sc = new Scanner(input).useDelimiter("x|\\s");
		double point = sc.nextDouble();
		
		PolinomioImplementation pl = new PolinomioImplementation(counter);
		while(sc.hasNext()) {
			double base = sc.nextDouble();
			int expoente = sc.nextInt();
			Termo adicionar = new Termo(base,expoente);
			pl.adicionar(adicionar);
		}
		sc.close();
		
		System.out.println(pl.toString());
		System.out.println("P(" + point + ") = " + pl.avaliar(point));
		

	}
	
}
