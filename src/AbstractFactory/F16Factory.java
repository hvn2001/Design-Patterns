package AbstractFactory;

public class F16Factory implements IAircraftFactory {
    public IEngine createEngine() {
        return new F16Engine();
    }

    public IWings createWings() {
        return new F16Wings();
    }

    public ICockpit createCockpit() {
        return new F16Cockpit();
    }
}
