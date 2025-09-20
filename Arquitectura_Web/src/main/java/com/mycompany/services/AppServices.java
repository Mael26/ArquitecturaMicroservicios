package com.mycompany.services;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class AppServices {

    @Autowired
    public void getIntraDaily() throws IntraDailyNotFoundException {
        return 
    }

    public void getDaily() throws DailyNotFoundException {
        return
    }

    public void getWeekly() throws WeeklyNotFoundException {
        return
    }

    public void getMonthly() throws MonthlyNotFoundException {
        return
    }
}