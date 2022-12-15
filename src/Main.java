import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    //Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream<Integer> massiv = Arrays.stream(array).filter(x -> x % 2 == 0).map(x -> x * x).sorted(Comparator.comparing(x->x));
        massiv.max(Comparator.comparing(x->x)).stream().toList().forEach(System.out::println);
    }
}