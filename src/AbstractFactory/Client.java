package AbstractFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Client {
    /*
    public void main() {
        F16Cockpit f16Cockpit = new F16Cockpit();
        F16Engine f16Engine = new F16Engine();
        F16Wings f16Wings = new F16Wings();

        List<F16Engine> engines = new ArrayList<>();
        engines.add(f16Engine);
        for (F16Engine engine : engines) {
            engine.start();
        }
    }
    */
    /*
    public void main() {
        IEngine f16Engine = new F16Engine();
        List<IEngine> engines = new ArrayList<>();
        engines.add(f16Engine);
        for (IEngine engine : engines) {
            engine.start();
        }
    }
    */
    /*
    public void main(F16Factory f16Factory) {
        IEngine f16Engine = f16Factory.createEngine();
        List<IEngine> engines = new ArrayList<>();
        engines.add(f16Engine);
        for (IEngine engine : engines) {
            engine.start();
        }
    }
    */
    public void main() {

        // Instantiate a concrete factory for F-16
        F16Factory f16Factory = new F16Factory();

        // Instantiate a concrete factory for Boeing-747
        Boeing747Factory boeing747Factory = new Boeing747Factory();

        // Lets create a list of all our airplanes
        Collection<Aircraft> myPlanes = new ArrayList<>();

        // Create a new F-16 by passing in the f16 factory
        myPlanes.add(new Aircraft(f16Factory));

        // Create a new Boeing-747 by passing in the boeing factory
        myPlanes.add(new Aircraft(boeing747Factory));

        // Fly all your planes
        for (Aircraft aircraft : myPlanes) {
            aircraft.fly();
        }

    }
}
