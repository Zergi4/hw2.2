

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Griffindor(String nameSurname, int powerMagic, int distanceTransgression, int nobility, int honor, int bravery) {
        super(powerMagic, distanceTransgression, nameSurname);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


    public static void getTheBest(Griffindor person1, Griffindor person2) {
        int totalPoints1 = person1.getBravery() + person1.getNobility() + person1.getHonor();
        int totalPoints2 = person2.getBravery() + person2.getNobility() + person2.getHonor();
        if (totalPoints1 > totalPoints2) {
            System.out.println(person1.getNameSurname() + " лучший Гриффиндорец, чем " + person2.getNameSurname());
        } else System.out.println(person2.getNameSurname() + " лучший Гриффиндорец, чем " + person1.getNameSurname());

    }

    @Override
    public String toString() {
        return "Факультет Griffindor{" +
                "powerMagic=" + getPowerMagic() +
                ", disanceTransgression=" + getDistanceTransgression() +
                ", nobility=" + getNobility() +
                ", honor=" + getHonor() +
                ", bravery=" + getBravery() +
                '}';
    }
}
