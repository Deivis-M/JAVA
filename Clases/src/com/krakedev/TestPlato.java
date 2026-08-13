package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		System.out.println("================== Plato 1: Creado ==================");
		Plato platoA= new Plato();
		System.out.println("Nombre: "+platoA.nombre);
		System.out.println("Tipo: "+platoA.tipo);
		System.out.println("Precio: "+platoA.precio);
		System.out.println("Disponible: "+platoA.disponible);
		System.out.println("================== Plato 1: Modificado ==================");
		platoA.nombre = "Ensalada César";
		platoA.tipo = "Entrada";
		platoA.precio = 6.5f;
		platoA.disponible = true;
		System.out.println("Nombre: "+platoA.nombre);
		System.out.println("Tipo: "+platoA.tipo);
		System.out.println("Precio: "+platoA.precio);
		System.out.println("Disponible: "+platoA.disponible);
		System.out.println("================== Plato 2: Creado ==================");
		Plato platoB= new Plato();
		System.out.println("Nombre: "+platoB.nombre);
		System.out.println("Tipo:: "+platoB.tipo);
		System.out.println("Precio: "+platoB.precio);
		System.out.println("Disponible: "+platoB.disponible);
		System.out.println("================== Plato 2: Modificado ==================");
		platoB.nombre = "Pollo a la plancha";
		platoB.tipo = "Plato fuerte";
		platoB.precio = 12.75f ;
		platoB.disponible = true ;
		System.out.println("Nombre: "+platoB.nombre);
		System.out.println("Tipo:: "+platoB.tipo);
		System.out.println("Precio: "+platoB.precio);
		System.out.println("Disponible: "+platoB.disponible);
		System.out.println("================== Plato 3: Creado ==================");
		Plato platoC= new Plato();
		System.out.println("Nombre: "+platoC.nombre);
		System.out.println("Tipo: "+platoC.tipo);
		System.out.println("Precio: "+platoC.precio);
		System.out.println("Disponible: "+platoC.disponible);
		System.out.println("================== Plato 3: Modificado ==================");
		platoC.nombre = "Flan de caramelo";
		platoC.tipo = "Postre";
		platoC.precio = 4.25f ;
		platoC.disponible = false ;
		System.out.println("Nombre: "+platoC.nombre);
		System.out.println("Tipo: "+platoC.tipo);
		System.out.println("Precio: "+platoC.precio);
		System.out.println("Disponible: "+platoC.disponible);
	}

}
