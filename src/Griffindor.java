public class Griffindor extends Hogwarts{
    private int honor;
    private int nobility;
    private int bravery;
    public Griffindor(String studentName, int magicPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(studentName, magicPower, apparitionDistance);
        this.honor = honor;
        this.nobility = nobility;
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Гриффиндорец " +
                super.toString() +
                "\nБлагородство: " + nobility + " баллов" +
                "\nЧесть: " + honor + " баллов" +
                "\nХрабрость: " + bravery + " баллов";
    }

    @Override
    public void compareAttributes(Hogwarts student) {
        if (student instanceof Griffindor) {
        int student1Points = this.getHonor() + this.getBravery() + this.getNobility();
            int student2Points = ((Griffindor) student).getHonor() + ((Griffindor) student).getBravery() + ((Griffindor) student).getNobility();
            if (student1Points > student2Points) {
                System.out.println(this.getStudentName() + " лучший Гриффиндорец чем " + student.getStudentName());
            } else if (student1Points < student2Points) {
                System.out.println(student.getStudentName() + " лучший Гриффиндорец чем " + this.getStudentName());
            } else {
                System.out.println(this.getStudentName() + " и " + student.getStudentName() + " равны по баллам");
            }
        }
    }

}
