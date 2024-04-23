public abstract class Hogwarts implements ComparePoints {
    private String studentName;
    private int magicPower;
    private int apparitionDistance;

    public Hogwarts(String studentName, int magicPower, int apparitionDistance) {
        this.magicPower = magicPower;
        this.apparitionDistance = apparitionDistance;
        this.studentName = studentName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setApparitionDistance(int apparitionDistance) {
        this.apparitionDistance = apparitionDistance;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    @Override
    public String toString() {
        return studentName +
                "\nМощность колдовства: " + magicPower + " баллов" +
                "\nРасстояние трансгрессии: " + apparitionDistance + " км";
    }
    @Override
    public void compareGrades(Hogwarts student) {
        int student1Points = this.getApparitionDistance() + this.getMagicPower();
        int student2Points = student.getApparitionDistance() + student.getMagicPower();
        if (student1Points > student2Points) {
            System.out.println(this.getStudentName() + " обладает большей магической мощностью чем " + student.getStudentName());
        } else if (student1Points < student2Points) {
            System.out.println(this.getStudentName() + " обладает меньшей магической мощностью чем " + student.getStudentName());
        } else {
            System.out.println(this.getStudentName() + " и " + student.getStudentName() + " равны по баллам");
        }
    }
}
