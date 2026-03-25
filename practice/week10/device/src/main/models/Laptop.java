package practice.week10.device.src.main.models;

public class Laptop extends Computer{
    
    @Override
    public void boot(){
        super.boot();
        System.out.println("Laptop's booting up...");
    }

    @Override
    public String toString(){
        return "Laptop";
    }

    public void shutdown(){
        System.out.println("shutdown...");
    }
}