package com.daniu101.model.test;

import java.util.List;

/**
 * 所有题的父类
 */
public class Question {
    protected int id = (int) System.currentTimeMillis();//id
    protected int questionNumber;//题号
    protected String[] stage;//所属阶段
    protected String questionStem;//题干
    protected String questionDescribe;//题的描述
    protected List<String> singleList;//单选列表
    protected List<String> multipleList;//多选列表
    protected String fillInputBox;//填空输入框
    protected String easyAnswerInputBox;//简答输入框
    protected String programmingInputBox;//编程输入框
    protected String wordAnalysis;//文字解析
    protected String videoAnalysis;//视频解析
    protected enum stage {
        JAVA("Java基础"),
        OOP("OOP"),
        SPRING("Spring"),
        SPECIAL("专题"),
        SPRINT("冲刺"),
        PROJECT("项目");

        public final String value;
        private stage(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    public Question(int id, int questionNumber, String[] stage, String questionStem, String questionDescribe, String wordAnalysis) {
        this.id = id;
        this.questionNumber = questionNumber;
        this.stage = stage;
        this.questionStem = questionStem;
        this.questionDescribe = questionDescribe;
        this.wordAnalysis = wordAnalysis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<0){
            System.out.println("id需为正整数");
            return;
        }else {
            this.id = id;
        }

    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionStem() {
        return questionStem;
    }

    public void setQuestionStem(String questionStem) {
        this.questionStem = questionStem;
    }

    public String getQuestionDescribe() {
        return questionDescribe;
    }

    public void setQuestionDescribe(String questionDescribe) {
        this.questionDescribe = questionDescribe;
    }

    public String getSingleList(int index){
        if(index>=singleList.size()||index<0){
            System.out.println("输入有误");
        }
        return singleList.get(index);
    }

    public void setSingleList(List<String> singleList) {
        this.singleList = singleList;
    }

    public List<String> getMultipleList() {
        return multipleList;
    }

    public void setMultipleList(List<String> multipleList) {
        this.multipleList = multipleList;
    }

    public String getFillInputBox() {
        return fillInputBox;
    }

    public void setFillInputBox(String fillInputBox) {
        this.fillInputBox = fillInputBox;
    }

    public String getEasyAnswerInputBox() {
        return easyAnswerInputBox;
    }

    public void setEasyAnswerInputBox(String easyAnswerInputBox) {
        this.easyAnswerInputBox = easyAnswerInputBox;
    }

    public String getProgrammingInputBox() {
        return programmingInputBox;
    }

    public void setProgrammingInputBox(String programmingInputBox) {
        this.programmingInputBox = programmingInputBox;
    }

    public String getWordAnalysis() {
        return wordAnalysis;
    }

    public void setWordAnalysis(String wordAnalysis) {
        this.wordAnalysis = wordAnalysis;
    }

    public String getVideoAnalysis() {
        return videoAnalysis;
    }

    public void setVideoAnalysis(String videoAnalysis) {
        this.videoAnalysis = videoAnalysis;
    }
}
