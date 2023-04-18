package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisk implements OpticalDisk {

    public DVD(String aName, int maxStorage, int currentStorage, ArrayList<String> aContents, String aDiskType){
        super(aName,maxStorage,currentStorage,aContents,aDiskType);
    }

    @Override
    public void spinDisk() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm");

    }

    @Override
    public void readData() {
        System.out.println("The DVD data has now been read.");

    }


    public void writeData(String data, int storageNeededForData) {
        if ((getMaximumStorageCapacity() - getCurrentStorageCapacity()) >= storageNeededForData) {
            System.out.println("DVD data has been written");
        } else {
            System.out.println("DVD data could not be written; not enough storage capacity");
        }
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
