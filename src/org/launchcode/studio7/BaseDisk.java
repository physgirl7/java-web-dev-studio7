package org.launchcode.studio7;

import java.util.*;

public abstract class BaseDisk {

    private String name;
    private int maximumStorageCapacity;
    private int currentStorageCapacity;
    private ArrayList<String> contents;
    private String diskType;


    public BaseDisk(){
        this.name = "MyDisk";
        this.maximumStorageCapacity = 64;
        this.currentStorageCapacity = 64;
        this.diskType = "DVD";
    }
    public BaseDisk(String aName, int maxStorage, int currentStorage, ArrayList<String> aContents, String aDiskType){
        this.name = aName;
        this.maximumStorageCapacity = maxStorage;
        this.currentStorageCapacity = currentStorage;
        this.contents = aContents;
        this.diskType = aDiskType;
    }

    @Override
    public String toString() {
        return "BaseDisk{" +
                "name='" + name + '\'' +
                ", maximumStorageCapacity=" + maximumStorageCapacity +
                ", currentStorageCapacity=" + currentStorageCapacity +
                ", contents=" + contents +
                ", diskType='" + diskType + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getMaximumStorageCapacity(){
        return maximumStorageCapacity;
    }

    public int getCurrentStorageCapacity(){
        return currentStorageCapacity;
    }

    public ArrayList<String> getContents(){
        return contents;
    }

    public String getDiskType(){
        return diskType;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setMaximumStorageCapacity(int newStorageCapacity){
        this.maximumStorageCapacity = newStorageCapacity;
    }
    public void setCurrentStorageCapacity(int newCurrentStorageCapacity){
        this.currentStorageCapacity = newCurrentStorageCapacity;
    }
    public void setContents(ArrayList<String> newContents){
        this.contents = newContents;
    }

    public void setDiskType(String newDiskType){
        this.diskType = newDiskType;
    }
}
