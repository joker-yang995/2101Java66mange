package com.daniu101.model.test;

import java.util.List;

/**
 * 单选题
 */
public class SingleChoiceQuestions extends Question{
    protected List<String> singleList;//单选列表
    protected String wordAnalysis;//文字解析

    public SingleChoiceQuestions(int questionNumber, StageEnums value, String questionStem, String questionDescribe, List<String> singleList, String wordAnalysis) {
        super(questionNumber, value, questionStem, questionDescribe);
        this.singleList = singleList;
        this.wordAnalysis = wordAnalysis;
    }

    public String getSingleList(String s) {
        if (!singleList.contains(s)){
            System.out.println("输入有误");
        }
        return s;
    }

    public void setSingleList(List<String> singleList) {
        if(singleList.size()>=5){
            this.singleList = singleList;
        }else {
            System.out.println("需要包含五个选项");
        }

    }

    @Override
    public String toString() {
        return "{"
                + "\"singleList\":"
                + singleList
                + ",\"wordAnalysis\":\""
                + wordAnalysis + '\"'
                + ",\"id\":"
                + id
                + ",\"questionNumber\":"
                + questionNumber
                + ",\"value\":"
                + value
                + ",\"questionStem\":\""
                + questionStem + '\"'
                + ",\"questionDescribe\":\""
                + questionDescribe + '\"'
                + ",\"wordAnalysis\":\""
                + wordAnalysis + '\"'
                + "},\"super-SingleChoiceQuestions\":" + super.toString() + "}";
    }
}
