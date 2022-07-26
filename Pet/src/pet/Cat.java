package pet;

import java.util.Scanner;

public class Cat extends Pet
{

    private int nbOfVaccination;

    public Cat(int nbOfVaccination, String isSpayed, int registirationId, String breed, String sex, int age, double height, double exeminationPrice)
    {
        super(isSpayed, registirationId, breed, sex, age, height, exeminationPrice);
        this.nbOfVaccination = nbOfVaccination;
    }
    public Cat(){
        
    }

    public void GetInput()
    {
        Scanner input = new Scanner(System.in);

        super.getInput();
        System.out.print("Enter number of vaccination: ");
        nbOfVaccination = input.nextInt();
    }

    @Override
    public String toString()
    {
        return  super.toString() + "Vaccination Number= " + nbOfVaccination + "\n";
    }

    @Override
    public int getNbOfVaccination()
    {
        return nbOfVaccination;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calculatePrice()
    {
        exeminationPrice = 240 + nbOfVaccination * 100;

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String makeSound()
    {
        return "Miyavv";
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
