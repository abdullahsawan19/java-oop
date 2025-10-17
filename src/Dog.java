public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Woof!");
        }
    }
}
