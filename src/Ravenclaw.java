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
                printAttributes() +
                "\nУм: " + intelligence + " баллов" +
                "\nМудрость: " + wisdom + " баллов" +
                "\nОстроумие: " + smart + " баллов" +
                "\nТворчество: " + creative + " баллов";
    }
}
