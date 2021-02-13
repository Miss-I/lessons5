package ru.geekbrains.lessons5.moiseeva;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName(){
        return name;
    }


    public void info(){
        System.out.printf("%s %s %s %s %d %d\n", name, position, email, phoneNumber,salary, age);
    }
    public boolean olderThan40(){
        if (age>40){
            return true;
        } else return false;
    }
}
