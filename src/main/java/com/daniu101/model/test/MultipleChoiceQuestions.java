package com.daniu101.model.test;

import java.util.List;

/**
 * 多选题
 */
public class MultipleChoiceQuestions extends Question{
    protected List<String> multipleList;//多选列表
    protected String wordAnalysis;//文字解析
    protected String videoAnalysis;//视频解析

    public MultipleChoiceQuestions(int questionNumber, StageEnums value, String questionStem, String questionDescribe, List<String> multipleList, String wordAnalysis, String videoAnalysis) {
        super(questionNumber, value, questionStem, questionDescribe);
        this.multipleList = multipleList;
        this.wordAnalysis = wordAnalysis;
        this.videoAnalysis = videoAnalysis;
    }

    public List<String> getMultipleList(){
        if(multipleList.size()>=3||multipleList.size()<=7){
            return multipleList;
        }
        return null;
    }

    public void setMultipleList(List<String> multipleList) {
        if (multipleList.size()!=10){
            throw new IndexOutOfBoundsException("只能包含十个选项");
        }
        this.multipleList = multipleList;
    }



    public String getVideoAnalysis() {
        return videoAnalysis;
    }

    public void setVideoAnalysis(String videoAnalysis) {
        if (videoAnalysis.matches(" /^((ht|f)tp?):\\/\\/[\\w\\-]+(\\.[\\w\\-]+)+([\\w\\-.,@?^=%&:\\/~+#]*[\\w\\-@?^=%&\\/~+#])?$/")){
            this.videoAnalysis = videoAnalysis;
        }else {
            System.out.println("格式不正确");
            return;
        }

    }

    @Override
    public String toString() {
        return "{"
                + "\"multipleList\":"
                + multipleList
                + ",\"wordAnalysis\":\""
                + wordAnalysis + '\"'
                + ",\"videoAnalysis\":\""
                + videoAnalysis + '\"'
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
                + "},\"super-MultipleChoiceQuestions\":" + super.toString() + "}";
    }
}
