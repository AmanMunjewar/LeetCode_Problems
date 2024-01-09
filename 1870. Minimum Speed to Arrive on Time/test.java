/**
 * test
 */
public class test {

    public int minSpeedOnTime(int[] dist, double hour) {
        int sum=0;

        for (int i : dist) {
            sum+=i;
        }

        int max_speed = (int) (sum/hour);
        int curr_time = 0;
        for (int i = 0; i < dist.length; i++) {
            int rem_dist = 0;
            curr_time +=  Math.ceil(dist[i]/max_speed);
            for (int j = i+1; j < dist.length; j++) {
                rem_dist += dist[j];
            }
            double rem_hours = hour -curr_time;
            if (rem_hours != 0) {
                max_speed = (int) (rem_dist/rem_hours);
            }
            System.out.println(max_speed);
        }

        return 0;
    }
    public static void main(String[] args) {
        test obj = new test();
        int dist[] = {1,1,100000};

        obj.minSpeedOnTime(dist, 2.01);

        
    }
}