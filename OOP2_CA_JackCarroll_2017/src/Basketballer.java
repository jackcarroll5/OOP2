/*This class will set up a basketball player so it can be put into the driver*/

public class Basketballer {

    private String name;
    private int age;
    private double height;

    public Basketballer()
    {
        setName("Unknown");
        setAge(0);
        setHeight(0.0);
    }

    public Basketballer(String name, int age, double height)
    {
      setName(name);
      setAge(age);
      setHeight(height);
    }

    public double getHeight()
    {
        return height;
    }

    public String getName()
    {
        return name;
    }

    public int getAge() {

        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    public void setHeight(double height)
    {
        this.height = height;
    }

    public String toString()
    {
        return String.format("Name: %-5s \nAge: %-3d" + "years old" + " \nHeight: %.2f",getName(),getAge(),getHeight());
    }
}
