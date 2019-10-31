public class User
{

    private int age;
    private double weight;
    private double lenght;
    private String gender;
    private String name;
    private String userName;


    public User (int age,double weight,double lenght, String gender, String name, String userName)
    {
        this.age=age;
        this.weight=weight;
        this.lenght=lenght;
        this.gender=gender;
        this.name=name;
        this.userName=userName;

    }



    public String getGender()
    {
        return gender;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getName()
    {
        return name;
    }

    public String getUserName()
    {
        return userName;
    }

    public double getLenght()
    {
        return lenght;
    }


}
