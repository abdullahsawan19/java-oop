public interface Flyable {
    void fly();

    void life();

    default void land() {
        System.out.println("Landing...");
    }
}
