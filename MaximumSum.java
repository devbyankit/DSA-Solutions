
import java.util.*;
/**
 * The class provides a method to find the maximum element in
 * every contiguous sub-array of size k in a given integer array.
 * This is commonly known as the "Sliding Window Maximum" problem.
 */
public class MaximumSum {

        static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
            Deque<Integer> deque= new LinkedList<>();// Stores indices of maximum elements
            ArrayList<Integer> answer= new ArrayList<>();// Stores the result

            for(int i=0;i<arr.length;i++){
                // Remove elements that are out of the current window
                while(!deque.isEmpty() && deque.peekFirst()<i-k+1){
                    deque.pollFirst();
                }
                // Remove elements smaller than the current element from the back
                while(!deque.isEmpty() && arr[deque.peekLast()]<arr[i]){
                    deque.pollLast();
                }
                // Add the current element's index to the deque
                deque.addLast(i);
                // When the window size is reached, it records the max value at the front of deque
                if(i>=k-1){
                    answer.add(arr[deque.peekFirst()]);
                }
            }
            return answer;
        }
    }

