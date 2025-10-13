public class App {
        public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        myCar.start();
        myCar.speed = 100;
        System.out.println("Car speed is: " + myCar.speed);
        System.out.println("Car color is: " + myCar.color);
    }
}
