package com.daniu101.model.test;

/**
 * 填空题
 */
public class FillQuestion extends Question{
    protected String fillInputBox;//填空输入框
    protected String wordAnalysis;//文字解析

    public FillQuestion(int questionNumber, StageEnums value, String questionStem, String questionDescribe, String fillInputBox, String wordAnalysis) {
        super(questionNumber, value, questionStem, questionDescribe);
        this.fillInputBox = fillInputBox;
        this.wordAnalysis = wordAnalysis;
    }

    public String getFillInputBox() {
        return fillInputBox;
    }

    public void setFillInputBox(String fillInputBox) {
        if (!(fillInputBox.length()>1)) {
            throw new IndexOutOfBoundsException("长度需要大于一");
        }
        this.fillInputBox = fillInputBox;

    }




    @Override
    public String toString() {
        return "{"
                + "\"fillInputBox\":\""
                + fillInputBox + '\"'
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
                + "},\"super-FillQuestion\":" + super.toString() + "}";
    }
}
