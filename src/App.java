public class App {
        public static void main(String[] args) throws Exception {
            
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();

        // --------- Overriding (Runtime Polymorphism) ---------
        a.makeSound(); 
        d.makeSound();  
        c.makeSound();  

        // --------- Overloading (Compile-time Polymorphism) ---------
        a.makeSound("happy");   

        Dog realDog = new Dog();
        realDog.makeSound(3);   
      
    }
    }





