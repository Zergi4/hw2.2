public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;

    private int creativity;

    public Kogtevran(String nameSurname,int powerMagic, int distanceTransgression,  int mind, int wisdom, int wit, int creativity) {
        super(powerMagic, distanceTransgression, nameSurname);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

  

    public static void getTheBest(Kogtevran person1, Kogtevran person2) {
        int totalPoints1 = person1.getCreativity() + person1.getWit() + person1.getMind() + person1.getWisdom();
        int totalPoints2 = person2.getCreativity() + person2.getWit() + person2.getMind() + person2.getWisdom();
        if (totalPoints1 > totalPoints2) {
            System.out.println(person1.getNameSurname() + " лучший Когтевранец, чем " + person2.getNameSurname());
        } else System.out.println(person2.getNameSurname() + " лучший Когтевранец, чем " + person1.getNameSurname());

    }
}
