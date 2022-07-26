package pet;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Animal
{

    protected int registirationId;
    protected String breed;
    protected String sex;
    protected int age;
    protected double weight;
    protected double height;
    protected ArrayList<Owner> owners = new ArrayList();
    protected double exeminationPrice;
    protected int numOfAnimal = 0;

    public Animal() {
    }


    public Animal(int registirationId, String breed, String sex, int age, double height, double exeminationPrice)
    {
        this.registirationId = registirationId;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.exeminationPrice = 200;
        numOfAnimal++;
    }

    //getter setter duruma göre
    public boolean checkId(int regId)
    {
        if (registirationId == regId)
        {
            System.out.println("This registration id exist in our system!");
            return true;
        }
        return false;
    }

    public void setRegistirationId(int registirationId) {
        this.registirationId = registirationId;
    }

    public int getRegistirationId() {
        return registirationId;
    }

    public int getNumOfAnimal() {
        return numOfAnimal;
    }
    

    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your animal's breed: ");
        breed = sc.nextLine();
        System.out.print("Enter your animal's sex: ");
        sex = sc.next();
        System.out.print("Enter your animal's age: ");
        age = sc.nextInt();
        System.out.print("Enter your animal's weight: ");
        weight = sc.nextDouble();
        System.out.print("Enter your animal's height: ");
        height = sc.nextDouble();
    }

    @Override
    public String toString()
    {
        return "Animal Information\n" + "RegistirationId=" + registirationId + "\nBreed=" + breed + "\nSex=" + sex + "\nAge=" + age + "\nWeight=" + weight + "\nHeight=" + height + "\n";
    }

    public abstract void calculatePrice();
    

}
