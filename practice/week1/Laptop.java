package practice.week1;

public class Laptop{
    String brand;
    double storage;
    double memory;
    double screen;
    String model;
    String condition;
    double price;

    void printDetails(){
        System.out.printf("""
                %s %s %s 
                """,condition,brand,model);
    }
}