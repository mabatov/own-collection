import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();

        System.out.println("Size: " + list.size());
        list.add(5);
        list.add(19);
        list.add(3);
        list.add(1);
        //System.out.println(list.get(1)); //throws exeption

        list.sort();

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        /*for(Integer i : list) {
            System.out.println(i);
        }*/
    }
}