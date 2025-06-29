/**
 * Classe que simula um termo de um polinomio
 * @author Vladislav Zavgorodnii 
 *
 */
public class Termo implements Comparable<Termo> {
	
	private double base;
	private int expoente;
	
	public Termo (double base, int expoente) {
		this.base = base;
		this.expoente = expoente;
	}
	
	/**
	 * retorna o valor da base
	 */
	public double getBase() {
		return this.base;
	}
	
	/**
	 * retorna o valor do expoente
	 */
	public int getExpoente() {
		return this.expoente;
	}
	
	/**
	 * soma as bases dos dois termos
	 * @param o
	 * @requires this.expoente == o.expoente
	 */
	public void somaTermos(Termo o) {
		this.base += o.getBase();
	}
	
	/**
	 * Representacao textual de um termo
	 */
	public String toString() {
		if (base == 0) {
			return "";
		}
		if (expoente == 0) {
			return Double.toString(base);
		}
		if (base == 1 && expoente == 1) {
			return "x";
		}
		if (base == 1) {
			return "x" + expoente;
		}
		if (expoente == 1) {
			return base + "x";
		}
		return base + "x" + expoente;
	}

	@Override
	public int compareTo(Termo o) {
		if (this.expoente > o.expoente) {
			return 1;
		}
		if (this.expoente < o.expoente) {
			return -1;
		}
		return 0;
	}

}
