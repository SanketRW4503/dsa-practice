import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(5);

        arr.add(10);
        arr.add(110);
        arr.add(1110);
        arr.add(120);   
         arr.add(1210);
        
        System.out.println(arr);
        arr.remove(1);
        System.out.println("Size of the array is "+arr.size());

    }
}
