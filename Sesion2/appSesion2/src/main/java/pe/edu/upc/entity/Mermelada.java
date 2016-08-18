package pe.edu.upc.entity;

public class Mermelada extends Fruta {
	protected int tiempoPreparacion;
	protected String tipoenvase;
	public Mermelada(String color, String sabor, int tiempoPreparacion, String tipoenvase) {
		super(color, sabor);
		// TODO Auto-generated constructor stub
		this.tiempoPreparacion=tiempoPreparacion;
		this.tipoenvase=tipoenvase;
	
	}
	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}
	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}
	public String getTipoenvase() {
		return tipoenvase;
	}
	public void setTipoenvase(String tipoenvase) {
		this.tipoenvase = tipoenvase;
	}
	@Override
	public String toString() {
		return "Mermelada [tiempoPreparacion=" + tiempoPreparacion + ", tipoenvase=" + tipoenvase + "]";
	}
	

	
	


}
