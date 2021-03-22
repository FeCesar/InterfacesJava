package app;

import services.ContractService;
import services.OnlinePaymentService;
import services.PagSecurityService;
import services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;


public class App {
    
    public static void main(String[] args) throws ParseException{

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();

        System.out.print("Date: (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());

        System.out.print("Contract value: R$");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter number of installments: ");
        int plots = sc.nextInt();

        System.out.print("Enter the payment service: (pagsecurity/paypal)? ");
        String paymentServiceUser = sc.next();

        OnlinePaymentService paymentService;

        switch(paymentServiceUser){
            case "paypal":
                paymentService = new PagSecurityService();
            
            case "pagsecurity":
                paymentService = new PaypalService();

            default:
                paymentService = new PaypalService();

        }

        
        ContractService cs = new ContractService(paymentService);

        cs.processContract(contract, plots);

        System.out.println("Installments");

        for (Installment it : contract.getInstallments()){
            System.out.println(it.toString());
        }


        sc.close();

    }

}
