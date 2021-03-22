package services;

public class PagSecurityService implements OnlinePaymentService{

    // Atributos
    public static final double PAYMENT_FEE = 0.03;
    public static final double MONTHLY_INTEREST = 0.03;

    // Métodos
    @Override
    public double paymentFee(double amount){
        return amount * PAYMENT_FEE;
    }

    @Override
    public double interest(double amount, int months){
        return amount * (months * MONTHLY_INTEREST);
    }



}