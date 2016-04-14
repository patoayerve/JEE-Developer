package cursojava.juego.test;

import cursojava.juego.autos.Auto;
import cursojava.utils.Dado;

public class TestJuego4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dado dado1 = new Dado();
		Auto auto1 = new Auto(5, "Azul");
		auto1.setTipo(1);
		auto1.llenarTanque();
		int resultadoDado = dado1.lanzar();
		auto1.imprimir();
		auto1.avanzar(resultadoDado);
		System.out.println("==================");
		auto1.imprimirInfo();
	}

}
