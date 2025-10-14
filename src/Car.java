public class Car {
    private int speed;
    private String color;
    private String model;
    private String brand;
    private int year;

    public Car(int speed, String color, String model, String brand, int year) {
        setSpeed(speed);
        this.color = color;
        this.model = model;
        this.brand = brand;
        setYear(year);
    }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) {
        if (speed < 0) throw new IllegalArgumentException("Speed cannot be negative");
        this.speed = speed;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getBrand() { return brand; }       
    public void setBrand(String brand) { this.brand = brand; }

    public int getYear() { return year; }
    public void setYear(int year) {
        if (year < 1886) throw new IllegalArgumentException("Invalid year"); 
        this.year = year;
    }

    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ") - " + color + " - " + speed + " km/h";
    }
}
