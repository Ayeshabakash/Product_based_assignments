
abstract class Sports {
    abstract void play();
}
class Football extends Sports {
    @Override
    void play() {
        System.out.println("Kick the ball into the goal!");
    }
}
class Basketball extends Sports {
    @Override
    void play() {
        System.out.println(" Dribble and shoot the ball into the hoop!");
    }
}
class Rugby extends Sports {
    @Override
    void play() {
        System.out.println(" Run with the ball and tackle your opponents!");
    }
}
public class twelve {
    public static void main(String[] args) {
        Sports football = new Football();
        football.play();
        Sports basketball = new Basketball();
        basketball.play();
        Sports rugby = new Rugby();
        rugby.play();
    }
}

