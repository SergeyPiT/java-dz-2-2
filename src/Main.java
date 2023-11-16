public class Main {
    public static void main(String[] args) {
        int balance = 250;
        int addBalance = 1650;
        int bonus = 100;
        int minAdd = 1000;

        int rubBonus;
        if (addBalance > minAdd) {
            rubBonus = addBalance / bonus;
            System.out.println("Вам начислено " + rubBonus + " бонусных рублей");
            System.out.println("Ваш баланс " + (rubBonus + balance) + " рублей");
        } else {
            System.out.println("Вам начислено 0 бонусных рублей");
            System.out.println("Ваш баланс " + balance + " рублей");
        }
    }
}