package com.cjss.training.model;

/**
 * This class for studentfee details

 *  StudentMarks(rno, year, subjectNo, marks)
 */

public class StudentMarks {

    private String rno;
    private int year;
    private String subjectNo;
    private Float Marks;

    public Student(String rno,int year,String subjectName,Float Marks) {
        this.rno = rno;
        this.year= year;
        this.subjectName=subjectName;
        this.Marks=Marks;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public Float getMarks() {
        return Marks;
    }

    public void setMarks(Float marks) {
        Marks = marks;
    }
