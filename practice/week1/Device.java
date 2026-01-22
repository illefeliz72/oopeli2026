package practice.week1;
public class Device{
    String brand;
    String model;
    String type; 
    double storage;
    double memory;
    
    void printItems(){
        System.out.printf("""
                %s %s %s 
                """,brand,model,type,storage,memory);
    }
}