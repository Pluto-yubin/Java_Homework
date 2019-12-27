package Homework;

import java.io.StringWriter;

abstract class Shape{
    String color;
    boolean filled;
    Shape(){

    }
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    abstract String _toString();
}

class circle_ extends Shape{
    double radius = 1.0;
    circle_(){
    }
    circle_(double radius){
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

    @Override
    double getPerimeter() {
        return 4 * Math.PI * radius;
    }
    public String _toString(){
        return "Circle[radius = " + radius +"]";
    }
}

class Rectangle_{
    float length = 1.0f;
    float width = 1.0f;
    Rectangle_(){
    }
    Rectangle_(float length, float width){
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

class Square extends Rectangle_{
    double size;
    String color;
    boolean filled;
    Square(){
    }
    Square(double size, String color, boolean filled){
        this.size = size;
        this.color = color;
        this.filled = filled;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(float length) {
        super.setLength(length);
    }
}

abstract class Person{
      String name;
      String address;
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    abstract String _toString();

}

class Student extends Person{
    String program;
    int year;
    double fee;
    Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.fee = fee;
        this.program = program;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    String _toString() {
        return "Students[Person[name = " + name + ", address = " + address + "], [program = " + program + " yera = " + year + " ,fee = " + fee + "]";
    }
}

class Staff extends Person{
    String school;
    double pay;
    Staff(String name, String address, String school, double pay){
        super(name, address);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    String _toString() {
        return "Students[Person[name = " + name + ", address = " + address + "], [school = " + school + " pay = " + pay + "]]";
    }
}

public class Homework_5 {
    public static void main(String[] args) {
    Square s = new Square();
    s.setLength((float) 10.0);
        System.out.println(s.getLength());
    }
}
