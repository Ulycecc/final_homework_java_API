import java.util.*;
import java.lang.*;
class MySet {
    private static final HashMap<Integer, Object> myHashMap = new HashMap<>();
    private static final Object MYOBJ = new Object();
    public boolean add(int elem){//обавление нового элемента
        return myHashMap.put(elem, MYOBJ)==null;
    }
    public boolean del(int elem){//удаление элемента
        return myHashMap.remove(elem)==MYOBJ;
    }
    public boolean isEmpty(){//проверка наличия элементов
        return myHashMap.isEmpty();
    }
    public boolean contains(int elem){//проверка наличия конкретного элемента
        return myHashMap.containsKey(elem);
    }
    public int get (int index){
        Object[] els = myHashMap.keySet().toArray();
        return (int) els[index];
    }
    public Iterator<Integer> iterator(){
        return myHashMap.keySet().iterator();
    }
    public String toString() {
        return myHashMap.keySet().toString();
    }
}
public class Main {
    public static void main(String[] args) {
        MySet myset = new MySet();
        System.out.println("Проверяем .isEmpty()");
        System.out.println(myset.isEmpty());

        System.out.println("Проверяем .add() и .isEmpty()");
        System.out.println(myset.add(1));
        System.out.println(myset.isEmpty());

        System.out.println("Проверяем .contains()");
        System.out.println(myset.contains(1));
        System.out.println(myset.contains(2));

        System.out.println("Проверяем .del()");
        System.out.println(myset.del(1));
        System.out.println(myset.contains(1));
        System.out.println(myset.isEmpty());

        System.out.println("Заполняем множество");
        System.out.println(myset.add(1));
        System.out.println(myset.add(2));
        System.out.println(myset.add(3));

        System.out.println("Проверяем .get()");
        System.out.println(myset.get(2));
        System.out.println(myset.get(0));

        System.out.println("Проверяем .iterator()");
        Iterator<Integer> iterator = myset.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
        }

        System.out.println("Проверяем .toString()");
        System.out.println(myset.toString());

    }
}