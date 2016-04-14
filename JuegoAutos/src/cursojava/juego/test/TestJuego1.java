package cursojava.juego.test;

import cursojava.juego.autos.Auto;

public class TestJuego1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto(12, "Rojo");
		auto1.setTipo(2);		
		auto1.imprimir();
		System.out.println("==============================");
		auto1.imprimirInfo();
		
		Auto auto2 = new Auto(15, "Verde");
		auto2.setTipo(1);
		auto2.imprimir();
		System.out.println("==============================");
		auto2.imprimirInfo();

	}

}
