package Decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Client {
    public void main() throws IOException {
        IAircraft simpleBoeing = new Boeing747();
        IAircraft luxuriousBoeing = new LuxuryFittings(simpleBoeing);
        IAircraft bulletProofBoeing = new BulletProof(luxuriousBoeing);
        float netWeight = bulletProofBoeing.getWeight();
        System.out.println("Final weight of the plane: " + netWeight);


        // Other Examples
        // FileInputStream is responsible for reading the file
        FileInputStream fileInputStream = new FileInputStream("myFile.txt");
        // BufferedInputStream extends FilterInputStream and not FileInputStream, it is
        // a decorator which enhances the functionality of the original object by wrapping over it.
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        // The read operation becomes buffered now
        bufferedInputStream.read();
    }
}
