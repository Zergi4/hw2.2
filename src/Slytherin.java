public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authoritativeness;

    public Slytherin(int powerMagic, int distanceTransgression, int cunning, int determination, int ambition, int resourcefulness, int authoritativeness) {
        super(powerMagic, distanceTransgression);
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


}
