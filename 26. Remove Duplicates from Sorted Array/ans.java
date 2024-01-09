/**
 * ans
 */
public class ans {

    public int missingInteger(int[] nums) {
        int result=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]+1) {
                result += nums[i];
            }  
        }
        while (checkArr(nums, result)) {
            result++;
        }
        return result;
    }

    public boolean checkArr(int nums[], int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    public int removeDuplicates(int[] nums) {
        int uni_num=1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[uni_num] = nums[i+1];
                uni_num++;
            }
        }
        return uni_num;
    }
    public static void main(String[] args) {
        ans a = new ans();
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        //System.out.println(a.removeDuplicates(arr));
        int nums[] = {4,5,6,7,8,8,9,4,3,2,7};
        System.out.println(a.missingInteger(nums));
    }
}