package pilas_prj_corte_2;

import pilas_prj_corte_2.PilaProducto;

public class Programa {
	
	public static PilaProducto producto1 = new PilaProducto();
	public static PilaProducto producto2 = new PilaProducto();
	public static PilaProducto operaciones = new PilaProducto();
	
	public static void main(String[] args) {
		
		Producto p1 = new Producto();
		p1.identificacion = 1;
		p1.nombre = "Leche";
		p1.precio = 1000;
		p1.descuento = 20;
		
		Producto p2 = new Producto();
		p2.identificacion = 2;
		p2.nombre = "Arroz";
		p2.precio = 3200;
		p2.descuento = 15;
		
		Producto p3 = new Producto();
		p3.identificacion = 3;
		p3.nombre = "Panela";
		p3.precio = 2350;
		p3.descuento = 40;
		
		Producto p4 = new Producto();
		p4.identificacion = 4;
		p4.nombre = "Pollo";
		p4.descuento = 60;
		p4.precio = 4200;
		
		Producto p5 = new Producto();
		p5.identificacion = 5;
		p5.nombre = "Harina";
		p5.descuento = 35;
		p5.precio = 3500;
		
		Producto p6 = new Producto();
		p6.identificacion = 6;
		p6.nombre = "Jabon";
		p6.descuento = 50;
		p6.precio = 4000;
		
		System.out.println("\n*********** PILAS **************");
	
		producto1.push(p1);
		producto1.push(p2);
		producto1.push(p3);
		System.out.println("\n Productos 1: ");
		producto1.imprimir();
				
		producto2.push(p6);
		producto2.push(p4);
		producto2.push(p5);
		producto2.push(p2);
		System.out.println("\n Productos 2: ");
		
		
		//Union:
		System.out.println("\n Union Pilas");
		System.out.println(operaciones.union(producto1, producto2));
		
		//Interseccion: 
		System.out.println("\n Intersección Pilas");
		System.out.println(operaciones.interseccion(producto1, producto2));
		
		//Diferencia: 
		System.out.println("\n Diferencias Pilas");
		System.out.println(operaciones.diferencia(producto1, producto2));

	}

}
