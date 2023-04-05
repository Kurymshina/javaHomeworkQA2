public class ProgramBonus {
    public static void main(String[] args) {

        double price = (Math.random() * ((90000 - 1) + 1)) + 1;
        int rub = 20;
        int bonus = (int) (price / rub);

        String mile = " миль";

        boolean isMilya = bonus == 1 || bonus % 10 == 1;
        boolean isNotMil = !(bonus % 100 == 11);
        boolean isMiles = bonus % 10 == 2 || bonus % 10 == 3 || bonus % 10 == 4;

        if (isMilya && isNotMil) {
            mile = " миля";
        }

        if (isMiles && isNotMil) {
            mile = " мили";
        }

        System.out.println("На вашем счету " + bonus + mile);
    }
}