public class Nopal extends Cactus{

    protected String fruit;

    public Nopal(final String color,
                 final String specie,
                 final double height,
                 final int age,
                 final String spines,
                 final String fruit) {

        super(color, specie, height, age, spines);
        this.fruit = fruit;
    }

    public String getFruit() {
        return null;
    }
    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String toString() {
        return "Nopal{" +
                "fruit='" + fruit + '\'' +
                ", spines='" + spines + '\'' +
                ", color='" + color + '\'' +
                ", specie='" + specie + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }


}
