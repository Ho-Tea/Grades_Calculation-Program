package Major;

import Subject.*;
public class ComputerMajor implements Major {
    private String vital;
    private String normal;
    private Subject subject;
    public ComputerMajor(){
        subject = new Subject();
        vital = subject.getMath();
        normal = subject.getKorean();
    }
    @Override
    public String getVitalSubject() {
        return vital;
    }


    @Override
    public void changeVitalSubject(String newvital) {
        this.vital = newvital;
    }

    @Override
    public String getNormalSubject() {
        return normal;
    }

}
