/**
 * Created by admin on 07.04.2017.
 */
public class Cat {
    String name;
    String color;
    int weight;

    public Cat(String _name, String _color, int _weight){
        name = _name;
        color = _color;
        weight = _weight;
    }

    public void info() {
        System.out.println(name + " " + color +" "+weight);
    }
}
