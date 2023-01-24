import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OfficeWorkers implements Iterable<Object> {
    private List<Object> office = new ArrayList<>();

    public OfficeWorkers() {
        office = new ArrayList<Object>();
    }


    public List<Object> getOffice() {
        return office;
    }

    public void addNewWorker(Object object){
        office.add(object);
    }

    @Override
    public Iterator<Object> iterator() {
        return office.iterator();
    }

}


