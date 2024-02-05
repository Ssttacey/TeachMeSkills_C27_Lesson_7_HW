package com.techmeskills.lesson7.task1.staff;

import com.techmeskills.lesson7.task1.IPosition;
/*
this class contains information about the accountant
 */
public class Accountant implements IPosition {
    int accountant;

    public Accountant(int accountant) {

        this.accountant = accountant;
    }

    @Override
    public void DoPosition() {
        System.out.println("Accountant");
    }
}
