package listas_encadenadas;

public class Lista {
	Nodo head = null;
	int tamaño = 0;
	
	//Lista vacia
	public boolean vacia() {
		return head == null;
	}
	
	//Insertar nuevo nodo
	public void insertar(int value) {
		Nodo nuevo = new Nodo();
		nuevo.setValor(value);
		if(vacia()) {
			head = nuevo;
		}
		else {
			nuevo.setNext(head);
			head = nuevo;
		}
		tamaño++;
	}
	
	//Insertar nodo por posicion
	public void insertarPorPosicion(int p, int value) {
		if(p >= 0 && p < tamaño) {
			Nodo nuevo = new Nodo();
			nuevo.setValor(value);
			if(p == 0) {
				nuevo.setNext(head);
				head = nuevo;
			}
			else {
				if(p == tamaño) {
					Nodo tmp = head;
					while(tmp.getNext() == null) {
						tmp = null;
					}
				}
				else {
					Nodo tmp = head;
					for(int i = 0; i < (p-1); i++) {
						tmp = tmp.getNext();
					}
					Nodo next = tmp.getNext();
					tmp.setNext(nuevo);
					nuevo.setNext(next);
				}
			}
						
			tamaño++;
		}
	}
	
	//Buscar un nodo
	public boolean buscar(int value) {
		Nodo tmp = head;
		boolean encontrar = false;
		while(tmp != null && encontrar != true) {
			if(value == tmp.getValor()) {
				encontrar = true;
				System.out.println("El elemento: " +tmp.dato+ " fue encontrado");
			}
			else {
				tmp = tmp.getNext();
			}
		}
		return encontrar;
		
	}
	
	//Eliminar un nodo 
	public void eliminar(int p) {
		if(p >= 0 && p < tamaño) {
			if(p == 0) {
				head = head.getNext();
			}else {
				Nodo tmp = head;
				for(int i = 0; i < (p-1); i++) {
					tmp = tmp.getNext();
				}
				Nodo next = tmp.getNext();
				tmp.setNext(next.getNext());
			}
			tamaño--;
		}
	}
	
	//Cantidad números pares en la lista
	public int numerosPares() {
		Nodo tmp = head;
		int contador = 0;
		while(tmp != null) {
			if((tmp.dato % 2) == 0) {
				contador = tmp.dato;
				System.out.println("Los números pares que hay en la lista son: " +contador);	
			}
			tmp = tmp.next;
		}
		return contador++;
		
	}
	
	//Imprime la lista
	public void listar() {
		if(!vacia()) {
			Nodo tmp = head;
			int i = 0;
			while(tmp != null) {
				System.out.println(i + ".[ " + tmp.getValor() + " ],");
				tmp = tmp.getNext();
				i++;
			}
		}
	}
}
