public class Cactus extends Plant{

    protected String spines;



    public Cactus(final String color,
                  final String specie,
                  final double height,
                  final int age,
                  final String spines
                  ) {

        super(color, specie, height, age);
        this.age = age;
        this.spines = spines;

    }

    public String getSpines() {
        return spines;
    }

    public void setSpines(String spines) {
        this.spines = spines;
    }

    public String getColor() {
        return null;
    }
    public void setColor(String color) {

    }

    public String getSpecie() {
        return null;
    }

    public void setSpecie(String specie) {

    }

    public double getHeight() {
        return 0;
    }

    public void setHeight(double height) {

    }

    public int getAge() {
        return 0;
    }

    public void setAge(int age) {

    }
}
