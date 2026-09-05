package com.krakedev.herencia;

public class Hija extends Padre{
	
	public Hija(int virtudes, int defectos, String nombre) {
		super(virtudes, defectos, nombre);
	}
	
	public void escucharBadBunny() {
		
		System.out.println("Escuchando esta musica cool");
	}

	@Override
	public String toString() {
		return "Nombre: " +super.getNombre()+" Hija "+"Defecto: " + super.getDefectos() + " Virtudes: "+ super.getVirtudes()+" Ahorrado: " + super.getTotalAhorrado();
	}

}
