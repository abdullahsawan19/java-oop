public class App {
        public static void main(String[] args) throws Exception {
        Engine engine = new Engine("V8");
        Car car = new Car("Mustang", engine);
        car.startCar();
        }
    }

