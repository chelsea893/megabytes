package com.company;

public class Main {

    public static void printMegaBytesAndKiloBytes() {
        int kiloBytes = 2500;
        if (kiloBytes > 0) {
            int YY = kiloBytes / 1024;
            int ZZ = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB=" + YY + "MB and " + ZZ + "KB");
        }else{
            System.out.println("invalid value");
        }


    }
}
