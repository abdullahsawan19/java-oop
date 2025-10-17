public abstract class Bird {
    protected String name;

    public Bird(String name) {
        this.name = name;
    }

    public final void perform() {
        takeOff();
        act();
        land();
    }

    protected void takeOff() {
        System.out.println(name + " taking off");
    }

    protected abstract void act();

    public void land() {
        System.out.println(name + " landing");
    }
}
