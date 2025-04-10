package Introduction;

public class GarbageCollector_Finalize {
    public static void main(String[] args) {
        Class obj ;
        for(long i = 0;i<10000000000000l;i++){
            obj = new Class();
        }
    }
}

class Class {
    int marks;
//finalize is a methoD that will allow us to tell the garbage collector
// to execute the code block within the function when the objects are destroyed by GC
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object was destroyed");
    }
}
