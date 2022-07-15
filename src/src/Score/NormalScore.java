package Score;



public class NormalScore implements Score {
    private String grade;
    public NormalScore(int score){
        calculate(score);
    }
    @Override
    public void calculate(int score) {
        if(100>= score && score>89)
            grade = "A";
        else if (score > 79)
            grade = "B";
        else if (score > 69)
            grade = "C";
        else if (score >54)
            grade = "D";
        else
            grade = "F";

    }

    @Override
    public String getGrade() {
        return grade;
    }
}
