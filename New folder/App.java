class App {
    public static void main(String[] args) {
         
        Account akshayAccount = new Account();
        akshayAccount.balance = 1000;
        System.out.println(akshayAccount.balance);
        System.out.println(Account.bankName);


        Account.bankName = "ABHZ";

        Account shaAccount = new Account();
        shaAccount.balance = 2000;
        System.out.println(shaAccount.balance);
        System.out.println(Account.bankName);
    }
}