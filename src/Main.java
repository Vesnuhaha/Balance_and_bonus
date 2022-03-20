public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        // входные данные
        int amount = 1500;
        int current_account = 200;

        // логика программы
        int bonus;
        if (amount >= 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int balance = amount + current_account + bonus;

        System.out.println("Ваш бонус составит:" + bonus);
        System.out.println("Ваш текущий баланс:" + balance);

    }
}

