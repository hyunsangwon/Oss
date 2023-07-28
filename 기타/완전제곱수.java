import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 완전제곱수 {

    public static boolean isPerfectSquare(int n){
        //모든 완전제곱수는 1부터 시작하는 홀수의 합이라는 속성을 만족합니다.
        /*
        1 = 1
        4 = 1 + 3
        9 = 1 + 3 + 5
        16 = 1 + 3 + 5 + 7
        25 = 1 + 3 + 5 + 7 + 9
        … 
        */
        int x = 1;
        while(n > 0){
            n -= x;
            x += 2;
        }
        return n == 0;
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        String perfectSquare = "";
        int cnt = 0;
        for(int i=M; i<=N; i++){
            boolean isFlag = isPerfectSquare(i);
            if(isFlag){
               perfectSquare += String.valueOf(i)+",";
               ++cnt;
            } 
        }

       if(cnt > 0){
        String[] arr = perfectSquare.split(",");
        int sum = 0;
        int min = Integer.parseInt(arr[0]);
        for(String s : arr){
                int parseNum = Integer.parseInt(s);
                sum += parseNum;
                if(parseNum < min){
                    min = parseNum;
                }
        }
        System.out.println(sum);
        System.out.println(min);
       }else{
         System.out.println(-1);
       }
      
       br.close();
    }
}