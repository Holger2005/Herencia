package com.krakedev.herencia;

public class Hijo extends Padre{
	
	private int juguetes;

	public Hijo(int virtudes, int defectos, int juguetes, String nombre) {
		super(virtudes, defectos, nombre);
		this.juguetes = juguetes;
		
	}
	
	@Override
	public String toString() {
		return "Nombre: " +super.getNombre()+" Hijo "+"Defecto: " + super.getDefectos() + " Virtudes: "+ super.getVirtudes() + " Juguetes: " + juguetes +" Ahorrado: " + super.getTotalAhorrado();
	}
	
	@Override
	public void ahorrar(double monto) {
		
		double montoAhorro = monto *0.5;
		super.ahorrar(montoAhorro);
	}
	
	
}
