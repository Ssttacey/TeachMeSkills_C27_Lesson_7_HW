package com.techmeskills.lesson7.task1.staff;

import com.techmeskills.lesson7.task1.IPosition;
/*
this class contains information about the director
 */
public class Director implements IPosition {
    int director;

    public Director(int director) {
        this.director = director;
    }

    @Override
    public void DoPosition() {
        System.out.println("Director");
    }
}
