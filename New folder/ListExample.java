
   import java.util.ArrayList;
   import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.remove(Integer.valueOf(3));
        System.out.println("List after removing element: " + numbers);
    }}
