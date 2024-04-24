public class player {
	int x;
	int y;
	int a;
	int l;
	boolean bocaAbierta;
	
	public player() {

	}

	public player(int x, int y, int a, int l) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.l = l;
		this.bocaAbierta = false;
	}
	public void abrirBoca() {
        this.bocaAbierta = true;
    }

    public void cerrarBoca() {
        this.bocaAbierta = false;
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}
	
	
}
