package com.exact.crud.create;

public class CreatePrincipal {

	public static void main(String[] args) {
		
		Create create = new Create();
		
		create.setIdUsuario(1);
		create.setNombre("Ronald");
		create.setApellido("Santos");
		create.setEdad(25);
		
		System.out.println("Id:"+create.getIdUsuario()+" Nombre: "+create.getNombre()+" Apellido: "+create.getApellido()+" Edad: "+create.getEdad());

	}

}
