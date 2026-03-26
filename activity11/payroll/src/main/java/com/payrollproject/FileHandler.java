package com.payrollproject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public void saveEmployees(List<Employee> employees) {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            gson.toJson(employees, writer);
            System.out.println(">>> Data saved successfully to " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    public ArrayList<Employee> loadEmployees() {
        File file = new File(FILE_NAME);
        if (!file.exists())
            return new ArrayList<>();

        try (Reader reader = new FileReader(file)) {
            ArrayList<Employee> loaded = gson.fromJson(reader, new TypeToken<ArrayList<Employee>>() {
            }.getType());
            System.out.println(">>> Data loaded successfully!");
            return (loaded != null) ? loaded : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("Error loading data: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
