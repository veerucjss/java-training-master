package com.cjss.training.model;

/**
 * This class for studentfee details
 *  StudentFee (rno, amount, date)
 */
public class StudentFee {

    private String rno;
    private Float amount;
    private String date;


    public Student(String rno, Float amount,String date) {
        this.rno = rno;
        this.amount = amount;
        this.date= date;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
