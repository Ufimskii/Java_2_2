public class Main {
    public static void main(String[] args) {
        int account = 100;
        int transaction = 5000;
        int oneRubBonus = 100;
        int bonusRub;
        int totalAccount;

        if (transaction > 1000) {
            bonusRub = transaction / oneRubBonus;
            totalAccount = transaction + bonusRub + account;
        } else {
            bonusRub = 0;
            totalAccount = transaction + account;
        }

        System.out.println(totalAccount);
        System.out.println(bonusRub);

    }
}
