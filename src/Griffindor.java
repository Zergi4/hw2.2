import javax.xml.namespace.QName;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    private String nameSurname;

    public Griffindor(String nameSurname, int powerMagic, int distanceTransgression, int nobility, int honor, int bravery) {
        super(powerMagic, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.nameSurname = nameSurname;
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

    public String getNameSurname() {
        return nameSurname;
    }

    public static void getTheBest(Griffindor person1, Griffindor person2) {
        int totalPoints1 = person1.getBravery() + person1.getNobility() + person1.getHonor();
        int totalPoints2 = person2.getBravery() + person2.getNobility() + person2.getHonor();
        if (totalPoints1 > totalPoints2) {
                        System.out.println(person1.getNameSurname() +" лучший Гриффиндорец, чем " + person2.getNameSurname());
        } else             System.out.println(person2.getNameSurname() +" лучший Гриффиндорец, чем " + person1.getNameSurname());

    }


}
