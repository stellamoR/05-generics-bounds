package ohm.softa.a05.model;

public abstract class Plant {
    private double height;
    private String family;
    private String name;
    private final PlantColor color;

    public Plant(double height, String family, String name, PlantColor color) {
        this.height = height;
        this.family = family;
        this.name = name;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public PlantColor getColor(){
        return this.color;
    }
}
