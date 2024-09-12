/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_code;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class JAVA_code {

    public static void main(String[] args) {
        
         List<Doctor> doctors = new ArrayList<>();
        doctors.add(new GeneralPractitioner("John Doe", "9 AM - 5 PM"));
        doctors.add(new Specialist("Jane Smith", "Cardiologist", "By Appointment"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Doctors:");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println((i + 1) + ". Dr. " + doctors.get(i).getName() + " (" + doctors.get(i).getSpecialization() + ")");
        }

        System.out.println("\nEnter patient details to book an appointment:");
        System.out.print("Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Contact Info: ");
        String contactInfo = scanner.nextLine();

        Patient patient = new Patient(patientName, age, contactInfo);

        System.out.print("Choose a doctor (1 or 2): ");
        int doctorChoice = scanner.nextInt();
        Doctor selectedDoctor = doctors.get(doctorChoice - 1);

        scanner.nextLine(); 
        System.out.print("Enter appointment date (e.g., 2024-09-20): ");
        String appointmentDate = scanner.nextLine();

        Appointment appointment = new Appointment(patient, selectedDoctor, appointmentDate);
        Appointment.saveAppointment(appointment);

        System.out.println("Appointment booked successfully!");
        System.out.println(appointment);

        System.out.println("\nAll Appointments:");
        List<Appointment> appointments = Appointment.getAllAppointments();
        for (Appointment appt : appointments) {
            System.out.println(appt);
        }
    }
}
