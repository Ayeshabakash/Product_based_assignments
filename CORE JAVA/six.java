class Animal {
    public void move() {
        System.out.println("wild animal runs");
    }
}
class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("cheetah is a carnivore");
    }
}
public class six {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.move();  
        Cheetah cheetah = new Cheetah();
        cheetah.move();  
    }
}
