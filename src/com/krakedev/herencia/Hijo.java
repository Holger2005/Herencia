package com.krakedev.herencia;

public class Hijo extends Padre{
	
	private int juguetes;

	public Hijo(int virtudes, int defectos, int juguetes) {
		super(virtudes, defectos);
		this.juguetes = juguetes;
		
	}
	
	@Override
	public String toString() {
		return "Hijo "+"Defecto: " + super.getDefectos() + " Virtudes: "+ super.getVirtudes() + " Juguetes: " + juguetes +" Ahorrado: " + super.getTotalAhorrado();
	}
	
	@Override
	public void ahorrar(double monto) {
		
		double montoAhorro = monto *0.5;
		super.ahorrar(montoAhorro);
	}
	
	
}
