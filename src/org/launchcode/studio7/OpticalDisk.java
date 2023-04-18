package org.launchcode.studio7;

public interface OpticalDisk {
    void spinDisk();
    void readData();
    void writeData(String data, int storageNeeded);
}
