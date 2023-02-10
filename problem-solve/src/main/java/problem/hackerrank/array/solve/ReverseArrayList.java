package problem.hackerrank.array.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayList {

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 4, 3, 2);
        List<Integer>  reversed = reverseArray(arr);
        System.out.println(Arrays.toString(reversed.toArray()));
    }

    static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> revArray = new ArrayList<>();
        for(int i= a.size()-1;i>=0;i--){
            revArray.add(a.get(i));
        }
        return revArray;
    }
}
