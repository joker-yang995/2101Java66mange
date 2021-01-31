package com.daniu101.model.test;

/**
 * 简答题
 */
public class EasyAnswerQuestion extends Question{
    protected String easyAnswerInputBox;//简答输入框
    protected String wordAnalysis;//文字解析
    protected String videoAnalysis;//视频解析

    public EasyAnswerQuestion(int questionNumber, StageEnums value, String questionStem, String questionDescribe, String easyAnswerInputBox, String wordAnalysis, String videoAnalysis) {
        super(questionNumber, value, questionStem, questionDescribe);
        this.easyAnswerInputBox = easyAnswerInputBox;
        this.wordAnalysis = wordAnalysis;
        this.videoAnalysis = videoAnalysis;
    }

    public String getEasyAnswerInputBox() {
        return easyAnswerInputBox;
    }

    public void setEasyAnswerInputBox(String easyAnswerInputBox) {
        if (easyAnswerInputBox.length()<=1) {
            throw new IndexOutOfBoundsException("文字需要大于一个");
        }
        this.easyAnswerInputBox = easyAnswerInputBox;
    }
    public String getVideoAnalysis() {
        return videoAnalysis;
    }

    public void setVideoAnalysis(String videoAnalysis) throws Exception {
        if (videoAnalysis.matches(" /^((ht|f)tp?):\\/\\/[\\w\\-]+(\\.[\\w\\-]+)+([\\w\\-.,@?^=%&:\\/~+#]*[\\w\\-@?^=%&\\/~+#])?$/")){
            this.videoAnalysis = videoAnalysis;
        }else {
            throw new Exception("格式错误");
        }
    }


}
