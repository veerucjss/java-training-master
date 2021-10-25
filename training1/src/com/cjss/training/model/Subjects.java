package com.cjss.training.model;

/**
 * This class for studentfee details
 *  StudentFee (rno, amount, date)
 *  Subjects(subjectNo, subjectName)
 */

public class Subjects {

    private String subjectNo;
    private String subjectName;

    public Student(String subjectNo,String subjectName) {
        this.subjectNo = subjectNo;
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
