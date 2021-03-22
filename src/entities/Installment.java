package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

    // Atributos
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dueDate;
    private Double amount;

    // Constructor
    public Installment(){}
    public Installment(Date dueDate, Double amount){
        this.dueDate = dueDate;
        this.amount = amount;
    }

    // Getters
    public Date getDueDate(){
        return this.dueDate;
    }
    public Double getAmount(){
        return this.amount;
    }

    // Setters
    public void setDueDate(Date dueDate){
        this.dueDate = dueDate;
    }
    public void setAmount(Double amount){
        this.amount = amount;
    }

    // toString
    public String toString(){
        return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
    }

}
