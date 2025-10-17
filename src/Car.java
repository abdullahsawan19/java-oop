public class Car {
    private Engine engine; 
    private String model;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println(model + " is starting...");
        engine.start();
    }
}
