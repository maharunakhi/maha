/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_code;

import java.io.*;
import java.util.*;

class Appointment implements Serializable {
    private Patient patient;
    private Doctor doctor;
    private String appointmentDate;

    public Appointment(Patient patient, Doctor doctor, String appointmentDate) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Appointment [Doctor: " + doctor.getName() + ", Patient: " + patient.getName() + ", Date: " + appointmentDate + "]";
    }

    public static void saveAppointment(Appointment appointment) {
        try (FileOutputStream fos = new FileOutputStream("appointments.txt", true);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(appointment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Appointment> getAllAppointments() {
        List<Appointment> appointments = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("appointments.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Appointment appointment = (Appointment) ois.readObject();
                    appointments.add(appointment);
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return appointments;
    }
}
