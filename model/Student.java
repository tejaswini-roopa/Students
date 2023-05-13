package com.tejaswini.students.model;

public class Student {
    private String name;
    private String rno;
    private String branchName;
    private Float gpa;

    private String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getRno() {
        return this.rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }


    private String getBranchName() {
        return this.branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;

    }

    private Float getGpa() {
        return this.gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }
}

