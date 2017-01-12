public class Programa6{

	//Atributos de la clase (normalmente privados o protected)
	private int atributo1;
	private String atributo2;

	//Métodos de la clase (normalmente son públicos)

	//Constructora sin parámetros (por defecto)
	public Programa6(  ){
		this.atributo1=0;
		this.atributo2="No inicializado.";
	}

	//Constructura con parámetros.
	public Programa6( int atributo1, String atributo2 ){
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}

	//Getters (obtención de los valores de los atributos)
	public int getAtributo1(){
		return atributo1;
	}

	public String getAtributo2(){
		return atributo2;
	}

	//Setters (establecer el valor de los atributos)
	public void setAtributo1( int atributo1 ){
		this.atributo1 = atributo1;
	}

	public void setAtributo2( String atributo2 ){
		this.atributo2 = atributo2;
	}

	//Método main. Si queremos que la clase
	//sea en sí misma un programa y se pueda
	//ejecutar, necesitamos un método main.

	public static void main(String[] args) {
	
		Programa6 prog = new Programa6( 4, "Hola Mundo." );
		System.out.println(
			"Clase Programa6, objeto prog:\n"+
			prog.getAtributo1()+
			" - "+
			prog.getAtributo2());

	}
}