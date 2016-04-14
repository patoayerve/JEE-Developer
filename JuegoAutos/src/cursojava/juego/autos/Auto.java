package cursojava.juego.autos;

public class Auto {

	private int numero;
	private String color;
	private int tipo;
	private int posicion;
	private int capacidadTanque;
	private double cantidadGasolina;
	private double tasaConsumo;

	public Auto(int numero, String color) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
		this.color = color;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {

		if (tipo > 3) {
			this.tipo = 3;
		} else if (tipo < 1) {
			this.tipo = 1;
		} else {
			this.tipo = tipo;
		}
		switch (tipo) {
		case 1:
			// setCantidadGasolina(20);
			setCapacidadTanque(20);
			setTasaConsumo(2);
			break;

		case 2:
			// setCantidadGasolina(22);
			setCapacidadTanque(22);
			setTasaConsumo(2.5);
			break;

		case 3:
			// setCantidadGasolina(24);
			setCapacidadTanque(24);
			setTasaConsumo(3);
			break;

		default:
			break;
		}

	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	public double getCantidadGasolina() {
		return cantidadGasolina;
	}

	public void setCantidadGasolina(double cantidadGasolina) {
		this.cantidadGasolina = cantidadGasolina;
	}

	public double getTasaConsumo() {
		return tasaConsumo;
	}

	public void setTasaConsumo(double tasaConsumo) {
		this.tasaConsumo = tasaConsumo;
	}

	/** Métodos de carrera */

	public void avanzar(int numKilometros) {
		double disminuyeGasolina;
		double maxRecorrido = getCapacidadTanque() / getTasaConsumo();
		if (getCantidadGasolina() >= getTasaConsumo() && getCantidadGasolina() <= getCapacidadTanque()) {
			disminuyeGasolina = getCantidadGasolina() - (getTasaConsumo() * numKilometros);
			setPosicion(getPosicion() + numKilometros);
			setCantidadGasolina(disminuyeGasolina);
			if (getCantidadGasolina() <= 0) {
				setCantidadGasolina(0);
				setPosicion((int) (maxRecorrido));
			}
		}
	}

	public void retroceder(int numKilometros) {
		double disminuyeGasolina;
		if (getCantidadGasolina() >= getTasaConsumo() && getCantidadGasolina() <= getCapacidadTanque()) {
			disminuyeGasolina = getCantidadGasolina() - (getTasaConsumo() * numKilometros);
			setPosicion(getPosicion() - numKilometros);
			setCantidadGasolina(disminuyeGasolina);
			if (getCantidadGasolina() <= 0) {
				setPosicion((int) (getPosicion() - (getCantidadGasolina() / getTasaConsumo())));
				setCantidadGasolina(0);
			}
		}
	}

	public void cargarGasolina(int cantidadGas) {
		double cargarGas = getCantidadGasolina() + cantidadGas;
		switch (this.tipo) {
		case 1:
			if (getCantidadGasolina() >= 0 && cantidadGas <= 20) {
				setCantidadGasolina(cargarGas);
			}

			break;

		case 2:
			if (getCantidadGasolina() >= 0 && cantidadGas <= 22) {
				setCantidadGasolina(cargarGas);
			}
			break;

		case 3:
			if (getCantidadGasolina() >= 0 && cantidadGas <= 24) {
				setCantidadGasolina(cargarGas);
			}
			break;
		default:
			break;
		}

	}

	public void llenarTanque() {
		switch (this.tipo) {
		case 1:
			setCantidadGasolina(20);
			break;

		case 2:
			setCantidadGasolina(22);
			break;

		case 3:
			setCantidadGasolina(24);
			break;
		default:
			break;
		}
	}

	public void imprimir() {
		// imprime TODOS los valores de los atributos del auto
		System.out.println("Atributos del Auto No." + getNumero());
		System.out.println("Color: " + getColor() + "\n" + "Tipo: " + getTipo() + "\n" + "Posición: " + getPosicion()
				+ "\n" + "Capacidad del tanque: " + getCapacidadTanque() + "\n" + "Cantidad de gasolina: "
				+ getCantidadGasolina() + "\n" + "Tasa de consumo: " + getTasaConsumo());
	}

	public void imprimirInfo() {
		// imprime el número del auto, la posición y la cantidad de gasolina
		if (getCantidadGasolina() >= getTasaConsumo()) {
			System.out.println("Estado del Auto No." + getNumero());
			System.out.println("Posición: " + getPosicion() + "\n" + "Cantidad de gasolina: " + getCantidadGasolina());
		} else if (getCantidadGasolina() == 0 || getCantidadGasolina() < getTasaConsumo()) {
			System.out.println("El auto No." + getNumero() + " no puede moverse llene la gasolina");
			System.out.println("Posición: " + getPosicion() + "\n" + "Cantidad de gasolina: " + getCantidadGasolina());
		}
	}

}
