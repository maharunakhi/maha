/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_code;

import java.io.Serializable;

abstract class Doctor implements Serializable {
    private String name;
    private String specialization;
    private String availability;

    public Doctor(String name, String specialization, String availability) {
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public abstract void displayAvailability();
}
class GeneralPractitioner extends Doctor {

    public GeneralPractitioner(String name, String availability) {
        super(name, "General Practitioner", availability);
    }

    @Override
    public void displayAvailability() {
        System.out.println("Dr. " + getName() + " (General Practitioner) is available for walk-ins: " + getAvailability());
    }
}

class Specialist extends Doctor {

    public Specialist(String name, String specialization, String availability) {
        super(name, specialization, availability);
    }

    @Override
    public void displayAvailability() {
        System.out.println("Dr. " + getName() + " (Specialist in " + getSpecialization() + ") requires an appointment: " + getAvailability());
    }
}
