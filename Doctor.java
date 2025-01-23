package projects.HospitalSystemManagement;

import java.util.Scanner;

public class Doctor extends Hospital implements utility{
    
    String doctor_name;
    String doctor_contact;
    String doctor_speciality;
    int doctor_experience;
    double doctor_salary;
    int doctor_age;
    boolean isPrincipalDoctor;
    String doctor_timings;

    @Override
    public void get_details(){
        System.out.println("Doctor Name: " + doctor_name);
        System.out.println("Doctor Contact: " + doctor_contact);
        System.out.println("Doctor Age: " + doctor_age);
        System.out.println("Doctor Speciality: " + doctor_speciality);
        System.out.println("Doctor timings: " + doctor_timings);
        System.out.println("Doctor Salary: " + doctor_salary);
        System.out.println("Hospital Doctor Working With: " + hospital_name);
        System.out.println("Is Doctor a Principal Doctor in Hospital: " + isPrincipalDoctor);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================ ** ENTER DOCTOR DETAILS ** ================");
        System.out.println();
        System.out.print("Enter Doctor Name: ");
        doctor_name = sc.nextLine();
        System.out.print("Enter Doctor Contact: ");
        doctor_contact = sc.nextLine();
        System.out.print("Enter Doctor Speciality: ");
        doctor_speciality = sc.nextLine();
        System.out.print("Enter Doctor Experience (in years)");
        doctor_experience = sc.nextInt();
        System.out.print("Enter Doctor Salary: ");
        doctor_salary = sc.nextDouble();
        System.out.print("Enter Doctors Timing: ");
        doctor_timings = sc.nextLine();
        System.out.print("Enter the Name of Hospital Doctor Working With: ");
        hospital_name = sc.nextLine();
        System.out.print("Enter Doctor Age: ");
        doctor_age = sc.nextInt();
        System.out.print("Does Doctor is a principal doctor for any hospital? ");
        isPrincipalDoctor = sc.nextBoolean();
    }
}
