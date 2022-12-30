package java_generics;

public class GenericStart <T>{
    private T obj;

    public GenericStart(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return  obj;
    }
}
