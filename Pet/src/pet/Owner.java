/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import java.util.Scanner;

/**
 *
 * @author tunac
 */
public class Owner {
    private String nameSurname;
    private String gender;//alması daha kolay diye yine string yaptım
    private String appointmentDate;//bunu int yerine string yaptım
    private String email;
    private int phoneNumber;

    public Owner() {
    }
    
    //getter setter duruma göre
    
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name and surname: ");
        nameSurname=sc.nextLine();
        sc.skip("\n");
        System.out.println("Enter your gender: ");
        gender=sc.next();
        System.out.println("Enter your Appointment Date: ");
        appointmentDate=sc.nextLine();
        System.out.println("Enter your mail address: ");
        email=sc.nextLine();
        System.out.println("Enter your phone number: ");
        phoneNumber=sc.nextInt();
    }

    public String getNameSurname() {
        return nameSurname;
    }
    

    @Override
    public String toString() {
        return "Owner's Information" + "\nName and Surname" + nameSurname + "\nGender=" + gender + "\nAppointmentDate=" + appointmentDate + "\nEmail Address=" + email + "\nPhone Number=" + phoneNumber;
    }
    
    
    
}
