package com.gmm.ds.sec10.queueinf;

public class Task {

    private int id;

    public Task(int id){
        this.id = id;
    }

    public void execute(){
        System.out.println("Executing task with id " + id);
    }
}
