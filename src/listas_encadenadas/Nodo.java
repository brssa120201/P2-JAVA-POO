package listas_encadenadas;

public class Nodo {
	
		int dato = 0;
		Nodo next = null;
		
		// Métodos get y set para los atributos.
		public int getValor() {
	       return dato;
		}

		public void setValor(int value) {
	       this.dato = value;
		}

		public Nodo getNext() {
	       return next;
		}

		public void setNext(Nodo next) {
	       this.next = next;
		}   

}


