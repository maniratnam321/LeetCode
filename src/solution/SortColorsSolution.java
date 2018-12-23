package solution;

public class SortColorsSolution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length <= 1)    return;
        int lower = 0;
        int greater = nums.length - 1;
        int pivot = 1;
        int i = 0;

        while(i < greater) {
            if(nums[i] < pivot) {
                swap(nums, i++, lower++);
            }
            else if(nums[i] > pivot) {
                swap(nums, i, greater--);
            }
            else
                i++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
