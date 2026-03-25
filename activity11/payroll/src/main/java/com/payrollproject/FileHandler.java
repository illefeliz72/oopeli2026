package com.payrollproject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import java.io.*;

public class FileHandler {
    private static final String FILE_NAME = "employees.json";
    private final Gson gson;

    public FileHandler() {
      
        RuntimeTypeAdapterFactory<Employee> adapter = RuntimeTypeAdapterFactory
            .of(Employee.class, "type")
            .registerSubtype(SalariedEmployee.class, EmployeeType.SALARIED.name())
            .registerSubtype(HourlyEmployee.class, EmployeeType.HOURLY.name());
        this.gson = new GsonBuilder()
                .registerTypeAdapterFactory(adapter)
                .setPrettyPrinting()
                .create();
        Gson gson = new GsonBuilder().registerTypeAdapterFactory(adapter).create();
    }
    
}
