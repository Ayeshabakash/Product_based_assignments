
class Animal {
    void makeSound() {
        System.out.println("animal sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark"); 
    }
}
public class ex  {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); 
        myAnimal.makeSound();           
        Dog myDog = new Dog();          
        myDog.makeSound();              
    }
}
