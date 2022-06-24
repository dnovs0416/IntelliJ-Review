package com.syntax.reviewclass8;

public class Doctor {

    public String firstName,lastName;
    protected String specialty;
    int experience;
    private double salary;

    public static String hospital;

    public Doctor(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    Doctor(String firstName,String lastName,String specialty,int experience){
        this(firstName, lastName);
        this.specialty=specialty;
        this.experience=experience;
    }

    public void printInfo(){
        System.out.println("Doctor name is "+firstName+" "+lastName+" and specialty is "+specialty);
    }

    //instance accessing both static and instance
    protected void work(){
        System.out.println("Doctor "+lastName+" works at "+hospital);
    }

    void treat(String patientName){
        this.printInfo();
        System.out.println(" Treats patient "+patientName);
    }

    private void getPaid(){
        System.out.println("Doctor "+lastName+" gets paid "+salary);
    }

    //static methods can work only with static variables and methods
    public static void study(String university){
        //printInfo(); CE: Non-static method 'printInfo()' cannot be referenced from a static context
        System.out.println("Doctor studies at "+university+" and now works at "+hospital);
    }

}
