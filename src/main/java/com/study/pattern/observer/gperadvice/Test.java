package com.study.pattern.observer.gperadvice;

public class Test {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        gPer.addObserver(tom);

        Question question = new Question();
        question.setUserName("小明");
        question.setQuestionContent("观察者设计模式适用于哪些场景？");
        gPer.publicQuestion(question);
    }
}
