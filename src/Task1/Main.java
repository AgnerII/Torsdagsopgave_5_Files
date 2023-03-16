package Task1;

import Task1.Customer;

import java.util.ArrayList;
public class Main {
    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void main(String[] args){
        customers.add(new Customer("Hans","Larsen","hansi",1));
        customers.add(new Customer("Jens","Jørgensen","jensi",2));
        customers.add(new Customer("Børge","Mathiassen","Matti",3));
        customers.add(new Customer("Lisa","Hansen","lisahansen",4));
        customers.add(new Customer("Jytte","Rolli","rolli20",5));
        customers.add(new Customer("Robin","Jensen","robinho",6));

        printCustomers();

    }
    public static void printCustomers(){
        for (Customer c:customers) {
            System.out.println(c);
        }
    }
}