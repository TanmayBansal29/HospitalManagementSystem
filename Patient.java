package projects.HospitalSystemManagement;

import java.util.Scanner;

public class Patient extends Doctor implements utility{
    
    String patient_name;
    String patient_contact;
    int patient_age;
    String patient_gender;
    boolean isPatientAdmitted;
    String patient_diagnosis;
    boolean isPatientInsured;

    @Override
    public void get_details(){
        System.out.println("Patient Name: " + patient_name);
        System.out.println("Patient Contact: " + patient_contact);
        System.out.println("Patient Age: " + patient_age);
        System.out.println("Patient Gender: " + patient_gender);
        System.out.println("Patient Problem: " + patient_diagnosis);
        System.out.println("Hospital Treatment Going on: " + hospital_name);
        System.out.println("Doctor Attending: " + doctor_name);
        System.out.println("Is Patient Admitted: " + isPatientAdmitted);
        System.out.println("Is Patient Insured: " + isPatientInsured);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================ ** ENTER PATIENT DETAILS ** ================");
        System.out.println();
        System.out.print("Enter Patient Name: ");
        patient_name = sc.nextLine();
        System.out.print("Enter Patient Contact: ");
        patient_contact = sc.nextLine();
        System.out.print("Enter Patient Age: ");
        patient_age = sc.nextInt();
        System.out.print("Enter Patient Gender: ");
        patient_gender = sc.nextLine();
        System.out.print("Enter Patient Problem: ");
        patient_diagnosis = sc.nextLine();
        System.out.print("Enter the Name of Hospital Patient Visited: ");
        hospital_name = sc.nextLine();
        System.out.print("Enter the Name of Doctor attended Patient: ");
        doctor_name = sc.nextLine();
        System.out.print("Does Patient got Admiited? ");
        isPatientAdmitted = sc.nextBoolean();
        System.out.print("Does Patient is having Insurance? ");
        isPatientInsured = sc.nextBoolean();
    }
}
