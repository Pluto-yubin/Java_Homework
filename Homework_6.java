package Homework;

interface Moveable{
    void MoveUp();
    void MoveDown();
    void MoveLeft();
    void MoveRight();
}

class MoveablePoint implements Moveable{
    int x, y, xSpeed, ySpeed;
    MoveablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void MoveUp() {

    }

    @Override
    public void MoveDown() {

    }

    @Override
    public void MoveLeft() {

    }

    @Override
    public void MoveRight() {

    }
    String _toString(){
        return null;
    }
}

class MoveableCircle extends MoveablePoint{
    int radius;
    MoveablePoint center ;
    MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    String _toString(){
        return null;
    }
    @Override
    public void MoveUp() {

    }

    @Override
    public void MoveDown() {

    }

    @Override
    public void MoveLeft() {

    }

    @Override
    public void MoveRight() {

    }
}

public class Homework_6 {
}
