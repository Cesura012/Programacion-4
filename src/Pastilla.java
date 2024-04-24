public class Pastilla {
    private int x;
    private int y;
    private int diametro;
    private boolean visible;

    public Pastilla(int x, int y, int diametro) {
        this.x = x;
        this.y = y;
        this.diametro = diametro;
        this.visible = true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDiametro() {
        return diametro;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
