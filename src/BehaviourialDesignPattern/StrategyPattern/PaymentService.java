package BehaviourialDesignPattern.StrategyPattern;


interface PaymentStrategy{
    void processPayment();
}
//......................................................................
class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Paying with credit card");
    }
}

class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Paying with debit card");
    }
}


public class PaymentService {
   private PaymentStrategy paymentStrategy;

   void setPaymentStrategy(PaymentStrategy paymentStrategy){
       this.paymentStrategy = paymentStrategy;
   }
   void pay(){
       paymentStrategy.processPayment();
   }

    static void main() {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.pay();
    }
}