public class Complex {

    private double realNumber;
    private double imaginaryNumber;

    public Complex(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public Complex addNumbers(Complex number) {
        double sumReal = this.realNumber + number.realNumber;
        double sumImaginary = this.imaginaryNumber + number.imaginaryNumber;
        Complex sumNumbers = new Complex(sumReal, sumImaginary);
        return sumNumbers;
    }

    public Complex multiplyNumbers(Complex number) {
        // (a+bi)×(c+di), is (ac−bd)+(ad+bc)i
        double realNumber = (this.realNumber * number.realNumber - this.imaginaryNumber * number.imaginaryNumber);
        double imaginaryNum = (this.realNumber * number.imaginaryNumber + this.imaginaryNumber * number.realNumber);
        Complex newNumber = new Complex(realNumber, imaginaryNum);
        return newNumber;
    }

    public String toString() {
        return this.realNumber + " + " + this.imaginaryNumber + "i";
    }

    public static void main (String args[]) {
        Complex n1 = new Complex(10, 5);
        System.out.println(n1);
        Complex n3 = new Complex(-10, -10);
        System.out.println(n3);
        System.out.println(n1.addNumbers(n3));

        System.out.println();
        System.out.println(n1);
        System.out.println(n3);
        System.out.println(n1.multiplyNumbers(n3));
    }
}
