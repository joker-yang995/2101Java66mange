package com.daniu101.model.test;

public class QuestionDemo {
    public static void main(String[] args) {
        EasyAnswerQuestion easy = new EasyAnswerQuestion(5,StageEnums.JAVA,"jvm的意义是什么","这是Java题","111","222","3333");
        //easy.setEasyAnswerInputBox("啊");
        System.out.println(easy.getEasyAnswerInputBox());
        FillQuestion fillQuestion = new FillQuestion(5,StageEnums.JAVA,"jvm的意义是什么","这是Java题","111","222");
        fillQuestion.setFillInputBox("a");
        System.out.println(fillQuestion.getFillInputBox());

    }
}
