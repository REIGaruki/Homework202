public class Griffindor extends Hogwarts{
    private int honor;
    private int nobility;
    private int bravery;
    public Griffindor(int magicPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(magicPower, apparitionDistance);
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
}
