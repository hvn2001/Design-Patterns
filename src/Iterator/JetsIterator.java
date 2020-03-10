package Iterator;

import java.util.List;

public class JetsIterator implements Iterator<IAircraft> {
    public JetsIterator(List<IAircraft> jets) {
    }

    @Override
    public IAircraft next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
