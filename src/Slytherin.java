public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resource;
    private int powerLust;
    public Slytherin(String studentName, int magicPower, int apparitionDistance, int cunning, int determination, int ambition, int resource, int powerLust) {
        super(studentName, magicPower, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }

    @Override
    public String toString() {
        return "Слизеринец " +
                super.toString() +
                "\nХитрость: " + cunning + " баллов" +
                "\nРешительность: " + determination + " баллов" +
                "\nАмбициозность: " + ambition + " баллов" +
                "\nНаходчивость: " + resource + " баллов" +
                "\nЖажда власти: " + powerLust + " баллов";
    }
    @Override
    public void compareAttributes(Hogwarts student) {
        if (student instanceof Slytherin) {
            int student1Points = this.getAmbition() + this.getCunning() + this.getDetermination() + this.getPowerLust() + this.getResource();
            int student2Points = ((Slytherin) student).getAmbition() + ((Slytherin) student).getCunning() + ((Slytherin) student).getDetermination() + ((Slytherin) student).getPowerLust() + ((Slytherin) student).getResource();
            if (student1Points > student2Points) {
                System.out.println(this.getStudentName() + " лучший Слизеринец чем " + student.getStudentName());
            } else if (student1Points < student2Points) {
                System.out.println(student.getStudentName() + " лучший Слизеринец чем " + this.getStudentName());
            } else {
                System.out.println(this.getStudentName() + " и " + student.getStudentName() + " равны по баллам");
            }
        }

    }
}
