package activitat1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(100, 200);
        Rectangle r2 = new Rectangle(40, 100);
        Rectangle r3 = new Rectangle(80, 43);
        Rectangle r4 = new Rectangle(56, 90);
        Rectangle r5 = new Rectangle(150);
        Rectangle r6 = new Rectangle();

        System.out.println(r1.calcularAreaRectangulo());
        System.out.println(r2.calcularAreaRectangulo());
        System.out.println(r3.calcularAreaRectangulo());
        System.out.println(r4.calcularAreaRectangulo());
        System.out.println(r5.calcularAreaRectangulo());
        System.out.println(r6.calcularAreaRectangulo());
    }
}
