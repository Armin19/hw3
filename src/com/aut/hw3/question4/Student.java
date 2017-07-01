package com.aut.hw3.question4;


public class Student {
    private String name;
    private String studentNumber;
    private int entryYear;

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    private void displayInfo() {
        System.out.println(new Student(name, studentNumber, entryYear));
    }

    public Student(String name1, String studentNumber1, int entryYear1) {
        this.name = name1;
        this.studentNumber = studentNumber1;
        this.entryYear = entryYear1;
    }

    public class GraduateStudent extends Student {
        private static final int totalUnits = 32;
        private String masterName;

        private void displayStudentInformation() {
            System.out.println(new GraduateStudent("A", "F", 1394));
        }

        public GraduateStudent(String name1, String studentNumber1, int entryYear1) {
            super(name1, studentNumber1, entryYear1);
        }
    }

    public static class UndergraduateStudent extends Student {
        private static final int totalUnits = 142;

        private void displayStudentInformation() {
            System.out.println(new UndergraduateStudent("B", "B", 1395));
        }

        public UndergraduateStudent(String name1, String studentNumber1, int entryYear1) {
            super(name1, studentNumber1, entryYear1);
        }

        private static enum entryType {konkoor, olampiad, heyatElmi}

        ;


    }

    public static void main(String[] args) {

    }
}
//Graduate and Undergraduate classes can`t change studentNumber`s value by setter.