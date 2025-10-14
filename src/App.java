public class App {
        public static void main(String[] args) throws Exception {
        Car myCar = new Car(120, "Red", "Model S", "Tesla", 2020);

        System.out.println(myCar); 

        myCar.start();

        myCar.setSpeed(150);
        System.out.println("New speed: " + myCar.getSpeed());

    }
}
