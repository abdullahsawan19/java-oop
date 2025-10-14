public class Car {
    int speed;
    String color;
    String model;
    String brand;
    int year;


    

    public Car(
        int speed, String color, String model, String brand, int year
    ){
        this.speed = speed;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }
   void start(){
    System.out.println("Car is starting");
   }

}
