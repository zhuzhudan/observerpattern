package com.study.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String name;
    public Teacher(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(Observable o, Object arg) {
        if (o instanceof GPer && arg instanceof Question) {
            GPer gper = (GPer) o;
            Question question = (Question) arg;
            System.out.println(name + "老师，您好！\n" +
                    "您收到了一个来自“" + gper.getName() + "”的"+ question.getUserName()+"同学的提问，希望您解答，"+
                    "问题内容如下：\n" + question.getQuestionContent() + "\n");
        } else {
            System.out.println("出现错误");
        }
    }
}
