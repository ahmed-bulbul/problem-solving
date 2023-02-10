package problem.hackerrank.array.practice;

import java.util.List;

public class HourGlass2DArray {

    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
                List.of(1, 1, 1, 0, 0, 0),
                List.of(0, 1, 0, 0, 0, 0),
                List.of(1, 1, 1, 0, 0, 0),
                List.of(0, 0, 2, 4, 4, 0),
                List.of(0, 0, 0, 2, 0, 0),
                List.of(0, 0, 1, 2, 4, 0)
        );

        System.out.println("Array Size : "+arr.size());
        System.out.println(arr.get(0).size());
        System.out.println(arr.get(1));

        int result = hourglassSum(arr);
        System.out.println(result);
    }

     static int hourglassSum(List<List<Integer>> arr) {

        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.size()-2;i++){
            for(int j=0;j<arr.get(i).size()-2;j++){
                int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                        + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;


    }
}
