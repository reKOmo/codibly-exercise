package exercises;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BubbleSort {
    public static List<Comparable> sort(List<Comparable> input) throws Exception {
        if (input == null) {
            throw new Exception("Input can not be null");
        }

        List<Comparable> l = input.stream().filter(Objects::nonNull).collect(Collectors.toList());
        int length = l.size();

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (l.get(j).toString().compareTo(l.get(j + 1).toString()) > 0) {
                    Collections.swap(l, j,j + 1);
                }
            }
        }

        return l;
    }
}
