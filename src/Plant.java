public abstract class Plant {

    protected String color;
    protected String specie;
    protected double height;
    protected int age;

    public Plant(String color, String specie, double height, int age) {
        this.color = color;
        this.specie = specie;
        this.height = height;
        this.age = age;
    }

    public abstract String getColor();


    public abstract void setColor(String color);

    public abstract String getSpecie();

    public abstract void setSpecie(String specie);

    public abstract double getHeight();

    public abstract void setHeight(double height);

    public abstract int getAge();

    public abstract void setAge(int age);
}
