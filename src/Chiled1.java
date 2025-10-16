public class Chiled1 extends Person {
        private String major; 

    public Chiled1(String name, int age, String major) {
        super(name, age); 
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Major: " + major);    
    }
}
