package FactoryMethodPattern;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
    public void main() {

        // We instantiate from a concrete class, thus tying
        // ourselves to it
        /*
        F16 f16 = new F16();
        f16.fly();
        */

        Collection<F16> myAirForce = new ArrayList<>();
        F16 f16A = new F16A();
        F16 f16B = new F16B();
        myAirForce.add(f16A);
        myAirForce.add(f16B);

        for (F16 f16 : myAirForce) {
            f16.fly();
        }
    }
}
