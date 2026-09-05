package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hija hija = new Hija(5, 6);
		hija.setVirtudes(5);
		hija.setDefectos(2);
		
		hija.imprimir(); 

	}

}
