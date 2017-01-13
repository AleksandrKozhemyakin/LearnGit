package javaappl;

/**
 * Created by александр on 13.01.2017.
 */
public class TaxPayer extends Person{
    int salary;
    int savings;
    void income(){
        savings+=salary;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Savings: " + this.savings + " and Salary: " + this.salary);
    }
}
