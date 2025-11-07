import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        double area = this.width * this.length;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * this.width + 2 * this.length;
        return perimeter;
    }

    public boolean isSquare() {
        if (this.width == this.length) {
            return true;
        }
        return false;
    }

    public void drawRectangle(double x, double y) {
        StdDraw.setPenColor();
        StdDraw.rectangle(x, y, this.width / 2, this.length / 2);
    }

    public String toString() {
        return "--Rectangle--\n" 
        + "Width: " + this.width + "\n" 
        + "Length: " + this.length + "\n";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0.2, 0.2);
        System.out.println(r1);
        System.out.println(r1.getArea());
        // r1.drawRectangle(0.5, 0.5);
        System.out.println(r1.isSquare());
    }
}
