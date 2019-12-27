package Homework;

class circle{
    double radius = 1.0;
    circle(){
    }
    circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius * Math.PI;
    }
    public double getCircumference(){
        return 4 * Math.PI * radius;
    }
    public String _toString(){
        return "Circle[radius = " + radius +"]";
    }
}

class rectangle{
    float length = 1.0f;
    float width = 1.0f;
    rectangle(){
    }
    rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length + width) * 2;
    }
    public String _toString(){
        return "Rectangle[length = " + length +"," + "width=" + width +"]";
    }
}
public class Homework_4 {
    public static void main(String[] args) {
        rectangle c = new rectangle();
        System.out.println(c._toString());
    }
}
