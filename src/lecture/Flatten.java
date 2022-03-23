package lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flatten {
    static List<Integer> flatten(List<Object> elements) {
        List<Integer> result = new ArrayList<>();
        for(Object ele: elements) {
            if (ele instanceof Integer) {
                result.add((Integer) ele);
            } else {
                result.addAll(flatten((List<Object>) ele));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Object> list1 = Arrays.asList(2, 3);
        List<Object> list2 = Arrays.asList(list1, 4);
        List<Object> list3 = Arrays.asList(1, list2, list1);
        List<Integer> out = flatten(list3);
        System.out.println(out);
    }
}

