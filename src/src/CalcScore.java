public class CalcScore implements Score{
    String grade;
    String detectSubject;

    CalcScore(String detectSubject){
        this.detectSubject = detectSubject;
    }
    @Override
    public String CalcOtherGrade(int score) {
        if(detectSubject.equals("Essential")){
            //s,a,d,f구분
        }
        
        return grade;
    }

    @Override
    public String CalcCommonGrade(int score) {
        switch (score/10){
            case 9:
                grade = CalcOtherGrade(score);
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = CalcOtherGrade(score);
                break;
            case 5:
                grade = CalcOtherGrade(score);
                break;

        }
        return grade;
    }
}
