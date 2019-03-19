package com.study.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.study.pattern.observer.gperadvice.Question;

public class GuavaTeacher {
    private String name;

    public GuavaTeacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void advice(Question question ) {
        System.out.println("使用Guava实现");
        System.out.println(this.name + "老师，您好！\n" +
                "您收到了一个来自“GPer 生态圈”" + question.getUserName() + "同学的提问，希望您解答，" +
                "问题内容如下：\n" + question.getQuestionContent() + "\n");

    }
}
