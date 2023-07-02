package ohm.softa.a05.utils;

import ohm.softa.a05.PlantBed;

import java.util.ArrayList;

public abstract class PlantBedUtility {
    public <T> void repot(PlantBed<?extends T>prod, PlantBed<?super T> cons){
        T currElem;
        do{
            currElem = prod.remove();
            cons.add(currElem);
        }while(currElem != null);

    }
}
