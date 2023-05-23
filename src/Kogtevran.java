public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;

    private int creativity;

    public Kogtevran(int powerMagic, int distanceTransgression, int mind, int wisdom, int wit, int creativity) {
        super(powerMagic, distanceTransgression);
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


}
