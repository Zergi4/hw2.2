
public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("HarryPotter", 90, 90, 88, 99, 89);
        Griffindor germionaGranger = new Griffindor("GermionaGranger", 77, 66, 55, 44, 90);
        Griffindor ronUizli = new Griffindor("RonUizli", 33, 55, 77, 88, 22);

        Slytherin dracoMalfoy = new Slytherin("DracoMalfoy", 55, 66, 33, 88, 44, 22, 77);
        Slytherin grehamMontegu = new Slytherin("GrehamMontegu", 77, 33, 22, 99, 77, 66, 55);
        Slytherin gregoryGoil = new Slytherin("GregoryGoil", 99, 66, 44, 77, 88, 99, 22);

        Puffenduy zahariaSmit = new Puffenduy("ZahariaSmit", 55, 66, 77, 33, 99);
        Puffenduy sedrikDiggori = new Puffenduy("SedrikDiggori", 33, 88, 19, 22, 77);
        Puffenduy justinFinch = new Puffenduy("JustinFinch", 66, 69, 90, 90, 33);

        Kogtevran chzhouChang = new Kogtevran("ChzhouChang", 66, 55, 33, 99, 22, 77);
        Kogtevran padmaPatil = new Kogtevran("PadmaPatil", 55, 77, 44, 80, 29, 70);
        Kogtevran marcusBelbi = new Kogtevran("MarcusBelbi", 45, 54, 76, 67, 11, 88);


        getInfo(harryPotter);
        getInfo(zahariaSmit);
        getInfo(dracoMalfoy);
        getInfo(padmaPatil);
        Griffindor.getTheBest(harryPotter, germionaGranger);
        Slytherin.getTheBest(gregoryGoil, grehamMontegu);
        Puffenduy.getTheBest(sedrikDiggori, justinFinch);
        Kogtevran.getTheBest(chzhouChang, marcusBelbi);
        Hogwarts.getBest(harryPotter,padmaPatil);

    }



    public static void getInfo(Griffindor person) {
        System.out.println(" Информация о студенте: имя: " + person.getNameSurname() + " факультет: Griffindor{" +
                "powerMagic=" + person.getPowerMagic() +
                ", disanceTransgression=" + person.getDistanceTransgression() +
                ", nobility=" + person.getNobility() +
                ", honor=" + person.getHonor() +
                ", bravery=" + person.getBravery() +
                '}');

    }

    public static void getInfo(Puffenduy person) {
        System.out.println(" Информация о студенте: имя: " + person.getNameSurname() + " факультет: Puffenduy{" +
                "powerMagic=" + person.getPowerMagic() +
                ", disanceTransgression=" + person.getDistanceTransgression() +
                ", diligence=" + person.getDiligence() +
                ", loyalty=" + person.getLoyalty() +
                ", honesty=" + person.getHonesty() +
                '}');

    }

    public static void getInfo(Kogtevran person) {
        System.out.println(" Информация о студенте: имя: " + person.getNameSurname() + " факультет: Kogtevran{" +
                "powerMagic=" + person.getPowerMagic() +
                ", disanceTransgression=" + person.getDistanceTransgression() +
                ", mind=" + person.getMind() +
                ", wisdom=" + person.getWisdom() +
                ", wit=" + person.getWit() +
                ", creativity=" + person.getCreativity() +
                '}');

    }

    public static void getInfo(Slytherin person) {
        System.out.println(" Информация о студенте: имя: " + person.getNameSurname() + " факультет: Slytherin{" +
                " powerMagic=" + person.getPowerMagic() +
                ", disanceTransgression=" + person.getDistanceTransgression() +
                ", cunning=" + person.getCunning() +
                ", determination=" + person.getDetermination() +
                ", ambition=" + person.getAmbition() +
                ", resourcefulness=" + person.getResourcefulness() +
                ", authoritativeness=" + person.getAuthoritativeness() +
                '}');

    }

}