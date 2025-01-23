package projects.HospitalSystemManagement;

import java.util.Scanner;

public class Inventory extends Hospital implements utility{
    
    String itemName;
    int quantityInStock;
    int reorderLevel;
    String supplier;
    String location;
    String category;
    
    @Override
    public void get_details(){
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Category: " + category);
        System.out.println("Quantity in Stock" + quantityInStock);
        System.out.println("Reorder Level: " + reorderLevel);
        System.out.println("Supplier Name: " + supplier);
        System.out.println("Hospital Available With: " + hospital_name);
        System.out.println("Location in Hospital: " + location);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================ ** ENTER INVENTORY DETAILS ** ================");
        System.out.println();
        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();
        System.out.print("Enter Item Category: ");
        category = sc.nextLine();
        System.out.print("Enter Quantity in Stock: ");
        quantityInStock = sc.nextInt();
        System.out.print("Enter Reorder Level: ");
        reorderLevel = sc.nextInt();
        System.out.print("Enter the Supplier Name: ");
        supplier = sc.nextLine();
        System.out.print("Enter the Hospital Name: ");
        hospital_name = sc.nextLine();
        System.out.print("Enter the Location in Hospital: ");
        location = sc.nextLine();
    }
}
