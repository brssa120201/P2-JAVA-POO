package pilas_prj_corte_2;

public class NodoProducto {

	public Producto dato;
	public NodoProducto next;
	
	
	public NodoProducto(Producto dato) {
		this.dato = dato;
	}
	
	public Producto getDato() {
		return dato;
	}
	
	public void setDato(Producto dato) {
		this.dato = dato;
	}
	
	public NodoProducto getNext() {
		return next;
	}
	
	public void setNext(NodoProducto next) {
		this.next = next;
	}

}
