


package com.cjss.training.model;

/**

 Task
 ----
 Define below classes
 Student (rno, name, branch, year)
 StudentFee (rno, amount, date)
 Subjects(subjectNo, subjectName)
 StudentMarks(rno, year, subjectNo, marks)

 Task 1: Print student rno, name, branch of 1st year students
 Task 2: Print all students rno, name, branch, amount, date
 Task 3: Print all students rno, name, subjectName, marks
 Task 3: Print all students rno, name, subjectName, marks order by year
 Note: To take input use Scanner as per https://www.javatpoint.com/how-to-get-input-from-user-in-java
 This class for student details
 */


public class Student {

    private String rno;
    private String name;
    private String branch;
    private int year;

    public Student(){}

    public Student(String rno, String name,String branch, int  year) {
        this.rno = rno;
        this.name = name;
        this.branch=branch;
        this.year= year;
    }

    public String getRno() {
        return rno;
    }

    public String setRno(String rno) {
        return this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public String setBranch(String branch) {
        return this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        return this.year = year;
    }
}
