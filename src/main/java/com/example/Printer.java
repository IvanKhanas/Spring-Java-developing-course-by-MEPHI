package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Printer {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    List<String> studentNames = new ArrayList<>(); // имена студентов
    List<Integer> studentCourses = new ArrayList<>(); // номера курсов
    List<String> studentGroups = new ArrayList<>();

    List<Student> students1 = new ArrayList<>();

    void fillLists() { // заполнение ArrayLists
        studentNames.addAll(Arrays.asList("Nikita", "Alexander", "Ivan", "Ilya", "Aleksei", "Maksim"));
        studentCourses.addAll(Arrays.asList(1, 2, 3, 4));
        studentGroups.addAll(Arrays.asList("ИВТ", "ИС", "ПМ", "ЛД", "БИЗ", "МТМ"));
    }

    void printAllStudents() {
        System.out.println("Введите количество студентов:");
        int studentsNumber = scanner.nextInt();

        for (int i = 0; i < studentsNumber; i++) {
            List<Integer> studentGrades = new ArrayList<>();
            for (int j = 0; j < 10; j++) { // заполняем случайными числами от 1 до 5
                studentGrades.add(j, random.nextInt(5) + 1);
            }
            students1.add(new Student(studentNames.get(random.nextInt(studentNames.size())),
                    studentGroups.get(random.nextInt(studentGroups.size())),
                    studentCourses.get(random.nextInt(studentCourses.size())),
                    studentGrades));
        }

        for (Student student : students1) {
            System.out.println(student);
            System.out.println();
        }
    }

    double CalculateAverage(List<Integer> studentGrades) {
        double summ = 0.0;
        for (int num : studentGrades) {
            summ += num;
        }
        return summ / studentGrades.size();
    }

    void removeLowGradeStudents() {
        students1.removeIf(student -> CalculateAverage(student.Grades) < 3);
    }

    void promoteStudents() {
        for (Student student : students1) {
            if (CalculateAverage(student.Grades) >= 3) {
                student.studentCourse += 1; // переводим на следующий курс
            }
        }
    }

    void printStudents(List<Student> students, int course) {
        System.out.println("*".repeat(30) + "n" + "Студенты на курсе " + course + ":" + "n");
        for (Student student : students) {
            if (student.studentCourse == course) {
                System.out.println(student.name); // выводим имя студента
            }
        }
    }
}