package com.tejaswini.students.service;

import com.tejaswini.students.dao.DetailsDao;

public class DetailsService {
    private DetailsDao detailsDao = new DetailsDao();

    public String getRnoBasedOnName(String name) {
//        name = name + "teju";
        return detailsDao.getRnoFromDB(name);

    }

    public String getBranchNameBasedOnName(String name) {
//        name = name + "teju";
        return detailsDao.getBranchNameFromDB(name);

    }

    public Float getGpabasedOnName(String name) {
//        name = name + "teju";
        return detailsDao.getGpaFromDB(name);
    }
}