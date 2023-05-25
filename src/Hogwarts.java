public class Hogwarts {
    private int powerMagic;
    private int distanceTransgression;
    private String nameSurname;

    public Hogwarts(int powerMagic, int distanceTransgression, String nameSurname) {
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
        this.nameSurname = nameSurname;
    }

    public Hogwarts(int powerMagic, int distanceTransgression) {
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public static void getBest(Hogwarts person1, Hogwarts person2) {
        if (person1.getPowerMagic() > person2.getPowerMagic()) {
            System.out.println(person1.getNameSurname() + " обладает большей мощностью магии ,чем " + person2.getNameSurname());
        } else             System.out.println(person2.getNameSurname() + " обладает большей мощностью магии ,чем " + person1.getNameSurname());

        if (person1.getDistanceTransgression() > person2.getDistanceTransgression()) {
            System.out.println(person1.getNameSurname() +" обладает большей дальностью трангрессии , чем " + person2.getNameSurname());
        } else System.out.println(person2.getNameSurname() +" обладает большей дальностью трангрессии , чем " + person1.getNameSurname());
    }

}
