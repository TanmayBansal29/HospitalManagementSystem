package projects.HospitalSystemManagement;

import java.util.Scanner;

interface utility  {
    public void get_details();
    public void set_details();
}

public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("==================== *** WELCOME TO HOSPITAL MANAGEMENT SYSTEM *** ====================");
        System.out.println();
        System.out.println("1. Add Hospital Details \t\t\t 2. Add Doctor Details");
        System.out.println();
        System.out.println("3. Add Patient Details \t\t\t\t 4. Add Items to Inventory");
        System.out.println();
        System.out.println("5. Get Hospital Details \t\t\t 6. Get Doctor Details");
        System.out.println();
        System.out.println("7. Get Patient Details \t\t\t\t 8. Get Inventory Details");
        System.out.println();
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospitals[] = new Hospital[10];
        Doctor doctors[] = new Doctor[10];
        Inventory inventory[] = new Inventory[10];
        Patient patients[] = new Patient[10];

        int hospital_counter = 0;
        int patient_counter = 0;
        int item_counter = 0;
        int doctor_counter = 0;

        int choice = 100;
        while(choice != 0){
            main_menu();
            choice = sc.nextInt();

            while(choice != 9 && choice != 0){
                switch (choice) {
                    case 1:
                        hospitals[hospital_counter] = new Hospital();
                        hospitals[hospital_counter].set_details();
                        hospital_counter++;
                        System.out.println();
                        System.out.println("1. Add New Hospital");
                        System.out.println("9. Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;
                    
                    case 2:
                        doctors[doctor_counter] = new Doctor();
                        doctors[doctor_counter].set_details();
                        doctor_counter++;
                        System.out.println();
                        System.out.println("1. Add New Doctor");
                        System.out.println("9. Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        patients[patient_counter] = new Patient();
                        patients[patient_counter].set_details();
                        patient_counter++;
                        System.out.println();
                        System.out.println("1. Add New Doctor");
                        System.out.println("9. Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        inventory[item_counter] = new Inventory();
                        inventory[item_counter].set_details();
                        item_counter++;
                        System.out.println();
                        System.out.println("1. Add New Doctor");
                        System.out.println("9. Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for(int i = 0; i < hospital_counter; i++){
                            hospitals[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0. Exit");
                        System.out.println("9. Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for(int i = 0; i < doctor_counter; i++){
                            doctors[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0. Exit");
                        System.out.println("9. Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 7:
                        for(int i = 0; i < patient_counter; i++){
                            patients[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0. Exit");
                        System.out.println("9. Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 8:
                        for(int i = 0; i < item_counter; i++){
                            inventory[i].get_details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0. Exit");
                        System.out.println("9. Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;
                }
            }
        }
    }
}
