import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        HashSet<String> dic = new HashSet<>();
        String[] M = new String[Integer.parseInt(st.nextToken())];


        for (int i = 0; i< N; i++){
            dic.add(br.readLine());
        }

        for (int i = 0; i< M.length; i++){
            M[i] = br.readLine();
        }
        
        int answer = 0;
        for (String s : M) {
            if (dic.contains(s)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}