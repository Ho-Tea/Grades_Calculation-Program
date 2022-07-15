public class VitalScore implements Score{
    private String grade;
    VitalScore(int score){
        calculate(score);
    }
    @Override
    public void calculate(int score) {
        if(100>= score && score>94)
            grade = "S";
        else if (score > 89)
            grade = "A";
        else if (score > 79)
            grade = "B";
        else if (score > 69)
            grade = "C";
        else if (score > 59)
            grade = "D";
        else
            grade = "F";
    }

    @Override
    public String getGrade() {
        return grade;
    }

}
