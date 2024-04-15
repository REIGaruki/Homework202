public class Hogwarts {
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
}
