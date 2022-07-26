package pet;

public class Spider extends WildAnimal
{

    public Spider()
    {
    }

    public Spider(String classification, boolean poison, int registirationId, String breed, String sex, int age, double height, double exeminationPrice)
    {
        super(classification, poison, registirationId, breed, sex, age, height, exeminationPrice);
    }

    @Override
    public void calculatePrice()
    {
        if (poison == true)
        {
            exeminationPrice *= 1.5;

        }
    }

}
