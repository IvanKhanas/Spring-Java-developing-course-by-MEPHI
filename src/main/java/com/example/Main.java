package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.fillLists();
        printer.printAllStudents();

        printer.removeLowGradeStudents(); // удаляем студентов с низким баллом
        printer.promoteStudents(); // переводим студентов на следующий курс

        // Пример вызова метода printStudents для курса 2
        printer.printStudents(printer.students1, 2);
    }
}
