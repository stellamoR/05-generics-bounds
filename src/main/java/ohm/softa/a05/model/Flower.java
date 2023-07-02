package ohm.softa.a05.model;

public class Flower extends Plant implements Comparable<Flower>{
    public Flower(double height, String family, String name, PlantColor color) {
        super(height, family, name, color);
        if(color == PlantColor.GREEN)
            throw new RuntimeException("Wrong Color, Flowers can not be GREEN!");
    }

    @Override
    public int compareTo(Flower o){
        if(o.getHeight() > this.getHeight()){
            return -1;
        }
        if(o.getHeight() == this.getHeight()){
            return 0;
        }
        return 1;
    }
}
