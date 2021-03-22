package entities;

import java.util.ArrayList;
import java.util.Date;

public class Contract{
    
    // Atributos
    private Integer number;
    private Date date;
    private Double totalValue;

    // Plots
    ArrayList<Installment> installments = new ArrayList<>();

    // Constructor
    public Contract(){}

    public Contract(Integer number, Date date, Double totalValue){
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    // Getters
    public Integer getNumber(){
        return this.number;
    }
    public Date getDate(){
        return this.date;
    }
    public Double getTotalValue(){
        return this.totalValue;
    }
    public ArrayList<Installment> getInstallments(){
        return this.installments;
    }

    // Setters
    public void setNumber(Integer number){
        this.number = number;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void setTotalValue(Double totalValue){
        this.totalValue = totalValue;
    }

}