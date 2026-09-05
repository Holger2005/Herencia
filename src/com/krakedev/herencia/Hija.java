package com.krakedev.herencia;

public class Hija extends Padre{
	
	public Hija(int virtudes, int defectos) {
		super(virtudes, defectos);
	}
	
	public void escucharBadBunny() {
		
		System.out.println("Escuchando esta musica cool");
	}

	@Override
	public String toString() {
		return "Hija "+"Defecto: " + super.getDefectos() + " Virtudes: "+ super.getVirtudes()+" Ahorrado: " + super.getTotalAhorrado();
	}

}
