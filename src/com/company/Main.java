package com.company;

public class Main {

    public static void main(String[] args) {
	Student student = new Student("Иванов Константин", 22);
        System.out.println(student.toString());

        Aspirant aspirant = new Aspirant("Сидоров Константин", 28, "Исследование объектно-реляционных баз данных");
        System.out.println(aspirant);
    }
}
