package com.techmeskills.lesson7.task1.staff;

import com.techmeskills.lesson7.task1.IPosition;
/*
this class contains information about the worker
 */
public class Worker implements IPosition {
    int worker;

    public Worker(int worker) {
        this.worker = worker;
    }

    @Override
    public void DoPosition() {
        System.out.println("Worker");
    }
}
