package pet;

import java.util.Scanner;

public abstract class Pet extends Animal implements Behavior
{

    protected String isSpayed;
    
    public Pet(){
        
    }

    public Pet(String isSpayed, int registirationId, String breed, String sex, int age, double height, double exeminationPrice)
    {
        super(registirationId, breed, sex, age, height, exeminationPrice);
        this.isSpayed = isSpayed;
    }

    public void getInput()
    {
        super.getInput();
        Scanner input = new Scanner(System.in);
        System.out.print("Is your pet spayed? ");
        isSpayed = input.nextLine();
    }

    public abstract int getNbOfVaccination();

    @Override
    public abstract void calculatePrice();

    @Override
    public abstract String makeSound();

    @Override
    public String toString()
    {
        
        return super.toString()+"Is Spayed= " + isSpayed + '\n';
    }
}
