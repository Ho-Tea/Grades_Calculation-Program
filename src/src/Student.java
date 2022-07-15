
import Major.*;
import Score.*;
import Subject.Subject;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int sid;
    private String name;
    Major major;
    HashMap<String, Score> score;
    Subject subject;

    Student(int sid, String name, String majord){
        this.sid = sid;
        this.name = name;
        divisionMajor(majord);
        score = new HashMap<>();
        subject = new Subject();
    }

    void divisionMajor(String majord){
        if(majord.equals("국어국문학과"))
            this.major = new LanguageMajor();
        else if (majord.equals("컴퓨터공학과"))
            this.major = new ComputerMajor();
        else
            System.out.println("전공의 이름이 맞지 않습니다");
    }

    void enterScore(int math, int korean){
        if(major.getVitalSubject().equals(subject.getKorean())) {
            score.put(major.getVitalSubject(), new VitalScore(korean));
            score.put(major.getNormalSubject(),new NormalScore(math));
        }
        else if (major.getVitalSubject().equals(subject.getMath())){
            score.put(major.getVitalSubject(), new VitalScore(math));
            score.put(major.getNormalSubject(),new NormalScore(korean));
    }
        }

    void printGrade(){
        for(Map.Entry<String,Score> map: score.entrySet())
            System.out.println(map.getKey() + " : " + map.getValue().getGrade() );
    }


}
