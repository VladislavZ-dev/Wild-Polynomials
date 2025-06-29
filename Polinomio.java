/**
 * Interface com as operacoes basicas de um polinomio 
 * @author Vladislav Zavgorodnii fc59783
 *
 */
public interface Polinomio extends Iterable<Termo> {
	
	/**
	 * adiciona um termo dado para o polinomio
	 * @param termo termo a adicionar
	 * @requires termo != null
	 */
	public void adicionar(Termo termo);
		
	/**
	 * calcula o valor do polinomio no ponto dado
	 * @param ponto a avaliar
	 * @return valor do polinomio no ponto dado
	 */
	public double avaliar(double ponto);
	
}
