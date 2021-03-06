import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        PriorityQueue q = new PriorityQueue(Collections.reverseOrder());
        int tmp;
        for(int i = 0; i < n; i++){
            tmp = Integer.parseInt(br.readLine().trim());
            if(tmp == 0){
                if(q.isEmpty()) System.out.println(0);
                else System.out.println(q.remove());
            }
            else q.add(tmp);
        }
    }
}