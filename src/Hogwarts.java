public class Hogwarts {
    private int powerMagic;
    private int distanceTransgression;

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


    @Override
    public String toString() {
        return "Hogwarts{" +
                "powerMagic=" + powerMagic +
                ", distanceTransgression=" + distanceTransgression +
                '}';
    }
}
