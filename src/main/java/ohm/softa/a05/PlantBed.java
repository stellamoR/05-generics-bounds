package ohm.softa.a05;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Plant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class PlantBed<T> {
    private ArrayList<T> plants;
    public PlantBed() {
        plants = new ArrayList<>();
    }
    public void add(T plant){
        plants.add(plant);
    }
    public int size(){
        return plants.size();
    }
    public T remove(){
        return plants.remove(0);
    }
    public ArrayList<T> getPlantsByColor(PlantColor filtercolor){
        return (ArrayList<T>) plants.stream()
                .filter(pl -> {
                                if(pl instanceof Plant)
                                    return ((Plant)pl).getColor() == filtercolor;
                                return false;
                            })
                .collect(Collectors.toList());
    }
}
