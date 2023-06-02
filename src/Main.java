public class Main {
    public static void main(String[] args) {

        int ticket = 25000; // стоимость билета
        int mile = 20; // кол-во руб для 1 бонусной мили
        int bonus = ticket / mile; // кол-во бонусных миль

        System.out.println(bonus);
    }
}
