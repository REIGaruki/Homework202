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
                "\nЧесть: " + honor + " баллов" +
                "\nБлагородство: " + nobility + " баллов" +
                "\nХрабрость: " + bravery + " баллов";
    }
}
