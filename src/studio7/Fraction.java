public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction addFraction(Fraction f1) {
        int commonDenominator = f1.denominator * this.denominator;
        int f1NewNumerator = f1.numerator * this.denominator;
        int objectNewNumerator = this.numerator * f1.denominator;
        int finalNumerator = objectNewNumerator + f1NewNumerator;
        Fraction sumFraction = new Fraction(finalNumerator, commonDenominator);
        return sumFraction;
    }

    public Fraction multiplyFraction(Fraction f1) {
        int newDenominator = f1.denominator * this.denominator;
        int newNumerator = f1.numerator * this.numerator;
        Fraction multipliedFraction = new Fraction(newNumerator, newDenominator);

        return multipliedFraction;
    }

    public Fraction reciprocalFraction() {
        int numerator = this.denominator;
        int denominator = this.numerator;
        Fraction reciprocal = new Fraction(numerator, denominator);
        return reciprocal;
    }

    public Fraction simplifiedFraction() {
        for (int i = 0; i <= this.denominator; i++) {
            if (this.numerator % this.denominator == 0 && this.denominator % this.denominator == 0) {
                
            }
        }
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }


    public static void main(String args[]) {
        Fraction f1 = new Fraction(1, 2);
        System.out.println(f1);
        Fraction f2 = new Fraction (3, 4);
        Fraction sum = f1.addFraction(f2);
        System.out.println(sum);
        Fraction multiplied = f1.multiplyFraction(f2);
        System.out.println(multiplied);
        Fraction reciprocal = f1.reciprocalFraction();
        System.out.println(reciprocal);
    }

}
