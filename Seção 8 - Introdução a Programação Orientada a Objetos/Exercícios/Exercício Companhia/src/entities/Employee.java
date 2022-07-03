package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double taxPercentage;

    public void NetSalary(){
        System.out.println("Employee: " + name + ", $ " + ( grossSalary - (grossSalary * (taxPercentage/100))));
    }

    public double increaseSalary(double taxPercentage){
        this.taxPercentage += taxPercentage;
        return taxPercentage;
    }
}
