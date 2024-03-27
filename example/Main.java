package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Ivanov", "Ivan", "Ivanovich",
                        "backend-developer", "+7-999-888-77-66", 100,
                        LocalDate.of(1940, 10, 17)),
                new Worker("Petrov", "Ivan", "Pavlovich", "backend-developer",
                        "+7-999-111-22-66", 200,
                        LocalDate.of(1969, 11, 17)),
                new Worker("Pavlov", "Ivan", "Pavlovich", "backend-developer",
                        "+7-999-111-22-66", 200,
                        LocalDate.of(1980, 11, 17)),
                new Worker("Denisov", "Ivan", "Pavlovich", "backend-developer",
                        "+7-999-111-22-66", 200,
                        LocalDate.of(1962, 11, 17)),
                new Worker("Nosov", "Oleg", "Pavlovich", "backend-developer",
                        "+7-999-111-22-66", 2000,
                        LocalDate.of(1970, 11, 17)),
                new Manager("Babaev", "Bogdan", "Borisofvich", "Manager",
                        "+7_123-123-12-12",10000,LocalDate.of(1999,12,12))
        };
        Task task = new Task("Помыть пол");
        System.out.println(task);
     Worker.assign(workers[0], task);
        Manager.assign((Manager) workers[5], workers[0], task);

        System.out.println("Average age: " + getAverageAge(workers));
        System.out.println("Average salary: " + getAverageSalary(workers));

      Manager.addSalary(workers,  10);

        System.out.println(Arrays.toString(workers));

        List<Worker> workerList = Arrays.asList(workers);

        System.out.println("---".repeat(5));
        Collections.sort(workerList);
        System.out.println(workerList);
        System.out.println("---".repeat(5));

        workerList.sort(new WorkerSalaryComparator());
        System.out.println(workerList);

        System.out.println("---".repeat(5));

       workerList.sort(new WorkerSurnameComparator());
        System.out.println(workerList);
        System.out.println("---".repeat(5));

    }

    public static double getAverageAge(Worker[] array) {
        int sumAge = 0;
        for (Worker worker : array) {
            sumAge += worker.getAge();
        }
        return sumAge / (double) array.length;
    }

    public static double getAverageSalary(Worker[] array) {
        int sumSalary = 0;
        for (Worker worker : array) {
            sumSalary += worker.getSalary();
        }
        return sumSalary / (double) array.length;
    }

}