package pe.edu.upc.entity;

public class Fruta {
	//atributos de instancia <-privados
	private String color;
	private String sabor;
	
	//atributos de clase <-globales
	public static String LugarOrigen="UPC";
	public static void SoyunMetodoGlobal() {}
	public  void SoyunMetodoObjeto() {}
	
	//constructores
	public Fruta(String color, String sabor) {
		super();//para referenciar que Object es padre de todas las clases
		this.color = color;
		this.sabor = sabor;
	}
	//modificadores de acceso
	public String getColor() {
		return color;
	}
	

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getSabor()+"-"+this.getColor();
	}
	 
	

}
