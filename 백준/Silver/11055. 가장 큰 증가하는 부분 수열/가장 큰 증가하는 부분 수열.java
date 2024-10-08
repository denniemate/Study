import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        int[]  arr = new int[n];
        int[]  dp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        for (int i = 1; i < n; i++){
            dp[i] = arr[i];
            for (int j = 0; j < i; j++){
                if(arr[i] > arr[j])
                    dp[i] = Math.max(dp[j] + arr[i], dp[i]);
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++){
            if(dp[i] > max) {
                max = dp[i];
            }
        }

        System.out.println(max);
    }
}