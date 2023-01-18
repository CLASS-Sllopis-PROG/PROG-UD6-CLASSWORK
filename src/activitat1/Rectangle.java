package activitat1;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {
        this.width = 200;
        this.height = 120;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int height) {
        this.width = 100;
        this.height = height;
    }

    /**
     * Calcula el área del rectángulo
     * @return El área calculada
     * **/
    public int calcularAreaRectangulo() {
        //return width * height;
        return this.width * this.height;
    }
}
