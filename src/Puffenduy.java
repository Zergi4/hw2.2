public class Puffenduy extends Hogwarts {
    private String nameSurname;
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(String nameSurname,int powerMagic, int distanceTransgression,  int diligence, int loyalty, int honesty) {
        super(powerMagic, distanceTransgression);
        this.nameSurname = nameSurname;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String getNameSurname() {
        return nameSurname;
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
    public static void getTheBest(Puffenduy person1, Puffenduy person2) {
        int totalPoints1 = person1.getDiligence() + person1.getHonesty() + person1.getLoyalty();
        int totalPoints2 = person2.getDiligence() + person2.getHonesty() + person2.getLoyalty();
        if (totalPoints1 > totalPoints2) {
            System.out.println(person1.getNameSurname() +" лучший Пуффендуец, чем " + person2.getNameSurname());
        } else             System.out.println(person2.getNameSurname() +" лучший Пуффендуец, чем " + person1.getNameSurname());

    }
}
