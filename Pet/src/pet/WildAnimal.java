package pet;

import java.util.Scanner;

public abstract class WildAnimal extends Animal
{

    protected String classification;
    protected boolean poison;

    public WildAnimal()
    {

    }

    public WildAnimal(String classification, boolean poison, int registirationId, String breed, String sex, int age, double height, double exeminationPrice)
    {
        super(registirationId, breed, sex, age, height, exeminationPrice);
        this.classification = classification;
        this.poison = poison;
    }

    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your wild animal's classification: ");
        classification = sc.nextLine();
    }

    @Override
    public abstract void calculatePrice();

}
