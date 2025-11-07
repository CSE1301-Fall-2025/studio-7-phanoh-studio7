public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int throwDice() {
        int sideShowing = (int) (Math.random() * this.sides + 1);
        return sideShowing;
    }

    public static void main(String args[]) {
        Dice d1 = new Dice(6);
        for (int i = 0; i < 20; i++) {
            System.out.println(d1.throwDice());
        }
    }

}
