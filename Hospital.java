package projects.HospitalSystemManagement;

import java.util.Scanner;

public class Hospital implements utility{
    
    String hospital_name;
    String hospital_address;
    String hospital_director;
    int numberOfEmployees;
    int numberOfDoctors;
    int numberofBeds;
    boolean isCriticalTreatment;

    @Override
    public void get_details(){
        System.out.println("Hospital Name: " + hospital_name);
        System.out.println("Hospital Address: " + hospital_address);
        System.out.println("Hospital Director: " + hospital_director);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Number of Doctors: " + numberOfDoctors);
        System.out.println("Number of Beds: " + numberofBeds);
        System.out.println("Critical Treatment Available:" + isCriticalTreatment);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================ ** ENTER HOSPITAL DETAILS ** ================");
        System.out.println();
        System.out.print("Enter Hospital Name: ");
        hospital_name = sc.nextLine();
        System.out.print("Enter Hospital Address: ");
        hospital_address = sc.nextLine();
        System.out.print("Enter Hospital Director Name: ");
        hospital_director = sc.nextLine();
        System.out.print("Enter Number of Employees: ");
        numberOfEmployees = sc.nextInt();
        System.out.print("Enter the Number of Doctors Attending: ");
        numberOfDoctors = sc.nextInt();
        System.out.print("Enter the Number of Beds Available: ");
        numberofBeds = sc.nextInt();
        System.out.print("Does Hospital Provides Critical Treatment: ");
        isCriticalTreatment = sc.nextBoolean();
    }
}