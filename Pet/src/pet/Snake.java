package pet;

public class Snake extends WildAnimal
{

    public Snake()
    {

    }

    public Snake(String classification, boolean poison, int registirationId, String breed, String sex, int age, double height, double exeminationPrice)
    {
        super(classification, poison, registirationId, breed, sex, age, height, exeminationPrice);
    }

    @Override
    public void calculatePrice()
    {
        if (poison == true)
        {
            exeminationPrice *= 2;
        }
    }

}
