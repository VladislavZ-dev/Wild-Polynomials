import java.util.Iterator;

/**
 * Classe com todas as funcionalidades de um polinomio 
 * @author Vladislav Zavgorodnii fc59783
 *
 */
public class PolinomioImplementation implements Polinomio {
	
	private Termo[] polinomio;
	
	public PolinomioImplementation(int size) {
		polinomio = new Termo[size];
	}

	@Override
	public Iterator<Termo> iterator() {
		return iterator();
	}

	/**
	 * Complexidade temporal: O(n)
	 * Justificacao: O metodo itera por todos os elementos do vetor ate encontrar
	 * um termo com o mesmo expoente do @param termo, ou entao ate encontrar a 
	 * primeira posicao vazia. Logo, o pior caso e quando o vetor esta cheio, 
	 * pois ai o metodo vai ter de iterar por todos os elementos, ou seja, vai 
	 * ter de iterar por n elementos. Logo, O(n)
	 */
	@Override
	public void adicionar(Termo termo) {
		if (polinomio == null) {
			polinomio[0] = termo;
		}
		else {
			if (!equalExists(termo)) {
				for (int i = 0; i < polinomio.length; i++) {
					if (polinomio[i] == null) {
						polinomio[i] = termo;
						i = polinomio.length;
					}
				}
			}
		}
	}
	
	private boolean equalExists(Termo termo) {
		for (int i = 0; i < polinomio.length; i++) {
			if (polinomio[i] != null) {
				if (polinomio[i].compareTo(termo) == 0) {
					polinomio[i].somaTermos(termo);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Complexidade temporal: O(n)
	 * Justificacao: o metodo itera sempre por todos os termos do polinomio,
	 * quer no melhor caso, quer no pior. Logo, a sua complexidade temporal 
	 * depende do tamanho do input, logo e O(n)
	 */
	@Override
	public double avaliar(double ponto) {
		double soma = 0;
		for (Termo termo: polinomio) {
			if (termo != null) {
				soma += potencia(ponto, termo.getExpoente()) * termo.getBase();
			}
		}
		return soma;
	}
	
	private double potencia(double ponto, int expoente) {
		int potencia = 1;
		for (int i = 0; i < expoente; i++) {
			potencia *= ponto;
		}
		return potencia;
	}
	
	public String toString() {
		sortArray();
		StringBuilder sb = new StringBuilder("P(x) = ");
		for (Termo termo : polinomio) {
			if (termo != null) {
				if (termo.getBase() != 0) {
					sb.append(termo.toString() + " + ");
				}
			}
		}
		sb.delete(sb.length() - 3, sb.length() - 1);
		return sb.toString();
	}
	
	private void sortArray() {
		for (int i = 0; i < polinomio.length; i++) {
			for (int j = 0; j < polinomio.length - i - 1; j++) {
				if (polinomio[j] != null && polinomio[j + 1] != null) {
					if (polinomio[j].compareTo(polinomio[j+1]) > 0) {
						Termo temp = new Termo(polinomio[j].getBase(),polinomio[j].getExpoente());
						polinomio[j] = polinomio[j + 1];
						polinomio[j + 1] = temp;
					}
				}
			}
		}
	}

}
