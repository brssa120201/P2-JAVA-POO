package pilas_prj_corte_2;

public class PilaProducto {

	NodoProducto top;
	
	public void push(Producto p) {
		NodoProducto nuevo = new NodoProducto(p);
		if(top == null) {
			top = nuevo;
		}else {
			if(p != null) {
				nuevo.setNext(top);
				top = nuevo;
			}
		}
	}
	
	public int pop(Producto pr) {
		NodoProducto tmp = top;
		for(int i=1; tmp != null; i++) {
			if(tmp.getDato() == pr) {
				return i;
			}
			tmp = tmp.getNext();			
		}
		return -1;
	}
	
	public boolean buscar(Producto pr) {
		NodoProducto tmp = top;
		while(tmp != null) {
			if(tmp.getDato() == pr) {
				return true;
			}
			tmp = tmp.getNext();
		}
		return false;
	}
	
	public boolean buscarIdentificacion(Producto pr) {
		NodoProducto tmp = top;
		while(tmp != null) {
			if(tmp.getDato().getIdentificacion() == pr.getIdentificacion()) {
				return true;
			}
			tmp = tmp.getNext();
		}
		return false;
	}
	
	public boolean buscarNombre(Producto pr) {
		NodoProducto tmp = top;
		while(tmp != null) {
			if(tmp.getDato().getNombre() == pr.getNombre()) {
				return true;
			}
			tmp = tmp.getNext();
		}
		return false;
	}
	
	public boolean vacia() {
		return top == null;
	}
	
	public String union(PilaProducto producto1, PilaProducto producto2) {
		NodoProducto tmp1 = producto1.top;
		NodoProducto tmp2 = producto2.top;
		PilaProducto pilaUnion = new PilaProducto();
		
		while(tmp1 != null) {
			if(pilaUnion.buscar(tmp1.getDato())) {
				
			}else {
				pilaUnion.push(tmp1.getDato());
			}
			tmp1 = tmp1.getNext();
		}
		while(tmp2 != null) {
			if(pilaUnion.buscar(tmp2.getDato())) {
			
			}else {
				pilaUnion.push(tmp2.getDato());
			}
			tmp2 = tmp2.getNext();
		}
		return pilaUnion.imprimirUnion();
	}
	
	public String interseccion(PilaProducto producto1, PilaProducto producto2) {
		NodoProducto tmp1 = producto1.top;
		NodoProducto tmp2 = producto2.top;
		PilaProducto pilaInterseccion = new PilaProducto();
		
		while(tmp1 != null) {
			while(tmp2 != null) {
				if(tmp1.getDato().getIdentificacion() == tmp2.getDato().getIdentificacion()) {
					if(pilaInterseccion.buscar(tmp1.getDato()) == false) {
						pilaInterseccion.push(tmp1.getDato());
					}
					if(pilaInterseccion.buscar(tmp2.getDato()) == false) {
						pilaInterseccion.push(tmp2.getDato());
					}
				}
				tmp2 = tmp2.getNext();
			}
			tmp2 = producto2.top;
			tmp1 = tmp1.getNext();
		}
		return pilaInterseccion.imprimirInterseccion();
	}
	
	public String diferencia(PilaProducto producto1, PilaProducto producto2) {
		NodoProducto tmp1 = producto1.top;
		NodoProducto tmp2 = producto2.top;
		boolean diferente = false;
		PilaProducto pilaDiferencia = new PilaProducto();
		
		while(tmp1 != null) {
			if(producto2.buscarIdentificacion(tmp1.getDato())) {
				
			}else {
				pilaDiferencia.push(tmp1.getDato());
			}
			tmp1 = tmp1.getNext();
		}
		
		while(tmp2 != null) {
			if(producto1.buscarIdentificacion(tmp2.getDato())) {
				
			}else {
				pilaDiferencia.push(tmp2.getDato());
			}
			tmp2 = tmp2.getNext();
		}
		return pilaDiferencia.imprimirDiferencia();
	}
	
	
	
	public void imprimir() {
		NodoProducto tmp = top;
		while(tmp != null) {
			System.out.println(tmp.getDato().getIdentificacion()+ ", " +tmp.getDato().nombre+ ", " +tmp.getDato().precio+ ", " +tmp.getDato().descuento);
			tmp = tmp.getNext();
		}
	}
	
	public String imprimirUnion() {
		NodoProducto tmp = top;
		String identificaciones = "";
		while(tmp != null) {
			identificaciones = identificaciones + tmp.getDato().getIdentificacion() + "->";
			tmp = tmp.getNext();
		}
		return identificaciones;
	}
	
	public String imprimirInterseccion() {
		NodoProducto tmp = top;
		String productos = "";
		while(tmp != null) {
			productos = productos + tmp.getDato().getIdentificacion() + ", " + tmp.getDato().getNombre() + ", " +tmp.getDato().getprecio()+ ", " +tmp.getDato().getDescuento();
			tmp = tmp.getNext();
		}
		return productos;
	}
	
	public String imprimirDiferencia() {
		NodoProducto tmp = top;
		String producto = "";
		while(tmp != null) {
			producto = producto + tmp.getDato().getIdentificacion()+ ",";
			tmp = tmp.getNext();
		}
		return producto;
	}
	
	
}
