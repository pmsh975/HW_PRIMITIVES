public class Main {
    public static void main(String[] args) {

        int ticket = 13676; // стоимость билета

        int money = 20; // количество рублей для одной бонусной мили

        int bonus = ticket / money; // кол-во бонусных миль

        System.out.println("Вам начислено: " + bonus + " бонусных миль(и)");
        
    }
}
