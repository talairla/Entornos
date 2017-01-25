/**
 * 
 */
package conversor;

/**
 * @author user
 *
 */
public class Divisa {
	
	String codigo;
	double valor;
	
	/**
	 * @param codigo
	 * @param valor
	 */
	
	public Divisa(String codigo, double valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return this.codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return this.valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Divisa [codigo=" + codigo + ", valor=" + valor + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	*/


	
	
	
}
