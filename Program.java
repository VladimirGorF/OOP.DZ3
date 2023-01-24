import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        OfficeWorkers office1 = new OfficeWorkers();

       Counter counter = new Counter("Masha", 22, 1300);
       FinDirector findir = new FinDirector("Petr", 25, counter);
        Director diric = new Director("Georgiy", 35, findir);
        Owner owner = new Owner("Vladimir", 41, diric);


        office1.addNewWorker(owner);
        office1.addNewWorker(diric);
        office1.addNewWorker(findir);
        office1.addNewWorker(counter);

        Iterator iter = office1.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        

        }
    }


