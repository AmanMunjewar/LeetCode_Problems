import java.util.ArrayList;
import java.util.List;

public class Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[i]+nums[j]+nums[k] == 0) {
                        if (i!=j && i!=k && j!=k) {
                            List<Integer> inner_list = new ArrayList<>();
                            inner_list.add(nums[i]);
                            inner_list.add(nums[j]);
                            inner_list.add(nums[k]);
                            list.add(inner_list);
                        }
                    }
                }
            }
        } 
        return list;    
    }

    public static void main(String[] args) {
        int[] list = {-1,0,1,2,-1,-4};
        Sum sum = new Sum();
        System.out.println(sum.threeSum(list));

    }
}
