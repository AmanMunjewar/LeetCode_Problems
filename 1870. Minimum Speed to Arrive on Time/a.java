class sole {
    public int minSpeedOnTime(int[] dist, double hour) {
        int num = dist.length-1;
        if(hour - num<0){
            return -1;
        }
        int sum=0;

        for (int i : dist) {
            sum+=i;
        }

        int max_speed = (int) (sum/hour);
        double curr_time;

        while (true) {
            curr_time=0;
            for (int i = 0; i < num; i++) {
                curr_time += Math.ceil(((double)dist[i])/max_speed);
                int rem_dist = 0;
                for (int j = i+1; j < dist.length; j++) {
                    rem_dist+=dist[j];
                }
                max_speed = rem_dist/(int)(hour);
                if (curr_time>hour) {
                    break;
                }
            }
            curr_time += ((double)dist[num])/max_speed;
            if (curr_time<=hour) {
                return max_speed;
            }
            max_speed++;
        }
    }
}

/**
 * a
 */
public class a {

    public static void main(String[] args) {

        sole sol = new sole();
        int arr[] = {1,3,2};
        
        if (sol.minSpeedOnTime(arr, 1.9) == -1) {
            System.out.println("Task 1 pass");
        }

        int arr1[] = {1,3,2};
        
        if (sol.minSpeedOnTime(arr1, 6) == 1) {
            System.out.println("Task 2 pass");
        }

        int arr3[] = {1,3,2};
        
        if (sol.minSpeedOnTime(arr3, 2.7) == 3) {
            System.out.println("Task 3 pass");
        }

        int arr4[] = {1,1,100000};
        
        if (sol.minSpeedOnTime(arr4, 2.01) == 10000000) {
            System.out.println("Task 4 pass");
        }
    }
}