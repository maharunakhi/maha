/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_code;

import java.io.Serializable;

class Patient implements Serializable {
    private String name;
    private int age;
    private String contactInfo;

    public Patient(String name, int age, String contactInfo) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}
