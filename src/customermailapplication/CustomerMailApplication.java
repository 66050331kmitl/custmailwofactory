/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    private Customer customer;
    public void getCustomerTypeFromUser(String customerType) {
        customer = CustomerFactory.createCustomer(customerType);
    }
    public String generateMail() {
        return customer.createMail();
    }
    
    public static void main(String[] args) {
        CustomerMailApplication app = new CustomerMailApplication();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                app.getCustomerTypeFromUser("Regular");
                break;
            case 2:
                app.getCustomerTypeFromUser("Mountain");
                break;
            case 3:
                app.getCustomerTypeFromUser("Delinquent");
                break;
        }
        System.out.println(app.generateMail());
    }
}
