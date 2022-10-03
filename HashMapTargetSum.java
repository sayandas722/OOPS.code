import java.util.HashMap;

// Program using a HashMap to find the target sum given an array of numbers.
// Here the target sum is 25 so we are attempting to locate two numbers
// from our array which when added together equal 25.

public class HashMapTargetSum {

    public static void main(String[] args) {
        findTargetSum(25);
    }

    private static void findTargetSum(int targetSum) {
        int[] arr = {1, 3, 4, 7, 8, 12, 20, 21, 22, 25, 27}; // Create an array of numbers to search through for our target sum.
        HashMap<Integer, Boolean> map = new java.util.HashMap<>(); // Create our HashMap to store our results while searching through our array.
        for(int num : arr) { // Search through each value in our array
            int diff = targetSum - num; // Find the difference between our target sum and the integer value from our current index in the array.
            if(map.containsKey(diff)) { // If our HashMap already contains the difference from line 17, then we have found two numbers that add up to our target sum.
                System.out.println("Target sum found: " + num + " + " + diff);
                return;
            } else {
                map.put(num, true); // If our HashMap does not contain the difference from line 17, we will store the integer value from our current index in the array.
                System.out.println(num + " added to HashMap");
            }
        }
        System.out.println("Did not find target sum in the array"); // If we do not find two numbers whose sum is equal to our target number we will print a message out.
    }
}

