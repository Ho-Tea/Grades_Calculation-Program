public class ComputerMajor implements Major{
    private String vital;
    private String normal;
    private Subject subject;
    ComputerMajor(){
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
