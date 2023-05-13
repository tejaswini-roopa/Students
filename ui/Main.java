package com.tejaswini.students.ui;

import com.tejaswini.students.service.DetailsService;

public class Main {
    public static void main(String[] args) {
        DetailsService detailsService = new DetailsService();
        String rno = detailsService.getRnoBasedOnName("rahul");
        Float gpa = detailsService.getGpabasedOnName("teja");
        String branchName = detailsService.getBranchNameBasedOnName("happy");
        System.out.println(rno);

        System.out.println(branchName);
        System.out.println(gpa);

    }
}