package com.example;

import java.util.List;

class Student {
    String name;
    String group;
    int studentCourse;
    List<Integer> Grades;

    public Student(String name, String group, int studentCourse, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.studentCourse = studentCourse;
        this.Grades = grades;
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", Группа: " + group + ", Курс: " + studentCourse + ", Оценки: " + Grades;
    }
}