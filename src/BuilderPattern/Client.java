package BuilderPattern;

import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderImpl;

import javax.xml.parsers.DocumentBuilder;

public class Client {
    public void main() {

        F16Builder f16Builder = new F16Builder();
        Director director = new Director(f16Builder);
        director.construct(false);

        IAircraft f16 = f16Builder.getResult();

        // Other example
        StringBuilder str = new StringBuilder("a");
        str.append("bb");
        str.append("cc");
        str.toString();
    }
}
