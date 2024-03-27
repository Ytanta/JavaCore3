package org.example;

import java.time.LocalDate;

public class Manager extends Worker{
    public Manager(String surname, String name, String middleName, String position, String phoneNumber, int salary, LocalDate birthDate) {
        super(surname, name, middleName, position, phoneNumber, salary, birthDate);
    }
    public static void addSalary(Worker[] workers, int addAmount) {
        for (Worker worker : workers) {
            if (!(worker instanceof Manager)) {
                worker.setSalary(worker.getSalary() + addAmount);
            }
        }
        System.out.println("Зарплата повышена успешно!!!");
    }
    public static void assign(Manager manager, Worker worker, Task task){
        System.out.println("Менеджер: " + manager.toString()+"Отправил сотрудника: " + worker.toString()+ "На задачу: " + task);
    }

}
