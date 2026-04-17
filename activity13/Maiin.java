public class Main {
    public static void main(String[] args) {
        
        Repository<String> guestRepository = new Repository<>();
        guestRepository.add("Alice");
        guestRepository.add("Bob");
        guestRepository.add("Charlie");
        
        System.out.println("Total guests in repository: " + guestRepository.size());
        
        Repository<Employee> employeeRepository = new Repository<>();
        employeeRepository.add(new Employee(101, "Diana Prince"));
        employeeRepository.add(new Employee(102, "Clark Kent"));
        
        Employee retrievedEmployee = employeeRepository.get(0);
        Result<Employee> employeeResult = new Result<>(retrievedEmployee, "Load Successful", true);
        
        employeeResult.display();
    }
}public class Main {
    public static void main(String[] args) {
        
        Repository<String> guestRepository = new Repository<>();
        guestRepository.add("Alice");
        guestRepository.add("Bob");
        guestRepository.add("Charlie");
        
        System.out.println("Total guests in repository: " + guestRepository.size());
        
        Repository<Employee> employeeRepository = new Repository<>();
        employeeRepository.add(new Employee(101, "Diana Prince"));
        employeeRepository.add(new Employee(102, "Clark Kent"));
        
        Employee retrievedEmployee = employeeRepository.get(0);
        Result<Employee> employeeResult = new Result<>(retrievedEmployee, "Load Successful", true);
        
        employeeResult.display();
    }
}