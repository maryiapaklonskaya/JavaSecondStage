package GenericTypes;

public class Box<T> {
    private T item;
    public T getItem(){
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }

//    Box<T> t = new Box<>();
//    t.setItem(T key);
}
