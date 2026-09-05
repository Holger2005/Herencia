package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Padre padre = new Padre(5,2,"Pedro");
		padre.ahorrar(100);
		System.out.println(padre);
		
		Hija hija = new Hija(1,2,"Maria");
		hija.ahorrar(100);
		System.out.println(hija);
		
		Hijo hijo = new Hijo(2,2,5,"Adrian");
		hijo.ahorrar(100);
		System.out.println(hijo);

	}

}
