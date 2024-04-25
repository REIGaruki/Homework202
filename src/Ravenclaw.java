public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int smart;
    private int creative;

    public Ravenclaw(String studentName, int magicPower, int apparitionDistance, int intelligence, int wisdom, int smart, int creative) {
        super(studentName, magicPower, apparitionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.smart = smart;
        this.creative = creative;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    @Override
    public String toString() {
        return "Когтевранец " +
                super.toString() +
                "\nУм: " + intelligence + " баллов" +
                "\nМудрость: " + wisdom + " баллов" +
                "\nОстроумие: " + smart + " баллов" +
                "\nТворчество: " + creative + " баллов";
    }
    @Override
    public void compareAttributes(Hogwarts student) {
        if (student instanceof Ravenclaw) {
            int student1Points = this.getCreative() + this.getIntelligence() + this.getSmart() + this.getWisdom();
            int student2Points = ((Ravenclaw) student).getCreative() + ((Ravenclaw) student).getIntelligence() + ((Ravenclaw) student).getSmart() + ((Ravenclaw) student).getWisdom();
            if (student1Points > student2Points) {
                System.out.println(this.getStudentName() + " лучший Когтевранец чем " + student.getStudentName());
            } else if (student1Points < student2Points) {
                System.out.println(student.getStudentName() + " лучший Когтевранец чем " + this.getStudentName());
            } else {
                System.out.println(this.getStudentName() + " и " + student.getStudentName() + " равны по баллам");
            }
        }
    }
}
