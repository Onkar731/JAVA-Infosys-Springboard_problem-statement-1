import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // creating object of customer details
        CustomerDetails cd = new CustomerDetails();

        // accepting customer details from the user
        String name = sc.nextLine();
        long mob = sc.nextLong();
        sc.nextLine();
        String address = sc.nextLine();
        int items = sc.nextInt();
        double cost = sc.nextDouble();

        // passing values to setters
        cd.setCustomerName(name);
        cd.setCustomerMobileNo(mob);
        cd.setCustomerAddress(address);
        cd.setItems(items);
        cd.setCost(cost);

        // getting all customer details and printing it on console
        System.out.println("Name : " + cd.getCustomerName());
        System.out.println("Mobile : " + cd.getCustomerMobileNo());
        System.out.println("Address : " + cd.getCustomerAddress());
        System.out.println("Items : " + cd.getItems());

        // calculating bill amount
        double bilAmount = cd.getItems() * cd.getCost();

        System.out.println("Bill Amount : " + bilAmount);





    }
}
