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
						System.out.println("No se puede insertar un nodo en esta posicion");	
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
