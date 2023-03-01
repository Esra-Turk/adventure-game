package obstacle;

public class Snake extends Obstacle{
    //between damage number 3 and 6
    public static int damage =(int) (Math.random() * (6-3)) + 4;
    public Snake(){
        super("Snake", 4,damage,12,0);
    }

}
