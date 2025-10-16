public class Chiled2 extends Person {
    private float gpa; 

    public Chiled2(String name, int age, float gpa) {
        super(name, age);    
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("gpa: " + gpa); 
    }
}
