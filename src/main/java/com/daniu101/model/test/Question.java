package com.daniu101.model.test;

/**
 * 所有题的父类
 */
public class Question {
    protected int id = (int) System.currentTimeMillis();//id
    protected int questionNumber;//题号
    protected StageEnums value;//所属阶段
    protected String questionStem;//题干
    protected String questionDescribe;//题的描述
    protected String wordAnalysis;//文字解析


    public Question(int questionNumber, StageEnums value, String questionStem, String questionDescribe) {
        this.questionNumber = questionNumber;
        this.value = value;
        this.questionStem = questionStem;
        this.questionDescribe = questionDescribe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public StageEnums getValue() {
        return value;
    }

    public void setValue(StageEnums value) {
        this.value = value;
    }

    public String getQuestionStem() {
        return questionStem;
    }

    public void setQuestionStem(String questionStem) {
        if(questionStem.length()<=1){
            throw new IndexOutOfBoundsException("长度需要大于一");
        }
        this.questionStem = questionStem;
    }

    public String getQuestionDescribe() {

        return questionDescribe;
    }

    public void setQuestionDescribe(String questionDescribe) {
        if(questionStem.length()<=1){
            throw new IndexOutOfBoundsException("长度需要大于一");
        }
        this.questionDescribe = questionDescribe;
    }
    public String getWordAnalysis() {
        return wordAnalysis;
    }

    public void setWordAnalysis(String wordAnalysis) {
        if (wordAnalysis.length()>1) {
            throw new IndexOutOfBoundsException("长度需要大于一");
        }
            this.wordAnalysis = wordAnalysis;

    }
}