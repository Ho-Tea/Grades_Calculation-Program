public class Main {
    public static void main(String[] args) {
        Student Ahn = new Student(181213,"안성원","국어국문학과");
        Student Ohh = new Student(182330,"오태훈","컴퓨터공학과");
        Student Lee = new Student(171518,"이동호","국어국문학과");
        Student Zho = new Student(172350,"조성욱","국어국문학과");
        Student Choi = new Student(171290,"최태평","컴퓨터공학과");

        System.out.println("---------안성원---------");
        Ahn.enterScore(95,56);
        Ahn.printGrade();

        System.out.println("---------오태훈---------");
        Ohh.enterScore(95,98);
        Ohh.printGrade();

        System.out.println("---------이동호---------");
        Lee.enterScore(100,88);
        Lee.printGrade();

        System.out.println("---------조성욱---------");
        Zho.enterScore(89,95);
        Zho.printGrade();

        System.out.println("---------최태평---------");
        Choi.enterScore(83,56);
        Choi.printGrade();

    }

}