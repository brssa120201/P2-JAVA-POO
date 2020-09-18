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
		
		lista.insertarPorPosicion(8, 10);
		lista.listar();
		System.out.println("-------------");
		
		
		System.out.println("Buscar un elemento: ");
		lista.buscar(1);
		lista.buscar(3);
		lista.buscar(2);
		System.out.println("-------------");
		
		System.out.println("Eliminar un nodo: ");
		lista.eliminar(2);
		lista.eliminar(5);
		lista.listar();
		System.out.println("-------------");
		
		System.out.println("Números pares:");
		lista.numerosPares();
		
		
		}

}
