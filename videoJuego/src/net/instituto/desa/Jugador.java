package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void derecha() {
		setX(getX() + 1);
	}
	public void izquierda() {
		setX(getX() - 1);
	}
	public void arriba () {
		setY(getY() - 1);
	}
	public void abajo() {
		setY(getY() + 1);
	}

}
