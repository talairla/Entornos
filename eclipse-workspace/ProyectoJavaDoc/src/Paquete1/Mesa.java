package Paquete1;

public class Mesa {

	private int num_patas;
	protected String material;
	private int anchura; //En mm
	private int altura; //En mm
	private int profundidad; //En mm
	
	/*
	 * Constructor con parámetros
	 * @param patas. Número de patas que tiene la mesa.
	 * @param material. Material de que está fabricada la mesa.
	 * @param anchura. Anchura de la mesa en milímetros.
	 * @param altura. Altura de la mesa en milímetros.
	 * @param profundidad. Profundidad de la mesa en milímetros.
	 */
	
	public Mesa(int num_patas, String material, int anchura, int altura,
			int profundidad) {
		super();
		this.num_patas = num_patas;
		this.material = material;
		this.anchura = anchura;
		this.altura = altura;
		this.profundidad = profundidad;
	}


	/**
	 * @return el número de patas que tiene la mesa
	 */
	public int getNum_patas() {
		return this.num_patas;
	}


	/**
	 * Actualiza el número de patas de la mesa
	 * @param num_patas. Establece el número de patas de la mesa.
	 */
	public void setNum_patas(int num_patas) {
		this.num_patas = num_patas;
	}


	/**
	 * @return El material de que está hecha la mesa.
	 */
	public String getMaterial() {
		return this.material;
	}


	/**
	 * @param material. Establece el material de que está hecha la mesa
	 */
	public void setMaterial(String material) {
		this.material = material;
	}


	/**
	 * @return the anchura
	 */
	public int getAnchura() {
		return this.anchura;
	}


	/**
	 * @param anchura the anchura to set in milimiters
	 */
	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}


	/**
	 * @return the altura
	 */
	public int getAltura() {
		return this.altura;
	}


	/**
	 * @param altura the altura to set in milimiters
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}


	/**
	 * @return the profundidad
	 */
	public int getProfundidad() {
		return this.profundidad;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Mesa [\n num_patas=" +
				num_patas +
				"\n material=" +
				material +
				"\n anchura=" + 
				anchura + 
				"\n altura=" + 
				altura
				+ ", profundidad=" + 
				profundidad + 
				"\n]";
	}

	public String toXML() {
		return "<mesa>" +
				"\n\t<num_patas>"+num_patas+"</num_patas>"+
				"\n\t<material>"+material+"</material>"+
				"\n\t<anchura>"+anchura+"</anchura>"+
				"\n\t<altura>"+altura+"</altura>"+
				"\n\t<profundidad>"+profundidad+"</profundidad>"+
				"\n</mesa>";
	}


	/**
	 * @param profundidad the profundidad to set
	 */
	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}
	

}
