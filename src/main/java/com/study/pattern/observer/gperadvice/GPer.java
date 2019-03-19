package com.study.pattern.observer.gperadvice;

import java.util.Observable;

public class GPer extends Observable {
    private String name = "GPer生态圈";
    private static GPer gper = null;
    private GPer(){}

    public String getName() {
        return name;
    }

    public static GPer getInstance(){
        if(null == gper){
            gper = new GPer();
        }
        return gper;
    }

    public void publicQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提出了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
