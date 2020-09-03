package listas_encadenadas;

public class Programa {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		System.out.println("Lista inicial: ");
		lista.insertar(4);
		lista.insertar(3);
		lista.insertar(2);
		lista.insertar(1);
		
		lista.listar();
		System.out.println("-------------");
		
		lista.insertarPorPosicion(0, 5);
		lista.listar();
		System.out.println("-------------");
		
		lista.insertarPorPosicion(2, 6);
		lista.listar();
		System.out.println("-------------");
		
		lista.insertarPorPosicion(6, 10);
		lista.listar();
		System.out.println("No se puede insertar en esta posicion");
		System.out.println("-------------");
		
		}

}
