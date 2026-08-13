package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		System.out.println("==========Restaurante 1 : Creado ==========");
		Restaurante rest1 = new Restaurante();
		System.out.println("Nombre: "+rest1.nombre);
		System.out.println("Direccion: "+rest1.direccion);
		System.out.println("Calificacion: "+rest1.calificacion);
		
		System.out.println("==========Restaurante 1 : Modificado ==========");
		rest1.nombre = "La esquina";
		rest1.direccion = "Av. Amazonas 245";
		rest1.calificacion = 4.7f;
		System.out.println("Nombre: "+rest1.nombre);
		System.out.println("Direccion: "+rest1.direccion);
		System.out.println("Calificacion: "+rest1.calificacion);
		
		System.out.println("==========Restaurante 2 : Creado ==========");
		Restaurante rest2 = new Restaurante();
		System.out.println("Nombre: "+rest2.nombre);
		System.out.println("Direccion: "+rest2.direccion);
		System.out.println("Calificacion: "+rest2.calificacion);
		
		System.out.println("==========Restaurante 2 : Modificado ==========");
		rest2.nombre = "Sabor Andino";
		rest2.direccion = "Calle Sucre 118";
		rest2.calificacion = 4.2f;
		System.out.println("Nombre: "+rest2.nombre);
		System.out.println("Direccion: "+rest2.direccion);
		System.out.println("Calificacion: "+rest2.calificacion);
		
	}

}
