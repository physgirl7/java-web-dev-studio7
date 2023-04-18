package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisk implements OpticalDisk {

    public CD(String aName, int maxStorage, int currentStorage, ArrayList<String> aContents, String aDiskType){
        super(aName,maxStorage,currentStorage,aContents,aDiskType);
    }

    @Override
    public void spinDisk() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }

    @Override
    public void readData() {
        System.out.println("The CD data has now been read.");

    }

    @Override
    public void writeData(String data, int storageNeededForData) {
        if ((getMaximumStorageCapacity() - getCurrentStorageCapacity()) >= storageNeededForData) {
            System.out.println("CD data has been written");
        } else {
            System.out.println("CD data could not be written; not enough storage capacity");
        }
    }



    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
