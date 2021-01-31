package com.daniu101.model.test;
/**
 * 编程题
 */
public class ProgrammingQuestion extends Question{
    protected String programmingInputBox;//编程输入框

    public ProgrammingQuestion(int questionNumber, StageEnums value, String questionStem, String questionDescribe, String programmingInputBox) {
        super(questionNumber, value, questionStem, questionDescribe);
        this.programmingInputBox = programmingInputBox;
    }

    public String getProgrammingInputBox() {
        return programmingInputBox;
    }

    public void setProgrammingInputBox(String programmingInputBox) throws Exception {
        if(programmingInputBox.matches("[a-zA-Z]{2}")) {
            throw new Exception("格式错误");
        }
            this.programmingInputBox = programmingInputBox;

    }
}
