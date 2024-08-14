
class Animal {
    void Sound() {
        System.out.println("This animal makes a sound.");
    }
}
class Bird extends Animal {
    @Override
    void Sound() {
        System.out.println("bird chirps");
    }
}
class Cat extends Animal {
    @Override
    void Sound() {
        System.out.println("cat meows");
    }
}
public class eight {
    public static void main(String[] args) {
        Animal myBird = new Bird();
        Animal myCat = new Cat();
        myBird.Sound(); 
        myCat.Sound();  
    }
}
 