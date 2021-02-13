package ru.geekbrains.lessons5.moiseeva;

public class MainApp {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Irina", "junior java developer", "imoiseeva@inbox.ru", "89165652655", 40000, 21);
        employee1.info();

        Employee[] employees = {
                new Employee("Irina", "junior java developer", "imoiseeva@inbox.ru", "89165652655", 40000, 21),
                new Employee("Pavel", "C++ developer", "pv@mail.ru", "893894398493", 140000, 46),
                new Employee("Grigory", "engineer", "arb@gmail.com", "89345243215", 80000, 28),
                new Employee("Evgenia", "Python", "evg@mail.ru", "89452391834", 85000, 26),
                new Employee("Anastasia", "dean", "ana@inbox.ru", "81534276821", 135000, 42)
        };
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].olderThan40()) {
                employees[i].info();
            }

        }
    }
}
