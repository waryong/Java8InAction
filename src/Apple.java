/**
 * Created by waryong on 15. 9. 29..
 */
public class Apple {

    private Integer weight;
    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public Apple() {
    }

    public Apple(String name, Integer weight, String color) {
        this.weight = weight;
        this.color = color;

        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple(Integer weight, String color) {
        this.weight = weight;
        this.color = color;

    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
