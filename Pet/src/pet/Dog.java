package pet;

import java.util.Scanner;

public class Dog extends Pet
{

    private String trained;

    public Dog(String trained, String isSpayed, int registirationId, String breed, String sex, int age, double height, double exeminationPrice)
    {
        super(isSpayed, registirationId, breed, sex, age, height, exeminationPrice);
        this.trained = trained;
    }
    public Dog(){
        
    }
    public void getInput()
    {
        Scanner input = new Scanner(System.in);

        super.getInput();
        System.out.print("Is trained? ");
        trained = input.nextLine();
    }

    @Override
    public String toString()
    {
        return super.toString() + "Is trained=  " + trained + '\n';
    }

    @Override
    public void calculatePrice()
    {
        this.exeminationPrice = 250;

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 

    @Override
    public int getNbOfVaccination()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String makeSound()
    {
        return "Hav Haow";
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
