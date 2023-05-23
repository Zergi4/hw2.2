public class Puffenduy extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(int powerMagic, int distanceTransgression, int diligence, int loyalty, int honesty) {
        super(powerMagic, distanceTransgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }


}
