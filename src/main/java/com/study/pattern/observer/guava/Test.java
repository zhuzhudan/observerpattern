package com.study.pattern.observer.guava;

import com.google.common.eventbus.EventBus;
import com.study.pattern.observer.gperadvice.Question;

public class Test {
    public static void main(String[] args) {
        EventBus gperBus = new EventBus();
        GuavaTeacher tomTeacher = new GuavaTeacher("Tom");
        gperBus.register(tomTeacher);

        Question question = new Question();
        question.setUserName("小明");
        question.setQuestionContent("观察者设计模式适用于哪些场景？");
        gperBus.post(question);
    }
}
