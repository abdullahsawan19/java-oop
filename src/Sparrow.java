public class Sparrow extends Bird implements Flyable {

    public Sparrow() {
        super("Sparrow");
    }

    @Override
    protected void act() {
        System.out.println("Sparrow sings while flying");
    }

    @Override
    public void life() {
        System.out.println("Sparrow is living its life");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flaps wings");
    }
}
