package Solutions.src;

public class RemoveDuplicatesFromSortedArray {

    //Function

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0 ) return 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
        
    }

}
