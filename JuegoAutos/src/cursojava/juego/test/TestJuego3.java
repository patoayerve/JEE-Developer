package cursojava.juego.test;

import cursojava.juego.autos.Auto;

public class TestJuego3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto(12, "Rojo");
		auto1.setTipo(1);
		auto1.setPosicion(10);
		auto1.llenarTanque();
		auto1.imprimir();
		System.out.println("==============================");
		auto1.retroceder(4);
		auto1.imprimirInfo();
		auto1.retroceder(4);
		System.out.println("==============================");
		auto1.imprimirInfo();
		auto1.retroceder(4);
		System.out.println("==============================");
		auto1.imprimirInfo();

	}

}
