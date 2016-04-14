package cursojava.juego.test;

import cursojava.juego.autos.Auto;
import cursojava.utils.Dado;

public class TestJuego5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultadoDado;
		Dado dado1 = new Dado();
		Auto auto1 = new Auto(5, "Azul");
		auto1.setTipo(1);
		auto1.llenarTanque();
		auto1.imprimir();
		
		/** Auto 2 **/
		System.out.println("==================");
		Auto auto2 = new Auto(4, "Gris");
		auto2.setTipo(2);
		//auto2.llenarTanque();
		auto2.cargarGasolina(22);
		auto2.imprimir();
		
		System.out.println("=======EMPIEZA LA CARRERA===========");

		resultadoDado = dado1.lanzar();
		auto1.avanzar(resultadoDado);
		System.out.println("==================");
		auto1.imprimirInfo();

		resultadoDado = dado1.lanzar();
		auto1.avanzar(resultadoDado);
		System.out.println("==================");
		auto1.imprimirInfo();

		resultadoDado = dado1.lanzar();
		auto1.retroceder(resultadoDado);
		System.out.println("==================");
		auto1.imprimirInfo();

		
		resultadoDado = dado1.lanzar();
		auto2.avanzar(resultadoDado);
		System.out.println("==================");
		auto2.imprimirInfo();

		resultadoDado = dado1.lanzar();
		auto2.avanzar(resultadoDado);
		//auto2.cargarGasolina(20);
		System.out.println("==================");
		auto2.imprimirInfo();

		resultadoDado = dado1.lanzar();
		auto2.retroceder(resultadoDado);
		System.out.println("==================");
		auto2.imprimirInfo();

		System.out.println("========AUTO GANADOR==========");
		if (auto1.getPosicion() > auto2.getPosicion()) {
			System.out.println("GANADOR AUTO No." + auto1.getNumero());
		} else {
			System.out.println("GANADOR AUTO No." + auto2.getNumero());
		}
	}

}
