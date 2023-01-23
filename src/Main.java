public class Main {
    public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
     bankAccount.deposit(20000);

     while (true){


         try {
             bankAccount.withDraw(6000);

         } catch (LimitException LimitException) {
             System.out.println(LimitException.getMessage());
             System.out.println("Ваш текущий счет -" + bankAccount.getAmount());
             System.out.println("Мы сняли всю ту сумму с вашего счета в размере -" + bankAccount.getAmount ()
                                      + "сом");
             

             }


         }
     }
    }
}