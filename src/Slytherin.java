public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authoritativeness;

    public Slytherin(String nameSurname, int powerMagic, int distanceTransgression, int cunning, int determination, int ambition, int resourcefulness, int authoritativeness) {
        super(powerMagic, distanceTransgression, nameSurname);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authoritativeness = authoritativeness;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAuthoritativeness() {
        return authoritativeness;
    }

    public static void getTheBest(Slytherin person1, Slytherin person2) {
        int totalPoints1 = person1.getAmbition() + person1.getAuthoritativeness() + person1.getResourcefulness() + person1.getCunning() + person1.getDetermination();
        int totalPoints2 = person2.getAmbition() + person2.getAuthoritativeness() + person2.getResourcefulness() + person2.getCunning() + person2.getDetermination();
        if (totalPoints1 > totalPoints2) {
            System.out.println(person1.getNameSurname() + " лучший Слизеринец, чем " + person2.getNameSurname());
        } else System.out.println(person2.getNameSurname() + " лучший Слизериней, чем " + person1.getNameSurname());

    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "powerMagic=" + getPowerMagic() +
                ", disanceTransgression=" + getDistanceTransgression() +
                " cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", authoritativeness=" + authoritativeness +
                '}';
    }
}
