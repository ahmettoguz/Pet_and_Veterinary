
package pet;

import java.util.ArrayList;
import java.util.Scanner;


public class AnimalSys
{
    public static ArrayList<Animal> animals = new ArrayList();
    public static ArrayList<Animal> days = new ArrayList();
    public static int nbOfAnimals = 0;
    public static int lastUsedId = 90;
    

    public static void addAnimal()
    {
        Scanner sc = new Scanner(System.in);
        int registirationId;
        String type;

        System.out.print("Enter your animals type (Cat / Dog / Bird / Stop): ");
        type = sc.next();
        while (!type.equalsIgnoreCase("stop"))
        {

            if (type.equalsIgnoreCase("dog"))
            {
                Dog temp = new Dog();
                System.out.print("Enter the registiration id: ");
                registirationId = sc.nextInt();

                if (!checkIDs(registirationId))
                {

                    temp.setRegistirationId(registirationId);
                    temp.getInput();
                    animals.add(temp);
                    nbOfAnimals++;
                    System.out.println("Animal is added.");
                }

            } else if (type.equalsIgnoreCase("cat"))
            {
                Cat temp = new Cat();
                System.out.print("Enter the registiration id: ");
                registirationId = sc.nextInt();

                if (!checkIDs(registirationId))
                {

                    temp.setRegistirationId(registirationId);
                    temp.getInput();
                    animals.add(temp);
                    nbOfAnimals++;
                    System.out.println("Animal is added.");
                }
            } else if (type.equalsIgnoreCase("bird"))
            {
                Bird temp = new Bird();
                System.out.print("Enter the registiration id: ");
                registirationId = sc.nextInt();

                if (!checkIDs(registirationId))
                {
                    temp.setRegistirationId(registirationId);
                    temp.getInput();
                    animals.add(temp);
                    nbOfAnimals++;
                    System.out.println("Animal is added.");

                }
            } else if (type.equalsIgnoreCase("snake"))
            {
                Snake temp = new Snake();
                System.out.println("Enter the registiration id: ");
                registirationId = sc.nextInt();

                if (!checkIDs(registirationId))
                {
                    temp.setRegistirationId(registirationId);
                    temp.getInput();
                    animals.add(temp);
                    nbOfAnimals++;
                    System.out.println("Animal is added.");
                }

            } else if (type.equalsIgnoreCase("Spider"))
            {
                Spider temp = new Spider();
                System.out.println("Enter the registiration id: ");
                registirationId = sc.nextInt();
                if (!checkIDs(registirationId))
                {
                    temp.setRegistirationId(registirationId);
                    temp.getInput();
                    animals.add(temp);
                    nbOfAnimals++;
                    System.out.println("Animal is added.");
                }
            }
        }

        System.out.print("\nEnter your animals type (Cat / Dog / Bird / Stop): ");
        type = sc.next();
    }

    public static boolean checkIDs(int id)
    {
        for (Animal a : animals)
        {
            if (a.checkId(id))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean removeAnimal(int id)
    {
        for (int i = 0; i < animals.size(); i++)
        {
            if (animals.get(i).getRegistirationId() == id)
            {
                animals.remove(i);
                return true;
            }
        }
        return false;
    }

    public static Animal searchAnimal(int id)
    {
        for (int i = 0; i < animals.size(); i++)
        {
            if (animals.get(i).getRegistirationId() == id)
            {
                return animals.get(i);
            }
        }
        return null;
    }

    public static String display()
    {
        String rs = "";
        for (int i = 0; i < animals.size(); i++)
        {
            rs += animals.get(i).toString() + "\n";
        }
        return rs;
    }

    public static int nbOfAnimals()
    {
        return nbOfAnimals;
    }

    public static String[] ownerName()
    {
        String[] names = new String[animals.size()];
        for (int i = 0; i < animals.size(); i++)
        {
            names[i] = animals.get(i).owners.get(i).getNameSurname();
        }
        return names;
    }
}
