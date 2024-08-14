
abstract class Animal {
    abstract void move();
    abstract void makeSound();
}
class Bird extends Animal {
    @Override
    void move() {
        System.out.println("bird eat worms");
    }
    @Override
    void makeSound() {
        System.out.println("bird sings");
    }
}
class Panthera extends Animal {
    @Override
    void move() {
        System.out.println("panther is a carnivore");
    }
    @Override
    void makeSound() {
        System.out.println("panther roars ");
    }
}
public class overriding {
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.move();
        bird.makeSound();
        Animal panthera = new Panthera();
        panthera.move();
        panthera.makeSound();
    }
}

