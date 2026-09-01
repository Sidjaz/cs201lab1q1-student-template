import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    public static int findMax(Integer[] input) {
        int max = input[0];

        for (int num : input) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static Integer[] findDuplicates(Integer[] input) {
        ArrayList<Integer> dupes = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int count = 0;

            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j])) {
                    count++;
                }
            }
            if (count > 1 && !dupes.contains(input[i])) {
                dupes.add(input[i]);
            }
        }
        return dupes.toArray(new Integer[0]);
    }

    public static Integer[] findUnique(Integer[] input) {
        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int count = 0;

            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j])) {
                    count++;
                }
            }
            if (count == 1) {
                unique.add(input[i]);
            }
        }
        return unique.toArray(new Integer[0]);
    }
}
