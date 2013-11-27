package mx.itson.rabiosa.nucleo.enumeradores;

public enum Estatus {

	PAGADO(0),
	PENDIENTE(1),
	VENCIDO(2);
	
	private int valor;
	private Estatus( int valor){
		this.valor=valor;	
	}
	public int getValor(){
		return this.valor;
	}
}
