package pet;

import java.util.Scanner;

public class Bird extends Pet
{

    private String beakType;

    public Bird(String beakType, String isSpayed, int registirationId, String breed, String sex, int age, double height, double exeminationPrice)
    {
        super(isSpayed, registirationId, breed, sex, age, height, exeminationPrice);
        this.beakType = beakType;
    }
    public Bird(){
        
    }

    public void getInput()
    {
        Scanner input = new Scanner(System.in);

        super.getInput();
        System.out.print("Enter beak type: ");
        beakType = input.nextLine();
    }

    @Override
    public String toString()
    {
        return super.toString() + "Beak Type= " + beakType + '\n';
    }

    @Override
    public int getNbOfVaccination()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calculatePrice()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String makeSound()
    {
        return "Cik Cik";
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
