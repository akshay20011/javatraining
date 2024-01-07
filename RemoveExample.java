import java.util.ArrayList;
   import java.util.List;

   public class BooleanRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        boolean elementsRemoved = removeElements(numbers, num -> num % 2 == 0);

        System.out.println("Elements removed: " + elementsRemoved); 
        System.out.println(numbers); 
    }

    private static boolean removeElements(List<Integer> list, Condition<Integer> condition) {
        boolean elementsRemoved = list.removeIf(element -> condition.test(element));
        return elementsRemoved;
    }

    interface Condition<T> {
        boolean test(T element);
    }
}
   
